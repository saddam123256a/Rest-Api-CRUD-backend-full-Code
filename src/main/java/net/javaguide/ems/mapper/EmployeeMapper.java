package net.javaguide.ems.mapper;

import net.javaguide.ems.dto.EmployeeDto;
import net.javaguide.ems.entity.Employee;

public class EmployeeMapper {
    // Maps an Employee entity to EmployeeDto
    public static EmployeeDto mapToEmployeeDto(Employee employee) {
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );
    }

    // Maps an EmployeeDto to Employee entity
    public static Employee mapToEmployee(EmployeeDto employeeDto) {
        return new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail()
        );
    }
}