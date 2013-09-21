package br.com.onequest.security;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;

import br.com.onequest.model.entity.User;
import br.com.onequest.model.entity.UserPermission;

public class SFAuthentication implements Authentication {

	private final User user;
	private boolean autentication;
	
	public SFAuthentication(User user, List<UserPermission> permissions) {
		this.user = user;
		this.permissions = permissions;
	}
	
	public String getName() {
		return user != null ? user.getLogin() : null;
	}
	private List<UserPermission> permissions;
	
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		return permissions;
	}

	public Object getCredentials() {
		return user != null ? user.getHashPassword() : null;
	}

	public Object getDetails() {
		return user;
	}

	public Object getPrincipal() {
		return user != null ? user.getLogin() : null;
	}

	public boolean isAuthenticated() {
		return this.autentication;
	}

	public void setAuthenticated(boolean isAuthenticated)
			throws IllegalArgumentException {
		this.autentication = isAuthenticated;
		
	}

}
