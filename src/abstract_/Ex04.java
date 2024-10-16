package abstract_;
class A04지상군 implements Army04{
	public void attack() {
		attack1();
		attack2();
		System.out.println( "지상군이 공격합니다!!" );
	}
	public void attack1() { 
		System.out.println( "총알 장전" );}
	public void attack2() { 
		System.out.println( "총들어" );}
	public void defense() { }
}
class B04공군 implements Army04{
	public void attack() { }
	public void defense() {	}
}
public class Ex04 {
public static void main(String[] args) {
	Army04 a = new A04지상군();
	a.attack();

}
}








