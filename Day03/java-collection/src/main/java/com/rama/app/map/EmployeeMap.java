package com.rama.app.map;

import com.rama.app.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeMap {
    public static void main(String[] args) {
        List<Employee> employeeMap = new ArrayList<>();
        Employee e1 = new Employee("AB",21,"LMN","456789",30000);
        Employee e2 = new Employee("LM",45,"PQR","123789",60000);
        Employee e3 = new Employee("UV",78,"XYZ","123456",90000);
        employeeMap.add(e1);
        employeeMap.add(e2);
        employeeMap.add(e3);
        for(Employee employee : employeeMap) {
            employee.print();
        }
        System.out.println("Employee Salary Less Than 40000");
        Map<String, Integer> FilterSalary = employeeMap.stream().filter(employee -> employee.getSalary() < 40000).collect(Collectors.toMap(Employee::getName, Employee::getSalary));
        System.out.println(FilterSalary);
        System.out.println("Employee Age Greater Than 25");
        Map<String, Integer> FilterAge = employeeMap.stream().filter(employee -> employee.getAge() > 25).collect(Collectors.toMap(Employee::getName, Employee::getAge));
        System.out.println(FilterAge);
    }
}