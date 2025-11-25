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

    private static IEmployeeServiceImpl iEmployeeService = new IEmployeeServiceImpl();
    public static void main(String[] args) {
        
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
                    iEmployeeService.getAllEmployees();
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