package singleton_;

class Test04{
	int num;
	public static Test04 t; // t = new Test04();
	private Test04() {
		System.out.println("객체생성!!!");
	}
	public static Test04 test() {//getInstance
		if(t == null)
			t = new Test04();
		else
			System.out.println("객체 있습니다.");
		return t;
	}
}
public class Ex04 {
public static void main(String[] args) {
	System.out.println("생성 전 : "+Test04.t);
	Test04 t01 = Test04.test();
	Test04 t02 = Test04.test();
	
	System.out.println("t01 : "+t01);
	System.out.println("t02 : "+t02);
	t01.num = 12345;
	System.out.println("t01 : "+t01.num );
	System.out.println("t02 : "+t02.num );
	
	System.out.println("생성 후 : "+Test04.t);
	
	//System.out.println( Test04.t );
}
}








