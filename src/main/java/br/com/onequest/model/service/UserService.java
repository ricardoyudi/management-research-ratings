package br.com.onequest.model.service;

import br.com.onequest.model.entity.User;

public interface UserService extends ServiceBase<User>{
	
	User getUserByPassword(String login, String password);
	 
	 User getUser(String login) ;
}
