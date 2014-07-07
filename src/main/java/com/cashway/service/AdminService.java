/*
 * Copyright 2005-2013 shopxx.net. All rights reserved.
 * Support: http://www.shopxx.net
 * License: http://www.shopxx.net/license
 */
package com.cashway.service;

import com.cashway.entity.Admin;

import java.util.List;


public interface AdminService extends BaseService<Admin, Long> {

	boolean usernameExists(String username);

	Admin findByUsername(String username);

	List<String> findAuthorities(Long id);

	boolean isAuthenticated();

	Admin getCurrent();

	String getCurrentUsername();

}