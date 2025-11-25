import constant.Constant;
import model.Developer;
import model.Device;
import model.Employee;
import model.Tester;
import service.impl.IEmployeeServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<Employee> employees = new ArrayList<>();

    public static void main(String[] args) {
        employees.add(new Developer("huy",24, 2000,new Device("may tinh"),2));
        employees.add(new Developer("duong",26, 7000,new Device("dien thoai"),9));
        employees.add(new Developer("hoang",27, 4000,new Device("may tinh"),10));
        employees.add(new Tester("duong", 34, 1000,new Device("may tinh"), 4));
        employees.add(new Tester("ngoc", 21, 2000,new Device("tu lanh"), 12));

        IEmployeeServiceImpl iEmployeeService = new IEmployeeServiceImpl(employees);
        int choose;
        do {
            try{
                Constant.menu();
                choose = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                choose = 0;
            }
            switch (choose){
                case 1:
                    iEmployeeService.getAllEmployees()1;
                    break;
                case 2:
                    System.out.println(Constant.enter.ID);
                    String id = sc.nextLine();
                    iEmployeeService.getEmployeeById(id);
                    break;
                case 3:
                    System.out.println(Constant.enter.NAME);
                    String name = sc.nextLine();
                   List<Employee> employeeByName = iEmployeeService.getEmployeeByName(name);
                    System.out.println(employeeByName);
                    break;
                case 4:
                    System.out.println(Constant.message.EXIT);
                    break;
                default:
                    System.out.println(Constant.error.CHOOSE);
                    break;

            }


        }while (choose != 4);
    }
}