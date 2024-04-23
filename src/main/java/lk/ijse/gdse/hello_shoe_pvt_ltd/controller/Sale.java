package lk.ijse.gdse.hello_shoe_pvt_ltd.controller;

import lk.ijse.gdse.hello_shoe_pvt_ltd.dto.ReturnDTO;
import lk.ijse.gdse.hello_shoe_pvt_ltd.dto.SaleDTO;
import lk.ijse.gdse.hello_shoe_pvt_ltd.service.SaleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/sale")
@RequiredArgsConstructor
public class Sale {
    private final SaleService saleService;
    @GetMapping("/health")
    public String healthCheck(){
        return "Hello I'm sale controller and I'm okay!";
    }

    @PostMapping
    public boolean saveSale(@RequestBody SaleDTO saleDTO){
        return saleService.saveSale(saleDTO);

    }
}
