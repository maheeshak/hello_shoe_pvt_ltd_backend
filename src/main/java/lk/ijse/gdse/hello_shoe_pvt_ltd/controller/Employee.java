package lk.ijse.gdse.hello_shoe_pvt_ltd.controller;



import lk.ijse.gdse.hello_shoe_pvt_ltd.dto.CustomerDTO;
import lk.ijse.gdse.hello_shoe_pvt_ltd.dto.EmployeeDTO;
import lk.ijse.gdse.hello_shoe_pvt_ltd.service.EmployeeService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/employee")
@RequiredArgsConstructor
public class Employee {
    private final EmployeeService employeeService;

    @GetMapping("/health")
    public String healthCheck(){
        return "Hello I'm employee controller and I'm okay!";
    }

    @PostMapping
    public boolean saveEmployee(@RequestBody EmployeeDTO employeeDTO){
        return employeeService.saveEmployee(employeeDTO);

    }
    @PutMapping
    public boolean updateEmployee(@RequestBody EmployeeDTO employeeDTO){
        return employeeService.updateEmployee(employeeDTO);
    }

    @DeleteMapping
    public boolean deleteEmployee(@RequestParam String employee_code){
        return employeeService.deleteEmployee(employee_code);
    }

    @GetMapping("/find")
    public EmployeeDTO searchEmployee(@RequestParam String employee_code){
        System.out.println(employee_code);
        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setEmployee_code(employee_code);
        return employeeDTO;

    }
    @GetMapping
    public List<EmployeeDTO> getAllEmployees(){

        ArrayList<EmployeeDTO> employeeDTOS = new ArrayList<>();

        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setEmployee_code("EM001");
        employeeDTO.setEmployee_name("Madu");


        employeeDTOS.add(employeeDTO);
        return employeeDTOS;

    }


}
