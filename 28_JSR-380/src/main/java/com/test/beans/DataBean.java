package com.test.beans;

import javax.validation.constraints.Email;
import javax.validation.constraints.Negative;
import javax.validation.constraints.NegativeOrZero;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;

public class DataBean {

	// 길이가 0인 문자열이 들어오면 오류
	// 공백도 글자로 인식한다.
	@NotEmpty
	private String data1;
	
	// 길이가 0인 문자열이 들어오면 오류
	// 문자열 좌우 공백은 제거한다
	// 스페이스만 있을 경우 길이를 0으로 취급한다.
	@NotBlank
	private String data2;
	
	// 양수가 아니라면 오류(0도 오류)
	@Positive
	private Integer data3;
	
	// 
	@PositiveOrZero
	private Integer data4;
	
	// 음수가 아니라면 오류(0도 오류)
	@Negative
	private Integer data5;
	
	@NegativeOrZero
	private Integer data6;
	
	// 이메일 양식이 아니라면 오류
	// 중간에 @가 있는지 정도만 본다
	@Email
	private String data7;
	
	public DataBean() {
		this.data1 = "문자열1";
		this.data2 = "문자열2";
		this.data3 = 100;
		this.data4 = 100;
		this.data5 = -100;
		this.data6 = -100;
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

	public Integer getData3() {
		return data3;
	}

	public void setData3(Integer data3) {
		this.data3 = data3;
	}

	public Integer getData4() {
		return data4;
	}

	public void setData4(Integer data4) {
		this.data4 = data4;
	}

	public Integer getData5() {
		return data5;
	}

	public void setData5(Integer data5) {
		this.data5 = data5;
	}

	public Integer getData6() {
		return data6;
	}

	public void setData6(Integer data6) {
		this.data6 = data6;
	}

	public String getData7() {
		return data7;
	}

	public void setData7(String data7) {
		this.data7 = data7;
	}
	
	
}
