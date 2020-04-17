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
	public void deleteEmployee(Employee e) {
		Employee emp = em.find(Employee.class, e.getEid());
		em.remove(emp);
	}
}
