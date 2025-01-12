package DesignPatterns.ProxyPattern.Employee;

public class EmployeeDaoProxy implements EmployeeDao {

    private EmployeeDao employeeDao;

    public EmployeeDaoProxy() {
        this.employeeDao = new EmployeeDaoImpl();
    }

    @Override
    public void create(String client, EmployeeDO employee) throws Exception {
        if (client == "ADMIN") {
            employeeDao.create(client, employee);
            return;
        }
        throw new Exception("Access Denied");
    }

    @Override
    public void remove(String client, EmployeeDO employee) throws Exception {
        if (client == "ADMIN") {
            employeeDao.remove(client, employee);
            return;
        }
        throw new Exception("Access Denied");
    }

    @Override
    public EmployeeDO get(String client, int employeeId) throws Exception {
        if (client == "ADMIN" || client == "USER") {
            return employeeDao.get(client, employeeId);
        }
        throw new Exception("Access Denied");
    }
    
}
