package chap11_abstraction;

import chap11_abstraction.tv.SamsungTv;
import chap11_abstraction.tv.Tv;

public class _02_AbstractionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv tv = new SamsungTv(11);
		tv.powerOn();
		tv.powerOff();
		tv.operate(120);
	}

}