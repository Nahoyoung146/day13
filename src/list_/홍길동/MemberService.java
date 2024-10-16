package list_.홍길동;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberService {
	Scanner input = new Scanner(System.in);
	private ArrayList<MemberDTO> member;
	
	public ArrayList<MemberDTO> getMember() {
		return member;
	}
	
	public MemberService() {
		member = new ArrayList<MemberDTO>();
	}
	public void register() {
		//Scanner input = new Scanner(System.in);
		MemberDTO dto = new MemberDTO();
		String name, addr;
		System.out.println("등록 이름 입력");
		name = input.next();
		System.out.println("등록 주소 입력");
		addr = input.next();
		
		dto.setName(name);
		dto.setAddr(addr);
		
		member.add(dto);
		System.out.println("가입 완료");
	}
	public void memberView() {
		for(int i = 0 ; i <member.size() ; i++ ) {
			MemberDTO d = member.get(i);
			System.out.println("이름 : "+d.getName() );
			System.out.println("주소 : "+d.getAddr() );
			System.out.println("----------------");
		}
	}
	public void display() {
		//Scanner input = new Scanner(System.in);
		int num;
		while(true) {
			System.out.println("1.모든 회원 보기");
			System.out.println("2.회원가입");
			System.out.println("3.뒤로가기");
			num = input.nextInt();
			switch(num) {
				case 1: 
					memberView();
					break;
				case 2: 
					register();
					break;
				case 3: return;
			}
		}
	}
}








