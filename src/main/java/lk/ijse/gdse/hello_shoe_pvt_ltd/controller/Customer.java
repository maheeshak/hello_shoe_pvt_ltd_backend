package lk.ijse.gdse.hello_shoe_pvt_ltd.controller;


import lk.ijse.gdse.hello_shoe_pvt_ltd.dto.CustomerDTO;
import lk.ijse.gdse.hello_shoe_pvt_ltd.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/customer")
@RequiredArgsConstructor
public class Customer {

    private final CustomerService customerService;

    @GetMapping("/health")
    public String healthCheck(){
        return "Hello I'm customer controller and I'm okay!";
    }

    @PostMapping
    public boolean saveCustomer(@RequestBody CustomerDTO customerDTO){
       return customerService.saveCustomer(customerDTO);

    }

    @PutMapping
    public boolean updateCustomer(@RequestBody CustomerDTO customerDTO){
       return customerService.updateCustomer(customerDTO);
    }

    @DeleteMapping
    public boolean deleteCustomer(@RequestParam String customer_code){
      return customerService.deleteCustomer(customer_code);
    }

    @GetMapping("/find")
    public CustomerDTO searchCustomer(@RequestParam String customer_code){
        System.out.println(customer_code);
        CustomerDTO customerDTO = new CustomerDTO();
        customerDTO.setCustomer_code(customer_code);
        return customerDTO;

    }

    @GetMapping
    public List<CustomerDTO> getAllCustomer(){

        ArrayList<CustomerDTO> customerDTOS = new ArrayList<>();

        CustomerDTO customerDTO = new CustomerDTO();
        customerDTO.setCustomer_code("C001");
        customerDTO.setCustomer_name("Maheesha");

        customerDTOS.add(customerDTO);
        return customerDTOS;

    }

}
