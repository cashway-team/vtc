/*
 * Copyright 2005-2013 shopxx.net. All rights reserved.
 * Support: http://www.shopxx.net
 * License: http://www.shopxx.net/license
 */
package com.cashway.service;

import com.cashway.common.Filter;
import com.cashway.common.Order;
import com.cashway.common.Page;
import com.cashway.common.Pageable;

import java.io.Serializable;
import java.util.List;

public interface BaseService<T, ID extends Serializable> {

	T find(ID id);

	List<T> findAll();

	List<T> findList(ID... ids);

	List<T> findList(Integer count, List<Filter> filters, List<Order> orders);

	List<T> findList(Integer first, Integer count, List<Filter> filters, List<Order> orders);

	Page<T> findPage(Pageable pageable);

	long count();

	long count(Filter... filters);

	boolean exists(ID id);

	boolean exists(Filter... filters);

	void save(T entity);

	T update(T entity);

	T update(T entity, String... ignoreProperties);

	void delete(ID id);

	void delete(ID... ids);

	void delete(T entity);

}