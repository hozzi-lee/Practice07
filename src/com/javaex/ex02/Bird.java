package com.javaex.ex02;

public abstract class Bird {

	// field
	private String name;


	// method getter_setter 작성
	public void setName(String name) {
		this.name = name;
	}
	protected String getName() {
		return name;
	}

	// method
	public abstract void sing();

	public abstract void fly();

	public abstract void showName();


}

// sing 울다
// fly 날다
// setName 이름
// protected getName
// 전체 출력 문자 showName