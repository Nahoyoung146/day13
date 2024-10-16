package list_.김개똥;

import java.util.ArrayList;

import list_.common.CommonMember;
import list_.홍길동.MemberDTO;

public class ServiceTest {
	private ArrayList<MemberDTO> arr;
	public ServiceTest() {
		arr = CommonMember.mem;
	}
	public void display( ) {
		System.err.println("-----매개변수 없는 disp----");
		System.out.println(arr);
	}
	public void display( ArrayList<MemberDTO> arr ) {
		System.err.println("-----김개똥----");
		System.out.println(arr);
	}
}






