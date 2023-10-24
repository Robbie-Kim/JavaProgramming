package chap10_polymorphism.tv;

public class Tv {
	public int lastChannel;
	
	public Tv()	{
		lastChannel = 1;
	}
	
	public void powerOn()	{
		System.out.println("TV의 전원을 켭니다.");
	}
	
	void powerOff()	{
		System.out.println("TV의 전원을 끕니다.");
	}
	
	public void operate(int channel)	{
		lastChannel = channel;
		moveTo(channel);
	}
	
	public void moveTo(int channel) {
		System.out.println("채널 " + channel + " 로 이동합니다.");
	}
	
	private void channelUp()	{
		lastChannel++;
	}
	
	public void channelDown()	{
		lastChannel--;
	}
}
