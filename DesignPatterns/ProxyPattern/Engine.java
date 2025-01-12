package DesignPatterns.ProxyPattern;

import DesignPatterns.ProxyPattern.Employee.EmployeeDO;
import DesignPatterns.ProxyPattern.Employee.EmployeeDao;
import DesignPatterns.ProxyPattern.Employee.EmployeeDaoProxy;

public class Engine {
    public static void main(String[] args) {
        EmployeeDao employeeDao = new EmployeeDaoProxy();
        try {
            employeeDao.create("ADMIN", new EmployeeDO());
            employeeDao.remove("ADMIN", new EmployeeDO());
            employeeDao.get("USER", 0);
            employeeDao.create("USER", new EmployeeDO());
            employeeDao.remove("USER", new EmployeeDO());
            employeeDao.get("", 0);
        } catch(Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
