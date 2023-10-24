package chap11_abstraction.tv;

public class SamsungTv extends Tv	{
	
public int lastChannel;
	
	public SamsungTv()	{
		lastChannel = 1;
	}
	public SamsungTv (int lastChannel)	{
		this.lastChannel = lastChannel;
	}
	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("제조사 : Samsung Tv의 전원을 켭니다.");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("제조사 : Samsung Tv의 전원을 끕니다.");
	}

	@Override
	public void operate(int channel) {
		// TODO Auto-generated method stub
		this.lastChannel = channel;
		moveTo(channel);
	}

	@Override
	public void moveTo(int channel) {
		// TODO Auto-generated method stub
		System.out.println("채널 " + channel + " 로 이동합니다.");
	}

	@Override
	public void channelUp() {
		// TODO Auto-generated method stub
		this.lastChannel++;
	}

	@Override
	public void channelDown() {
		// TODO Auto-generated method stub
		this.lastChannel--;
	}
}
