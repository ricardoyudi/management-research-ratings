package br.com.onequest.model.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.onequest.model.dao.UserPermissionDao;
import br.com.onequest.model.entity.User;
import br.com.onequest.model.entity.UserPermission;
import br.com.onequest.model.service.UserPermissionService;

@Service
public class UserPermissionServiceImpl implements UserPermissionService{
	
	@Autowired
	private UserPermissionDao userPermissionDao;

	@Override
	public List<UserPermission> list(int offset, int max) {
		return userPermissionDao.list(offset, max);
	}

	@Override
	public void save(UserPermission entity) {
		userPermissionDao.save(entity);
	}

	@Override
	public void delete(UserPermission entity) {
		userPermissionDao.delete(entity);
	}

	@Override
	public UserPermission get(Long id) {
		return userPermissionDao.get(id);
	}
	
	@Override
	public void addRole(String role, User user) {
		if (role != null && user != null) {
			UserPermission userPermission = new UserPermission();
			userPermission.setRole(role);
			userPermission.setUser(user);
			save(userPermission);
		}
	}

	@Override
	public List<UserPermission> findPermissoesUsuario(User user) {
		return userPermissionDao.findPermissoesUsuario(user);
	}
		

}
