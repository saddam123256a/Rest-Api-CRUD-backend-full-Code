package net.javaguide.ems.controller;

import net.javaguide.ems.dto.EmployeeDto;
import net.javaguide.ems.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
@Autowired
private EmployeeService employeeService;


//Build Add Employee REST API
@PostMapping
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto){
        EmployeeDto savedEmployee=employeeService.createEmployee(employeeDto);

        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }
//Build get employee rest api
@GetMapping("{id}")
    public ResponseEntity<EmployeeDto>getEmployeeById(@PathVariable("id") Long employeeId){
    EmployeeDto employeeDto=employeeService.getEmployeeById(employeeId);
    return ResponseEntity.ok(employeeDto);
    }
//Build Get All Employee REST API
@GetMapping
    public ResponseEntity<List<EmployeeDto>>getAllEmployess(){
    List<EmployeeDto>employess= employeeService.getAllEmployees();
    return ResponseEntity.ok(employess);
    }
//Build update Employee Rest Api'
@PutMapping("{id}")
    public ResponseEntity<EmployeeDto>updateEmployee(@PathVariable("id") Long employeeId,@RequestBody EmployeeDto updatedEmployee){
    EmployeeDto employeeDto=employeeService.updateEmployee(employeeId,updatedEmployee);
return ResponseEntity.ok(employeeDto);
}
//Build Delete Employee Rest Api
@DeleteMapping("{id}")
    public ResponseEntity<String>deleteEmployee(@PathVariable("id") Long EmployeeId){
    employeeService.deleteEmployee(EmployeeId);
    return ResponseEntity.ok("Employee deleted Successfully");
    }


}
