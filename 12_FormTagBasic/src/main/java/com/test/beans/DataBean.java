package com.test.beans;

public class DataBean {

	// 데이터를 담을 때 기본자료형은 사용금지 --> 레퍼 클래스 사용
	// 변수에 null 값이 들어간 경우를 이용하려 하는데 int에는 null 값이 적용 x
	private Integer data1;
	private Integer data2;
	private Integer data3;
	public Integer getData1() {
		return data1;
	}
	public void setData1(Integer data1) {
		this.data1 = data1;
	}
	public Integer getData2() {
		return data2;
	}
	public void setData2(Integer data2) {
		this.data2 = data2;
	}
	public Integer getData3() {
		return data3;
	}
	public void setData3(Integer data3) {
		this.data3 = data3;
	}
	
	
}
