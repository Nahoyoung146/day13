package abstract_;

interface A02{
	public void test();
	public int test2();
}
class B02 implements A02{
	public void test() {
		System.out.println("test 실행");
	}
	public int test2() {
		System.out.println("test22 실행");
		return 0;
	}
}
public class Ex02 {
public static void main(String[] args) {
	B02 b = new B02();
	b.test();
	b.test2();
}
}










