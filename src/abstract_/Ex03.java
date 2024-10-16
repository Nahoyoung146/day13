package abstract_;

class A03지상군{
	public void 총알장전() {
		System.out.println("총알장전");
	}
	public void 공격() {
		System.out.println("지상군이 공격합니다");
	}
	public void 방어() {
		System.out.println("지상군이 방어합니다");
	}
}
class B03공군{
	public void attack() {
		System.out.println("비행기가 공격합니다");
	}
	public void defense() {
		System.out.println("비행기가 방어합니다");
	}
}
public class Ex03 {
public static void main(String[] args) {
	A03지상군 a = new A03지상군();
	B03공군 b = new B03공군();
	a.공격();
	b.defense();
}
}









