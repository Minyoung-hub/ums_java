package kwonminyoung.ums.user.service;

import java.util.Map;

import kwonminyoung.ums.user.dao.UserDao;
import kwonminyoung.ums.user.domain.User;

public class UserServiceImpl implements UserService{
	private UserDao userDao;
	
	public UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@Override
	public void addName(int num, User data) {
		this.userDao.addName(num, data);
	}
	
	@Override
	public void changeName(int num, User data) {
		this.userDao.changeName(num, data);
	}
	
	@Override
	public void deleteName(int num) {
		this.userDao.deleteName(num);
	}
	
	@Override
	public Map<Integer, User> listMap(){
		Map<Integer, User> map = this.userDao.getMap();
		return map;
	}
}