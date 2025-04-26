
package com.lombokexample;

public class MainApp {
    public static void main(String[] args) {
        // Using the all-argument constructor
        Employee employee = new Employee(1, "John Doe", "IT", 75000.0);

        // Using Lombok-generated getters and setters
        System.out.println("Employee Details: " + employee);
        employee.setSalary(80000.0);
        System.out.println("Updated Salary: " + employee.getSalary());

        // Using the no-argument constructor
        Employee newEmployee = new Employee();
        newEmployee.setId(2);
        newEmployee.setName("Jane Smith");
        newEmployee.setDepartment("HR");
        newEmployee.setSalary(65000.0);
        System.out.println("New Employee Details: " + newEmployee);
    }
}