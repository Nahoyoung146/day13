package list_.common;

import java.util.Scanner;

import list_.김개똥.ServiceTest;
import list_.홍길동.MemberService;
import list_.홍길동.MemberStatic2;

public class MainClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		
		//MemberService ms = new MemberService();
		MemberStatic2 ms = new MemberStatic2();
		ServiceTest st = new ServiceTest(); 
		while(true) {
			System.out.println("1.번 팀");
			System.out.println("2.번 팀");
			System.out.println("3.번 팀");
			num = input.nextInt();
			switch (num) {
			case 1:	
				ms.display();
				break;
			case 2:	
				st.display();
				//st.display( ms.getMember() );
				break;
			case 3:	break;
			}
		}
	}
}







