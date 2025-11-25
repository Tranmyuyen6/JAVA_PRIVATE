package service.impl;

import constant.Constant;
import model.Employee;
import service.IEmployeeService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IEmployeeServiceImpl implements IEmployeeService {
    private static ArrayList<Employee> employees;

    public IEmployeeServiceImpl(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public List<Employee> getAllEmployees() {
        boolean check = false;
        if(employees.isEmpty()){
            System.out.println(Constant.error.EMPTY);
            check = true;
            return null;
        }
        if(!check){
            for(Employee e : employees){
                System.out.println(e.toString());
            }
        }

        return employees;
    }

    @Override
    public Employee getEmployeeById(String id) {
        for(Employee e : employees){
            if(e.getId().equalsIgnoreCase(id)){
                System.out.println(e.toString());
                return e;
            }
        }

        return null;
    }

    @Override
    public List<Employee> getEmployeeByName(String name) {
        List<Employee> employees1 = new ArrayList<>();
        for(Employee e : employees){
            if(e.getName().equalsIgnoreCase(name)){

                employees1.add(e);
            }
        }
        return employees1;
    }
}
