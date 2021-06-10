package com.javaex.ex02;

public class BirdApp {

	public static void main(String[] args) {
		Bird bird01 = new Duck(); // classTypeChange
		bird01.setName("꽥꽥이"); // Bird.setName()
		bird01.fly(); // override_Duck.fly()
		bird01.sing(); // override_Duck.sing()
		bird01.showName(); // override_Duck.showName()

		Bird bird02 = new Sparrow(); // classTypeChange
		bird02.setName("짹짹이"); // Bird.setName()
		bird02.fly(); // override_Sparrow.fly()
		bird02.sing(); // override_Sparrow.sing()
		bird02.showName(); // override_Sparrow.showName()
	}

}
