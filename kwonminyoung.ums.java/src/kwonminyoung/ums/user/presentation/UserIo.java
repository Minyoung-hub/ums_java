package kwonminyoung.ums.user.presentation;

import java.time.LocalDate;
import java.util.Map;
import java.util.Set;

import kwonminyoung.ums.user.domain.User;
import kwonminyoung.ums.user.service.UserService;

public class UserIo {
	private UserService userService;

	public UserIo(UserService userService) {
		this.userService = userService;
	}

	public void play() {
		User data = null;
		Map<Integer, User> map = null;
			
		boolean err = true;
		int cnt = 0;
		int input = 0;
		int newNum = 0;
		int delNum = 0;

		do {
			map = userService.listMap();
			
			input = Console.inNum("1.목록, 2.등록, 3.수정, 4.탈퇴, 0.종료");
			switch (input) {
			case 1:
				if (map.isEmpty() == true)
					Console.info("사용자가 없습니다.");
				
				Set<Integer> keys = map.keySet();
				for (Integer key: keys) 
					Console.info(key+ " " + map.get(key));
				break;

			case 2:
				data = new User();
				String name = Console.inStr("등록할 사용자 이름을 입력하세요.");
				if (name.equals("0")) {
					Console.info("사용자 등록 취소");
				} else {
					data.setName(name);
					data.setDate(LocalDate.now());
					Console.info("사용자 등록 성공.");
					userService.addName(++cnt, data);
				}
				break;

			case 3:
				if (map.isEmpty() == true)
					Console.info("사용자가 없습니다.");
				else {
					do {
						newNum = Console.inNum("수정할 사용자 번호를 입력하세요.");
						err = true;
						if (newNum == 0)
							Console.info("사용자 정보 취소");
						
						else if (map.containsKey(newNum) == false) {
							Console.info("ERROR: 입력한 번호의 사용자가 없습니다.");
							err = false;
						}
						else {
							data = new User();
							data.setName(Console.inStr("사용자 이름을 입력하세요."));
							data.setDate(LocalDate.now());
							userService.changeName(newNum, data);
							Console.info("사용자 정보 수정 성공.");
						}
					} while (err == false);
				}
				break;

			case 4:
				if (map.isEmpty() == true)
					Console.info("사용자가 없습니다.");
				else {
					do {
						data = new User();
						delNum = Console.inNum("탈퇴할 사용자 번호를 입력하세요.");
						err = true;
						if (delNum == 0) {
							Console.info("사용자 탈퇴 취소");
						}
						else if (map.containsKey(delNum) == false) {
							Console.info("ERROR: 입력한 번호의 사용자가 없습니다.");
							err = false;
						}
						else {
							userService.deleteName(delNum);
							Console.info("사용자 탈퇴 성공.");
						}
					} while (err == false);
				}
				break;

			case 0:
				break;

			default:
				Console.info("ERROR: 존재하는 메뉴 번호를 입력하세요.");
			}
		} while (input != 0);
	}
}