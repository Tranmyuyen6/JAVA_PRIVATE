package service.impl;

import constant.Constant;
import model.Developer;
import model.Device;
import model.Employee;
import model.Tester;
import service.IEmployeeService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IEmployeeServiceImpl implements IEmployeeService {
    private static ArrayList<Employee> employees = new ArrayList<>();

    public IEmployeeServiceImpl() {
        employees.add(new Developer("huy",24, 2000,new Device("may tinh"),2));
        employees.add(new Developer("duong",26, 7000,new Device("dien thoai"),9));
        employees.add(new Developer("hoang",27, 4000,new Device("may tinh"),10));
        employees.add(new Tester("duong", 34, 1000,new Device("may tinh"), 4));
        employees.add(new Tester("ngoc", 21, 2000,new Device("tu lanh"), 12));
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
