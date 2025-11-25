package model;

import service.IDebuggable;
import service.IWorkable;

public class Developer extends Employee implements IDebuggable, IWorkable {

    private int overtimeHours;

    public Developer() {
    }

    public Developer(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    public Developer(String name, int age, double basicSalary, Device device, int overtimeHours) {
        super(name, age, basicSalary, device);
        this.overtimeHours = overtimeHours;
    }

    public int getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    @Override
    public double calculateSalary() {
        return getBasicSalary()+getBASE_SALARY_RATE()*overtimeHours;
    }

    @Override
    public void fixBug() {
        System.out.println("sua loi tu do");
    }

    @Override
    public void work() {
        System.out.println("sua loi va phat trien app");
    }

    @Override
    public String toString() {

        return super.toString()+"Developer{" +
                "overtimeHours=" + overtimeHours +
                '}';
    }
}
