/**
 *
 */
package com.domain.documents.spring.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.domain.documents.java.service.Login;

/**
 * @author Rantidev Singh
 *
 */
public class SecurityServiceFacade {
	private Logger log = LoggerFactory.getLogger(SecurityServiceFacade.class);

	private Login login;

	public void setLogin(Login login) {
		this.login = login;
	}

	public boolean areCredentialsValid(String email, String pass){
		log.debug("Validating Credentials > email:" + email + ", pass:" + pass);
		return this.login.isAuthorized(email, pass);
	}
}
