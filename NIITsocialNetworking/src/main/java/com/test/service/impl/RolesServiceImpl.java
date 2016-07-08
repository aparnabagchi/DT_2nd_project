package com.test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.test.dao.RolesDAO;
import com.test.model.Roles;
import com.test.service.RolesService;

@Service
@Transactional
public class RolesServiceImpl implements RolesService{

	@Autowired
	private RolesDAO rolesDAO;
	
	public void addRole(Roles role) {
		rolesDAO.addRole(role);
		
	}



}
