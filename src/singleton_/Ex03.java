package singleton_;
class Test03{
	int num;
	static int n;
	public static void test1() {
		n = 1000;
	}
	public void test() {
		n = 1000;
	}
}
public class Ex03 {
	public static void main(String[] args) {
		Test03.n = 1000;
		System.out.println( Test03.n );
		
		Test03 t01 = new Test03();
		Test03 t02 = new Test03();
		
		t01.n = 12345;
		System.out.println( Test03.n );
		System.out.println( t01.n );
		System.out.println( t02.n );
		
		/*
		Test03 t01 = new Test03();
		Test03 t02 = new Test03();
		t01.num = 1000; t02.num = 2000;
		System.out.println(t01.num);
		System.out.println(t02.num);
		*/
	}
}






