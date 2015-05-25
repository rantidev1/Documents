/**
 *
 */
package com.domain.documents.spring.service;

import com.domain.documents.java.service.Login;

/**
 * @author Rantidev Singh
 *
 */
public class LoginService implements Login {

	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public boolean isAuthorized(String email, String pass){
		if(username.equals(email) && password.equals(pass))
			return true;
		return false;
	}

}
