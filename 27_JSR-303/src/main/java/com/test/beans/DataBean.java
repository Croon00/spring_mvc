package com.test.beans;

import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class DataBean {
	// true가 아닌 값이 들어오면 오류
	@AssertTrue
	private Boolean data1;
	
	// false가 아닌 값이 들어오면 오류
	@AssertFalse
	private Boolean data2;
	
	// Max: 정해진 값보다 크면 오류
	// Min: 정해진 값보다 작으면 오류
	@Max(100)
	@Min(10)
	private Integer data3;
	
	// DemicalMax : 지정한 값보다 크면 오류, inclusive에 false를 설정하면
	// 같아도 오류.
	// DemicalMin : 지정한 값보다 작으면 오류, inclusive에 false를 설정하면
	// 같아도 오류.
	@DecimalMax(value = "100", inclusive = false)
	@DecimalMin(value = "10", inclusive = false)
	private Integer data4;

	// Null : 값이 주입되면 오류 발생
	// data5 라는 이름의 파라미터가 전달되면 오류
	@Null
	private String data5;
	
	// NotNull : null이 주입되면 오류 발생
	// data6 이라는 이름의 파라미터가 전달되지 않으면 오류
	@NotNull
	private String data6;
	
	// 지정한 숫자의 자리수를 넘어서면 오류
	// integer : 정수자리수
	// fraction : 소수점 이하 자리수
	@Digits(integer = 3, fraction = 3)
	private Double data7;
	
	// 글자수
	// min : 최소 수
	// max : 최대 수
	@Size(min = 3, max = 10)
	private String data8;
	
	// 정규식에 위배가 되면 오류
	@Pattern(regexp = "[a-zA-Z]*")
	private String data9;
	
	
	public DataBean() {
		this.data1 = true;
		this.data2 = false;
		this.data3 = 50;
		this.data4 = 50;
		this.data6 = "check2";
		this.data7 = 50.50;
		this.data8 = "문자열";
	}
	
	
	
	public Integer getData3() {
		return data3;
	}
	
	public void setData3(Integer data3) {
		this.data3 = data3;
	}
	
	public Boolean getData2() {
		return data2;
	}
	
	public void setData2(Boolean data2) {
		this.data2 = data2;
	}
	
	public Boolean getData1() {
		return data1;
	}

	public void setData1(Boolean data1) {
		this.data1 = data1;
	}
	
	public Integer getData4() {
		return data4;
	}
	
	public void setData4(Integer data4) {
		this.data4 = data4;
	}
	
	public String getData5() {
		return data5;
	}
	
	public void setData5(String data5) {
		this.data5 = data5;
	}

	public String getData6() {
		return data6;
	}

	public void setData6(String data6) {
		this.data6 = data6;
	}

	public Double getData7() {
		return data7;
	}
	
	public void setData7(Double data7) {
		this.data7 = data7;
	}

	public String getData8() {
		return data8;
	}

	public void setData8(String data8) {
		this.data8 = data8;
	}

	public String getData9() {
		return data9;
	}

	public void setData9(String data9) {
		this.data9 = data9;
	}
	
	
	
}
