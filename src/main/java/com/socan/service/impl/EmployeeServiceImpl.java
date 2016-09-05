package com.socan.service.impl;
import com.socan.dao.EmployeeDAO;
import com.socan.entity.Employee;
import com.socan.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
/**
 * @author York
 * @version 1.0
 */
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	
	public EmployeeServiceImpl() {
		System.out.println("EmployeeServiceImpl()");
	}
	
    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    public Employee createEmployee(Employee employee) {
        return employeeDAO.save(employee);
    }
    @Override
    public Employee updateEmployee(Employee employee) {
        return employeeDAO.save(employee);
    }
    @Override
    public void deleteEmployee(long id) {
        employeeDAO.delete(id);
    }
    @Override
    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }
    @Override
    public Employee getEmployee(long id) {
        return employeeDAO.findOne(id);
    }    
    @Override
    public List<Employee> getAllEmployees(String employeeName) {
    	return employeeDAO.getAllEmployeesByName(employeeName);
    }
}
