package com.bespeak.common;

/**
 * 分页Bean
 * @author cedo
 *
 */
public class PageBean {

	//起始页
	private Integer start;
	
	//每页大小
	private Integer count;
	
	//当前页
	private Integer currentPage;

	public Integer getStart() {
		return (currentPage-1)*count;
	}

	public void setStart(Integer start) {
		this.start = start;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	
	
}
