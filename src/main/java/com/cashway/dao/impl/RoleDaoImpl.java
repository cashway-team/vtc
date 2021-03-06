/*
 * Copyright 2005-2013 shopxx.net. All rights reserved.
 * Support: http://www.shopxx.net
 * License: http://www.shopxx.net/license
 */
package com.cashway.dao.impl;

import com.cashway.dao.RoleDao;
import com.cashway.entity.persis.Role;
import org.springframework.stereotype.Repository;

@Repository
public class RoleDaoImpl extends PersistenceDaoImpl<Role, Long> implements RoleDao {

}