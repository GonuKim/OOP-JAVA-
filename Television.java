
public class Television {
	int channel;
	int volume;
	boolean onOff;
	
	Televison(int c, int v, boolean o){
		channel = c;
		volumn = v;
		onOff = o;
	}
	
	
	
	
	
	
	void print () {
		System.out.println("채널은 " + channel + "볼륨은 " + volume + "입니다.");
	}
	
	//채널의 값을 반환하는 메소드
	int getChannel() { 
		return channel; 
	}
	
	void setChannel (int ch) {
		channel = ch;
	}
	
}
