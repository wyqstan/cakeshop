package servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.mchange.v2.codegen.bean.BeangenUtils;

import model.Order;
import model.User;
import service.OrderService;

/**
 * Servlet implementation class OrderConfirmServlet
 */
@WebServlet("/order_confirm")
public class OrderConfirmServlet extends HttpServlet {
	
	
	
	private OrderService oService=new OrderService();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrderConfirmServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Order o=(Order) request.getSession().getAttribute("order");
		String name=request.getParameter("name");
		String phone=request.getParameter("phone");
		String address=request.getParameter("address");
		o.setName(name);
		o.setAddress(address);
		o.setPhone(phone);
		o.setDatetime(new Date());
		o.setStatus(2);
		o.setUser((User) request.getSession().getAttribute("user"));
		
		oService.addOrder(o);
		request.getSession().removeAttribute("order");
		
		
		request.setAttribute("msg", "订单支付成功!");
		request.getRequestDispatcher("/order_success.jsp").forward(request, response);
		
	}

}
