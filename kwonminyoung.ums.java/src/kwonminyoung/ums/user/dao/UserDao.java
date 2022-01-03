package kwonminyoung.ums.user.dao;

import java.util.Map;

import kwonminyoung.ums.user.domain.User;

public interface UserDao {
	void addName(int num, User data);
	void changeName(int num, User data);
	void deleteName(int num);
	
	Map<Integer, User> getMap();
}
