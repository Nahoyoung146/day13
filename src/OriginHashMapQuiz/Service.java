package OriginHashMapQuiz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Service {
	private DTO dto;

	public Service() {
		dto = new DTO("111", "111");
	}

	public void function() {
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> h = new HashMap<String, String>();
		while (true) {
			System.out.println("1. 로그인\n2. 회원가입\n3. 탈퇴\n4. 전체 회원 보기\n5. 종료");
			System.out.print("메뉴 입력 : ");
			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				if (h.size() == 0)
					System.out.println("회원가입 먼저 진행해주세요.");

				else {
					System.out.print("id 입력 : ");
					dto.setId(sc.next());
					if (!h.containsKey(dto.getId()))
						System.out.println("해당 id는 존재하지 않습니다.");

					else {
						System.out.print("pwd 입력 : ");
						dto.setPwd(sc.next());
						if (h.get(dto.getId()).equals(dto.getPwd())) {
							System.out.println("로그인완료");
						}

						else
							System.out.println("비밀번호가 틀렸습니다.");
					}

				}

				break;
			case 2:
				System.out.print("id 입력 : ");
				dto.setId(sc.next());
				if (h.containsKey(dto.getId()))
					System.out.println("해당 id는 이미 존재합니다.");

				else {
					System.out.print("pwd 입력 : ");
					dto.setPwd(sc.next());
					h.put(dto.getId(), dto.getPwd());
					System.out.println("회원가입 완료");
				}

				break;
			case 3:
				if (h.size() == 0)
					System.out.println("회원가입 먼저 진행해주세요.");

				else {
					System.out.print("삭제할 id 입력 : ");
					dto.setId(sc.next());
					if (h.containsKey(dto.getId())) {
						h.remove(dto.getId());
						System.out.println("삭제 완료");
					}

					else
						System.out.println("해당 id는 존재하지 않습니다.");
				}

				break;
			case 4:
				if (h.size() == 0)
					System.out.println("회원가입 먼저 진행해주세요.");

				else {
					Set<String> set = h.keySet();
					Iterator<String> it = set.iterator();
					int i = 1;
					while (it.hasNext()) {
						String key = it.next();
						System.out.println(i + "번째 회원 id : " + key + ", pwd : " + h.get(key));
						i++;
					}
				}

				break;
			case 5:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
			}
		}
	}
}
