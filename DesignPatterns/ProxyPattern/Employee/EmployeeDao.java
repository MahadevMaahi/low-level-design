package DesignPatterns.ProxyPattern.Employee;

public interface EmployeeDao {
    public void create(String client, EmployeeDO employee) throws Exception;
    public void remove(String client, EmployeeDO employee) throws Exception;
    public EmployeeDO get(String client, int employeeId) throws Exception;
}
