package DesignPatterns.FacadePattern.Employee;

public class EmployeeFacade {
    private EmployeeDAO employeeDAO = new EmployeeDAO();

    public int getEmployeeCount() {
        return employeeDAO.getEmployeeCount();
    }

    public String getEmployeeName(int employeeId) {
        return employeeDAO.getEmployeeName(employeeId);
    }
}
