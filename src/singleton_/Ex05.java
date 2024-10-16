package singleton_;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

interface Int05 {
	public int num = 1234;
	public final int num1 = 200;
	public static final int num2 = 300;

}

class A05 {
	public int num = 1000;
	public static int num1;
	public static final int num2 = 1;
	static {
		num1 = 1234;
		// for(int i=0; i <5 ; i++) {
		// num1 = i;
		// }
	}
}

public class Ex05 {
	public static void main(String[] args) {
		System.out.println(Int05.num);
		List<String> arr = new ArrayList<String>();
		Map<String, String> map = new HashMap<String, String>();
		Set<String> set = new HashSet<String>();
	}
}
