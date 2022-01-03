package kwonminyoung.ums;

import kwonminyoung.ums.user.dao.UserDao;
import kwonminyoung.ums.user.dao.UserDaoImpl;
import kwonminyoung.ums.user.presentation.Console;
import kwonminyoung.ums.user.presentation.UserIo;
import kwonminyoung.ums.user.service.UserService;
import kwonminyoung.ums.user.service.UserServiceImpl;

public class Main {
	public static void main(String[] args) {
		Console.info("UMS를 시작합니다.");
		
		UserDao userDao = new UserDaoImpl();
		UserService userService = new UserServiceImpl(userDao);
		UserIo userIo = new UserIo(userService);
		
		userIo.play();
		
		Console.info("UMS를 종료합니다.");
	}
}