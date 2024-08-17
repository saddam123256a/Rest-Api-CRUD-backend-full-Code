package net.javaguide.ems.service;

import net.javaguide.ems.dto.EmployeeDto;
import net.javaguide.ems.entity.Employee;

import java.util.List;

public interface EmployeeService {
EmployeeDto createEmployee(EmployeeDto employeeDto);
EmployeeDto getEmployeeById(Long employeeId);

List<EmployeeDto> getAllEmployees();

EmployeeDto updateEmployee(Long employeeId,EmployeeDto updateEmployee);

void deleteEmployee(Long employeeId);
}
