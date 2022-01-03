package kwonminyoung.ums.user.service;

import java.util.Map;

import kwonminyoung.ums.user.domain.User;

public interface UserService {
	void addName(int num, User data);
	void changeName(int num, User data);
	void deleteName(int num);
	
	Map<Integer, User> listMap();
}
