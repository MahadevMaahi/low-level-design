package DesignPatterns.FacadePattern.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {

    private List<Employee> employees = new ArrayList<Employee>();
    
    public void insertEmployee(Employee employee) {
        employees.add(employee);
    }

    public int getEmployeeCount() {
        return employees.size();
    }

    public List<Employee> getAllEmployees() {
        return employees;
    }

    public String getEmployeeName(int employeeId) {
        return employeeId + "";
    }
}
