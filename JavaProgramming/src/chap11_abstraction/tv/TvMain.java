package chap11_abstraction.tv;

public class TvMain extends Tv	{
	
	public int lastChannel;
	
	public TvMain()	{
		lastChannel = 1;
	}
	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("Tv의 전원을 켭니다.");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("Tv의 전원을 끕니다.");
	}

	@Override
	public void operate(int channel) {
		// TODO Auto-generated method stub
		lastChannel = channel;
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
		lastChannel++;
	}

	@Override
	public void channelDown() {
		// TODO Auto-generated method stub
		lastChannel--;
	}
	
	
	
}

