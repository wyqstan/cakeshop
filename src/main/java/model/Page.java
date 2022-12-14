package model;

import java.util.List;

//分页数据模型
public class Page {
	private int pageNo;//当前页数
	private int pageSize;//每页显示多少条数据
	private int totalCount;//总记录数 数据总个数
	private int totalPage;//总页数
	private List<Object> list;
	
	
	public void setPageSizeAndTotalCount(int pageSize,int TotalCount) {
		//每页显示多少个总记录数
		this.pageSize=pageSize;
		this.totalCount=TotalCount;
		totalPage=(int)Math.ceil((double)totalCount/pageSize);
		
	}
	
	
	
	public int getPageNo() {
		return pageNo;
	}



	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}



	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public List<Object> getList() {
		return list;
	}
	public void setList(List<Object> list) {
		this.list = list;
	}
	


}
