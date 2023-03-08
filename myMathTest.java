
public class myMathTest {

	public static void main(String[] args) {
		
		//메소드 명이 같아도 매개 변수가 다르기 때문에 다른 메소드로 구분함.(메소드 오버로딩)
		MyMath obj = new MyMath();
		System.out.println(obj.square(10));
		System.out.println(obj.square(3.14));

	}

}
