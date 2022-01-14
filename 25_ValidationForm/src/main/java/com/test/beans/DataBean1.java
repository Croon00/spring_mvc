package com.test.beans;

import javax.validation.constraints.Max;
import javax.validation.constraints.Size;

public class DataBean1 {

	@Size(min = 2, max = 10)
	private String data1;
	
	@Max(100)
	private Integer data2;
	
	public String getData1() {
		return data1;
	}
	public void setData1(String data1) {
		this.data1 = data1;
	}
	public Integer getData2() {
		return data2;
	}
	public void setData2(Integer data2) {
		this.data2 = data2;
	}
	
	
}
