package br.com.onequest.model.dao;

import br.com.onequest.model.entity.User;


public interface UserDao extends DAOBase<User> {
	
	 User findUserByPassword(String login, String password);
	 
	 User findUser(String login) ;
	
}
