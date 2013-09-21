package br.com.onequest.model.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import br.com.onequest.model.dao.UserPermissionDao;
import br.com.onequest.model.entity.User;
import br.com.onequest.model.entity.UserPermission;

@Repository
public class UserPermissionDaoImpl extends AbstractDao<UserPermission> implements UserPermissionDao{

	@Override
	protected Class getClazz() {
		
		return UserPermission.class;
	}
	
	public List<UserPermission> findPermissoesUsuario(User user) {
		if (user == null) {
			return new ArrayList<UserPermission>();
		}
		Query query = getSession().createQuery("from UserPermission pu where pu.user = ?");
		query.setEntity(0, user);
		return query.list();
	}

}
