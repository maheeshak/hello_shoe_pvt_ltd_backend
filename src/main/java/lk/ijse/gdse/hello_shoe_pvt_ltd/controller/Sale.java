package lk.ijse.gdse.hello_shoe_pvt_ltd.controller;

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

    @DeleteMapping
    public boolean deleteSale(@RequestParam String order_id){
        return saleService.deleteSale(order_id);
    }

    @PutMapping
    public boolean updateSale(@RequestBody SaleDTO saleDTO){
        return saleService.updateSale(saleDTO);
    }

    @GetMapping("/find")
    public SaleDTO searchSale(@RequestParam String order_id){
        System.out.println(order_id);
        SaleDTO saleDTO = new SaleDTO();
        saleDTO.setOrder_id(order_id);
        return saleDTO;

    }

    @GetMapping
    public SaleDTO getAllSales(){
        SaleDTO saleDTO = new SaleDTO();
        saleDTO.setOrder_id("O001");
        return saleDTO;
    }
}
