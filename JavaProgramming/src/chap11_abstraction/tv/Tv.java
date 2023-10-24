package chap11_abstraction.tv;

public abstract class Tv {
	public int lastChannel;
	
	// 추상클래스의 생성자는 자식클래스에서 사용 가능하다. *** 추상클래스에서 생성자 못 만드는거 아님 *** 
//	public Tv()	{
//		lastChannel = 1;
//	}
//	public Tv (int lastChannel)	{
//		this.lastChannel = lastChannel;
//	}
	
	public abstract void powerOn();
	public abstract void powerOff();
	public abstract void operate(int channel);
	public abstract void moveTo(int channel);
	public abstract void channelUp();
	public abstract void channelDown();
	
}
