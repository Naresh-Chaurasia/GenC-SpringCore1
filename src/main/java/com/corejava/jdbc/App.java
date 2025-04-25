package com.corejava.jdbc;

import java.util.List;

public class App {
    public static void main(String[] args) {
        EmployeeDAO employeeDAO = new EmployeeDAO();

        // Create Table
        employeeDAO.createTable();

        // Insert Employees
        employeeDAO.insertEmployee(new Employee(1, "John Doe", "IT", 60000));
        employeeDAO.insertEmployee(new Employee(2, "Jane Smith", "HR", 50000));

        // Retrieve All Employees
        List<Employee> employees = employeeDAO.getAllEmployees();
        System.out.println("All Employees:");
        employees.forEach(System.out::println);

        // Update Employee
        Employee updatedEmployee = new Employee(1, "John Doe", "Finance", 65000);
        employeeDAO.updateEmployee(updatedEmployee);

        // Retrieve All Employees After Update
        System.out.println("Employees After Update:");
        employees = employeeDAO.getAllEmployees();
        employees.forEach(System.out::println);

        // Delete Employee
        employeeDAO.deleteEmployee(2);

        // Retrieve All Employees After Deletion
        System.out.println("Employees After Deletion:");
        employees = employeeDAO.getAllEmployees();
        employees.forEach(System.out::println);
    }
}