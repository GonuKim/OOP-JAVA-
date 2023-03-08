
public class TelevisionTest {

	public static void main(String[] args) {
		
//		Television myTv = new Television();
//		myTv.channel = 7;
//		myTv.volume = 9;
//		myTv.onOff = true;
//		
//		Television yourtv = new Television();
//		yourtv.channel = 9;
//		yourtv.volume = 12;
//		yourtv.onOff = true;
//		System.out.println("나의 텔레비전의 채널은 " + myTv.channel + "이고 볼륨은 " + myTv.volume
//				+ "입니다.");
//		System.out.println("너의 텔레비전의 채널은 " + yourtv.channel + "이고 볼륨은 " + yourtv.volume
//				+ "입니다.");
//		
//		int x = 10; int y = 20;
//		y = x; //y에 x값을 대입

//		Television tv1 = new Television();
//		Television tv2 = tv1;
//		
//		tv1.channel = 11;
//		System.out.println(tv1.channel);
//		System.out.println(tv2.channel); // 11이 출력 됨.
	
//		Television tv1 = new Television();
//		Television tv2 = tv1;
//		Television tv3 = new Television();
//		tv2 = tv3; // tv2는 tv3의 값을 가리키게 됨

//		Television myTv = new Television();
//		myTv.channel = 7;
//		myTv.volume = 9;
//		myTv.onOff = true;
		//myTv.print(); // Television클래스에 프린트 메소드를 생성해놔서 채널은 7 볼륨은 9입니다.가 출력
		
	
//		int ch = myTv.getChannel(); //채널 값을 반환하는 메소드여서 ch에 7이 들어감.
//		System.out.println("현재 채널은 " + ch + "입니다.");
		
//		Television myTv = new Television();
//		myTv.setChannel(11);
//		int ch = myTv.getChannel();
//		System.out.println("현재 채널은 " + ch + " 입니다.");
		
		Televison myTv = new Televison(7, 10, true);
		myTv.print();
		Television  yourTv = new Television(11, 20, true);
		yourTv.print();
	}

}
