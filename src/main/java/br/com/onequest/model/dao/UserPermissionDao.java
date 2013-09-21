package br.com.onequest.model.dao;

import java.util.List;

import br.com.onequest.model.entity.User;
import br.com.onequest.model.entity.UserPermission;

public interface UserPermissionDao extends DAOBase<UserPermission>{
	
	List<UserPermission> findPermissoesUsuario(User user);

}
