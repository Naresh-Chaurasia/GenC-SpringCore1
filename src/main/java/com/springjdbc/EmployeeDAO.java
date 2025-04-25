package com.springjdbc;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class EmployeeDAO {

    private final JdbcTemplate jdbcTemplate;

    public EmployeeDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // Create Table
    public void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS Employee (" +
                "id INT PRIMARY KEY, " +
                "name VARCHAR(255), " +
                "department VARCHAR(255), " +
                "salary DOUBLE)";
        jdbcTemplate.execute(sql);
    }

    // Insert Employee
    public void insertEmployee(Employee employee) {
        String sql = "INSERT INTO Employee (id, name, department, salary) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, employee.getId(), employee.getName(), employee.getDepartment(), employee.getSalary());
    }

    // Retrieve All Employees
    public List<Employee> getAllEmployees() {
        String sql = "SELECT * FROM Employee";
        return jdbcTemplate.query(sql, new EmployeeRowMapper());
    }

    // Update Employee
    public void updateEmployee(Employee employee) {
        String sql = "UPDATE Employee SET name = ?, department = ?, salary = ? WHERE id = ?";
        jdbcTemplate.update(sql, employee.getName(), employee.getDepartment(), employee.getSalary(), employee.getId());
    }

    // Delete Employee
    public void deleteEmployee(int id) {
        String sql = "DELETE FROM Employee WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

    // RowMapper for Employee
    private static class EmployeeRowMapper implements RowMapper<Employee> {
        @Override
        public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
            return new Employee(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("department"),
                    rs.getDouble("salary"));
        }
    }
}