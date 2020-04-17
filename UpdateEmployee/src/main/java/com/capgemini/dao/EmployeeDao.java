package com.capgemini.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.capgemini.bean.Employee;

@Repository
public class EmployeeDao implements EmployeeDaoI{
	
	@PersistenceContext
	EntityManager em;

	@Override
	public void updateEmployee(Employee e) {
		em.merge(e);
	}
}
