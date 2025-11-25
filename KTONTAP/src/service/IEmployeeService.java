package service;

import model.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> getAllEmployees() ;
    Employee getEmployeeById(String id);
    List<Employee> getEmployeeByName(String name);
}
