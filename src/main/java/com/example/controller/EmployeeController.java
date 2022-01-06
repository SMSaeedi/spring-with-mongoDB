package com.example.controller;

import com.example.model.Employee;
import com.example.service.EmployeeService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(value = "SpringRestWithMongoDB", description = "Controllers are now ready to test with swaggerUI")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "save",method = RequestMethod.POST) // or @GetMapping
    public Employee save(Employee employee){
        return employeeService.save(employee);
    }

    @RequestMapping(value = "update",method = RequestMethod.POST) // or @GetMapping
    public Employee update(Employee employee){
        return employeeService.update(employee);
    }

    @RequestMapping(value = "list",method = RequestMethod.GET) // or @GetMapping
    public java.util.List<Employee> listEmployee() {
        return employeeService.findAll();
    }

    @RequestMapping(value = "delete", method = RequestMethod.DELETE) // or @DeleteMapping
    public void delete(@RequestParam("id")String id){
         employeeService.delete(id);
    }

}