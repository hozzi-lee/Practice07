package com.javaex.ex01;

public class Rectangle extends Shape{

	private int width;
	private int height;

	public Rectangle(String fillColor, int width, int height){
		super(fillColor);
		this.width=width;
		this.height=height;
	}


	// method getter 추가
	public int getWidth() {
		return width;
	}

	public void showInfo() {
		System.out.println("[사각형]#면색:" +super.fillColor+ " "
				+ " #가로:" + width 
				+" #세로:" + height + "그렸습니다.");                                                                        
	}

	// draw() 추가
	public void draw() {
		System.out.println("[사각형]#면색:" +super.fillColor+ 
				"  #가로:" + width + " #세로:" + height + " 그렸습니다.");
	}


}


