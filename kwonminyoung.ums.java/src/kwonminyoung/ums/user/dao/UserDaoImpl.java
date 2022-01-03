package kwonminyoung.ums.user.dao;

import java.util.HashMap;
import java.util.Map;

import kwonminyoung.ums.user.domain.User;

public class UserDaoImpl implements UserDao{
	private Map<Integer, User> map;
	
	public UserDaoImpl() {
		this.map = new HashMap<>();
	}
	
	@Override
	public void addName(int num, User data) {
		map.put(num, data);
	}
	
	@Override
	public void changeName(int num, User data) {
		map.put(num, data);
	}
	
	@Override
	public void deleteName(int num) {
		map.remove(num);
	}
	
	@Override
	public Map<Integer, User> getMap(){
		return this.map;
	}
}