package com.rama.app.list;

import com.rama.app.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeList {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        Employee e1 = new Employee("AB",21,"LMN","456789",30000);
        Employee e2 = new Employee("LM",45,"PQR","123789",60000);
        Employee e3 = new Employee("UV",78,"XYZ","123456",90000);
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        for(Employee employee : employeeList) {
            employee.print();
        }
        System.out.println("Employee Age Less Than 30");
        List<Employee> employeeAgeLessThan30 = employeeList.stream().filter(employee -> employee.getAge() < 30).collect(Collectors.toList());
        for(Employee employee : employeeAgeLessThan30) {
            employee.print();
        }
        System.out.println("Employee Salary Greater Than 50000");
        List<Employee> employeeSalaryGreaterThan50000 = employeeList.stream().filter(employee -> employee.getSalary() > 50000).collect(Collectors.toList());
        for(Employee employee : employeeSalaryGreaterThan50000) {
            employee.print();
        }
    }
}