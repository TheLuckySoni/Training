package com.soni.dao;

import java.util.Collections;
import java.util.List;

import com.soni.Employee;

public class EmployeeDAO {

	// Instance Variable
	private static EmployeeDAO dao;

	// private Constructor
	private EmployeeDAO() {

	}

	public static EmployeeDAO getInstance() {
		dao = new EmployeeDAO();
		return dao;
	}

	public Employee getEmployee(long empId) {
		return null;
	}

	public List<Employee> getAll() {
		return Collections.emptyList();
	}

	public String updateEmployee(Employee employee) {
		return employee.getEmpName();
	}

	public String deleteEmployee(Long empId) {
		return empId.toString();
	}

	public boolean empStatus(Employee employee) {
		return employee.isEmpStatus();
	}

	public String addEmployee(Employee employee) {
		return employee.getEmpName();
	}

}