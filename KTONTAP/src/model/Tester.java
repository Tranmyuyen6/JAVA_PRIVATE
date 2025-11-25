package model;

import service.IWorkable;

public class Tester extends Employee implements IWorkable {
    private int bugsDelectedCount;

    public Tester() {
    }

    public Tester(int bugsDelectedCount) {
        this.bugsDelectedCount = bugsDelectedCount;
    }

    public Tester(String name, int age, double basicSalary, Device device, int bugsDelectedCount) {
        super(name, age, basicSalary, device);
        this.bugsDelectedCount = bugsDelectedCount;
    }

    public int getBugsDelectedCount() {
        return bugsDelectedCount;
    }

    public void setBugsDelectedCount(int bugsDelectedCount) {
        this.bugsDelectedCount = bugsDelectedCount;
    }

    @Override
    public void work() {
        System.out.println("kiem tra loi ung dung");
    }

    @Override
    public double calculateSalary() {
        return getBasicSalary()+getBASE_SALARY_RATE()*bugsDelectedCount;
    }

    @Override
    public String toString() {
        return super.toString()+"Tester{" +
                "bugsDelectedCount=" + bugsDelectedCount +
                '}';
    }
}
