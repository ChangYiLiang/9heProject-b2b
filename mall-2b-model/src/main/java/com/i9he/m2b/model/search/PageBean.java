package com.i9he.m2b.model.search;

/**
 * 分页实体
 * @author 
 *
 */
public class PageBean {

	private int page; // 第几页
	private int pageSize; // 页面大小
	@SuppressWarnings("unused")
	private int start;  // 起始页
	
	
	public PageBean(int page, int pageSize) {
		super();
		this.page = page;
		this.pageSize = pageSize;
	}
	
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	
	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getStart() {
		return (page-1)*pageSize;
	}
	
	
}
