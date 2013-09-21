package br.com.onequest.model.service;

import java.util.List;

import br.com.onequest.model.entity.User;
import br.com.onequest.model.entity.UserPermission;

public interface UserPermissionService extends ServiceBase<UserPermission>{
	
	List<UserPermission> findPermissoesUsuario(User user);
	 void addRole(String role, User user);

}
