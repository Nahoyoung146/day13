package list_;
public class MemberDTO {
	private String name;
	private int age;
	public MemberDTO() {}
	public MemberDTO(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return "(표현하고 싶은 문자열)";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}









