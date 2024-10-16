package abstract_;
class A05{
	public void test() {}
}
class B05 extends A05{
	public void test() {
		System.out.println("오버라이딩");
	}
	public void aaa() {}
	public void bbb() {}
}
public class Ex05 {
	public static void main(String[] args) {
		A05 b = new B05();
	}
}







