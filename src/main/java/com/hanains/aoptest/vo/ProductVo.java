package com.hanains.aoptest.vo;

public class ProductVo {
	private String name;

	public ProductVo() {
		// TODO Auto-generated constructor stub
	}

	public ProductVo( String name ) {
		this.name = name;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ProductVo [name=" + name + "]";
	}

}
