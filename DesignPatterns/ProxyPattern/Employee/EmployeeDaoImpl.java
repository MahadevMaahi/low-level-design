package DesignPatterns.ProxyPattern.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
    
    @Override
    public void create(String client, EmployeeDO employee) throws Exception {
        System.out.println("New Entry for employee is created by " + client);
    }

    @Override
    public void remove(String client, EmployeeDO employee) throws Exception {
        System.out.println("Entry for employee is removed by " + client);
    }

    @Override
    public EmployeeDO get(String client, int employeeId) throws Exception {
        System.out.println("Entry for employee is accessed by " + client);
        return new EmployeeDO();
    }
}
