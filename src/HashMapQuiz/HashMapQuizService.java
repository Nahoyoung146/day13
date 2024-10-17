package HashMapQuiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HashMapQuizService {
	private HashMapQuizDTO dto;

	public HashMapQuizService() {
		dto = new HashMapQuizDTO("111", "111");
	}

	public void function() {
		ArrayList<HashMap<String, String>> arr = new ArrayList<HashMap<String, String>>();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1. 로그인\n2. 회원가입\n3. 탈퇴\n4. 전체 회원 보기\n5. 종료");
			System.out.print("메뉴 입력 : ");
			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				if (arr.size() == 0)
					System.out.println("회원가입 먼저 진행해주세요.");

				else {
					System.out.print("id 입력 : ");
					dto.setId(sc.next());
					for (int i = 0; i < arr.size(); i++) {
						if (arr.get(i).get("id").equals(dto.getId())) {
							System.out.print("pwd 입력 : ");
							dto.setPwd(sc.next());
							if (arr.get(i).get("pwd").equals(dto.getPwd())) {
								System.out.println("로그인 완료");
								break;
							}

							else {
								System.out.println("비밀번호가 틀렸습니다.");
								break;
							}
						}

						if (i == arr.size() - 1)
							System.out.println("해당 id는 존재하지 않습니다.");
					}
				}

				break;
			case 2:
				System.out.print("id 입력 : ");
				dto.setId(sc.next());
				HashMap<String, String> h = new HashMap<String, String>();
				if (arr.size() == 0) {
					System.out.print("pwd 입력 : ");
					dto.setPwd(sc.next());
					h.put("id", dto.getId());
					h.put("pwd", dto.getPwd());
					arr.add(h);
					System.out.println("가입 완료");
					break;
				} else {
					for (int i = 0; i < arr.size(); i++) {
						if (arr.get(i).get("id").equals(dto.getId())) {
							System.out.println("해당 아이디는 이미 존재합니다.");
							break;
						}

						if (i == arr.size() - 1) {
							System.out.print("pwd 입력 : ");
							dto.setPwd(sc.next());
							h.put("id", dto.getId());
							h.put("pwd", dto.getPwd());
							arr.add(h);
							System.out.println("가입 완료");
						}
					}
				}
				break;
			case 3:
				if (arr.size() == 0)
					System.out.println("회원가입 먼저 진행해주세요.");

				else {
					System.out.print("삭제할 id 입력 : ");
					dto.setId(sc.next());
					for (int i = 0; i < arr.size(); i++) {
						if (arr.get(i).get("id").equals(dto.getId())) {
							arr.remove(i);
							System.out.println("삭제 완료");
							break;
						}

						if (i == arr.size() - 1)
							System.out.println("해당 id는 존재하지 않습니다.");
					}
				}

				break;
			case 4:
				if (arr.size() == 0)
					System.out.println("회원가입 먼저 진행해주세요.");

				else {
					for (int i = 0; i < arr.size(); i++) {
						System.out.println(
								i + 1 + "번째 회원 id : " + arr.get(i).get("id") + ", pwd : " + arr.get(i).get("pwd"));
					}
				}

				break;
			case 5:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
}
