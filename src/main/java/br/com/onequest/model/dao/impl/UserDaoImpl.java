package br.com.onequest.model.dao.impl;

import org.apache.commons.codec.digest.DigestUtils;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.onequest.model.dao.UserDao;
import br.com.onequest.model.entity.User;

@Transactional(propagation=Propagation.SUPPORTS)
@Repository("daoUsuario")
public class UserDaoImpl extends AbstractDao<User> implements UserDao {

	protected Class getClazz() {
		return User.class;
	}

	public User findUserByPassword(String login, String password) {
		Query query = getSession().createQuery("from User usr where usr.login = ? and usr.hashPassword = ?");
		query.setString(0, login);
		query.setString(1, DigestUtils.sha256Hex(password));
		return (User) query.uniqueResult();				   
	}

	public User findUser(String login) {
		Query query = getSession().createQuery("from User usr where usr.login = ?");
		query.setString(0, login);
		return (User) query.uniqueResult();
	}

	
	
}
