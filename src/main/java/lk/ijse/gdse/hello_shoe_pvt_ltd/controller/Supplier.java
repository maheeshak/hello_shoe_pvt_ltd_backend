package lk.ijse.gdse.hello_shoe_pvt_ltd.controller;

import lk.ijse.gdse.hello_shoe_pvt_ltd.dto.CustomerDTO;
import lk.ijse.gdse.hello_shoe_pvt_ltd.dto.SupplierDTO;
import lk.ijse.gdse.hello_shoe_pvt_ltd.service.SupplierService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/supplier")
@RequiredArgsConstructor
public class Supplier {

    private final SupplierService supplierService;

    @GetMapping("/health")
    public String healthCheck() {
        return "Hello I'm supplier controller and I'm okay!";
    }

    @PostMapping
    public boolean saveSupplier(@RequestBody SupplierDTO supplierDTO) {
        return supplierService.saveSupplier(supplierDTO);
    }

     @PutMapping
    public boolean updateSupplier(@RequestBody SupplierDTO supplierDTO) {
         return supplierService.updateSupplier(supplierDTO);
     }

     @DeleteMapping
    public boolean deleteSupplier(@RequestParam String supplier_code) {
         return supplierService.deleteSupplier(supplier_code);
     }

     @GetMapping("/find")
     public SupplierDTO searchSupplier(@RequestParam String supplier_code){
         System.out.println(supplier_code);
         SupplierDTO supplierDTO = new SupplierDTO();
         supplierDTO.setSupplier_code(supplier_code);
         return supplierDTO;

     }

        @GetMapping
    public List<SupplierDTO> getAllSupplier() {
            ArrayList<SupplierDTO> supplierDTOS = new ArrayList<>();

            SupplierDTO supplierDTO = new SupplierDTO();
            supplierDTO.setSupplier_code("Sup001");
            supplierDTO.setSupplier_name("IJSE");

            supplierDTOS.add(supplierDTO);
            return supplierDTOS;
        }

}
