package br.com.onequest.model.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.onequest.model.dao.UserDao;
import br.com.onequest.model.entity.User;
import br.com.onequest.model.service.UserService;

@Service
public class UserServiceImpl  implements UserService{

	@Autowired
	private UserDao userDao;
	
	public List<User> list(int offset, int max) {
		
		return userDao.list(offset, max);
	}

	@Override
	public void save(User user) {
		userDao.save(user);
		
	}

	@Override
	public void delete(User user) {
		userDao.delete(user);
		
	}

	@Override
	public User get(Long id) {
	
		return userDao.get(id);
	}

	@Override
	public User getUserByPassword(String login, String password) {
		return userDao.findUserByPassword(login, password);
	}

	@Override
	public User getUser(String login) {
		return userDao.findUser(login);
	}



}
