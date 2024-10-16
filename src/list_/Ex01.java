package list_;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		ArrayList< MemberDTO > member = 
							new ArrayList<MemberDTO>();
		MemberDTO dto01 = new MemberDTO("홍길동",20);
		member.add( dto01 );
		
		MemberDTO dto02 = new MemberDTO();
		dto02.setName("고길동");
		dto02.setAge( 30 );
		
		member.add(dto02);
		System.out.println("member : "+member);
		System.out.println( dto01 );
		System.out.println("------------");
		
		MemberDTO d = member.get(1);
		System.out.println("name : "+d.getName() );
		System.out.println("age : "+d.getAge() );
		System.out.println("바로 name : " + 
								member.get(0).getName() );
		System.out.println("바로 age : " + 
								member.get(0).getAge() );
		//Scanner sc = new Scanner(System.in);
		//String n = sc.next();
		//String n = new Scanner(System.in).next();
		//System.out.println("n : " + n);
		
		System.out.println("===============");
		/*
		ArrayList<String> s = new ArrayList<String>();
		s.add("aaaa");
		String ss = s.get(0);
		*/
		System.out.println("name \t age");
		for(int i = 0 ; i < member.size() ; i++) {
			MemberDTO dd = member.get( i );
			System.out.println(
					dd.getName() + "\t" + dd.getAge() );
		}
		System.out.println("---------------");
		for( MemberDTO dto   :  member  ) {
			System.out.println( dto.getName() );
			System.out.println( dto.getAge() );
		}
	}
}
















