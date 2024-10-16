package abstract_;

import java.util.Scanner;

class A06지상군 implements Army04{
	@Override
	public void attack() {
		System.out.println("지상군 공격");
	}
	@Override
	public void defense() {
		System.out.println("지상군 방어");
	}
}
class B06공군 implements Army04{
	@Override
	public void attack() {
		System.out.println("비행기 공격");
	}
	@Override
	public void defense() {
		System.out.println("비행기 방어");
	}
}
public class Ex06 {
	public static void main(String[] args) {
		Scanner input = new Scanner( System.in);
		//A06지상군 a = new A06지상군();
		//B06공군 b = new B06공군();
		Army04 army = null;
		System.out.println("적이 처들어왔습니다");
		System.out.println("1.지상군, 2.공군");
		int choice = input.nextInt();
		if(choice == 1) {
			System.out.println("지상군이 선택 되었습니다");
			army = new A06지상군();
		}else {
			army = new B06공군();
			System.out.println("공군 선택되었습니다");
		}
		System.out.println("1.공격, 2.방어");
		int num = input.nextInt();
		if( num == 1 ) {
			army.attack();
		}else if(num == 2 ) {
			army.defense();
		}
		/*
		if(choice == 1 && num == 1) {
			a.attack();
		}else if(choice == 1 && num == 2) {
			a.defense();
		}
		if(choice == 2 && num == 1) {
			b.attack();
		}else if(choice == 2 && num == 2) {
			b.defense();
		}
		*/
	}
}









