package DesignPatterns.FacadePattern.Employee;

public class EmployeeClient {
    public static void main(String[] args) {
        EmployeeFacade employeeFacade = new EmployeeFacade();
        System.out.println("Employee count: " + employeeFacade.getEmployeeCount());
        System.out.println("Employee name: " + employeeFacade.getEmployeeName(1));
    }
}
