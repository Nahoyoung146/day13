package lamda_;
interface Int01{
	public void test();
}
class Test01 implements Int01{
	@Override
	public void test() {
		
	}
}

interface Int01_1{
	public void test();
	//public void test111();
}
public class Ex01 {
	public static void main(String[] args) {
		Int01_1 int01 = new Int01_1() {
			@Override
			public void test() {
				System.out.println(1111);
			}
		};
		int01.test();
		Int01_1 int02 = () -> System.out.println("안녕하세요");
		int02.test();
	}
}











