package com.javaex.ex03;

public class SoundApp {

	public static void main(String[] args) {
		printSound( new Cat() );
		printSound( new Dog() );
		printSound( new Sparrow() );
		printSound( new Duck() );
	}

	public static void printSound( Soundable soundable ) {
		//구현
		System.out.println(soundable.sound());
		// --> soundable에 있는 sound() 출력 --> override 돼서 각 하위 클래스의 sound() 출력

		/* 이상한 시도...

		Soundable[] soundArray = {
				new Cat(),
				new Dog(),
				new Sparrow(),
				new Duck()
		};

		for (int i = 0; i < soundArray.length; i++ ) {
			System.out.println(soundArray[i].sound());
		}
		 */
	}

}


