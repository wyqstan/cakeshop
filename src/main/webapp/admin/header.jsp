<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>


<nav class="navbar navbar-default" role="navigation">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="http://localhost/shopping_online/admin/admin_index.jsp">蛋糕店后台</a>
			</div>
			<div>
				<ul class="nav navbar-nav">
					<li ><a href="http://localhost/shopping_online/admin/order_list?pageNo=1&status=0">订单管理</a></li>
					<li ><a href="http://localhost/shopping_online/admin/user_list">客户管理</a></li>
					<li ><a href="http://localhost/shopping_online/admin/goods_list">商品管理</a></li>
					<li ><a href="http://localhost/shopping_online/admin/type_list">类目管理</a></li>
					<li><a href="http://localhost/shopping_online/user_logout">退出</a></li>
				</ul>
			</div>
		</div>
	</nav>