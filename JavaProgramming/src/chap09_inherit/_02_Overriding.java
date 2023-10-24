package chap09_inherit;

import chap09_inherit.animal.Tiger;
import chap09_inherit.animal.Bird;

public class _02_Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tiger tiger = new Tiger();
		
		tiger.eat();
		tiger.sleep();
		
		Bird bird = new Bird();
		bird.eat();
		bird.sleep();
	}

}
