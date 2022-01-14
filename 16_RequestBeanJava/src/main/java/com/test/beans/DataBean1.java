package com.test.beans;

public class DataBean1 {
	
	private String data1;
	private String data2;
	
	public DataBean1() {
		System.out.println("DataBean1의 생성자");
	}
	public String getData1() {
		return data1;
	}
	public void setData1(String data1) {
		this.data1 = data1;
	}
	public String getData2() {
		return data2;
	}
	public void setData2(String data2) {
		this.data2 = data2;
	}
	
	
	
}
