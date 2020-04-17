package com.capgemini.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.capgemini.bean.Employee;

@Repository
public class EmployeeDao implements EmployeeDaoI{

	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Employee> getAllEmployees() {
		Query q = em.createQuery("select e from Employee e");
		List<Employee> list = q.getResultList();
		return list;
	}
}
