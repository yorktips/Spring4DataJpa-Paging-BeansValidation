
package com.socan.service;
import com.socan.entity.Employee;

import java.util.List;

/**
 * @author York
 * @version 1.0
 */
public interface EmployeeService {
	public Employee createEmployee(Employee employee);
    public Employee updateEmployee(Employee employee);
    public void deleteEmployee(long id);
    public List<Employee> getAllEmployees();
    public Employee getEmployee(long id);	
	public List<Employee> getAllEmployees(String employeeName);
}
