package lk.ijse.gdse.hello_shoe_pvt_ltd.controller;

import lk.ijse.gdse.hello_shoe_pvt_ltd.dto.InventoryDTO;
import lk.ijse.gdse.hello_shoe_pvt_ltd.dto.ReturnDTO;
import lk.ijse.gdse.hello_shoe_pvt_ltd.service.ReturnService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/return")
@RequiredArgsConstructor
public class Return {

    private final ReturnService returnService;
    @GetMapping("/health")
    public String healthCheck(){
        return "Hello I'm return controller and I'm okay!";
    }

    @PostMapping
    public boolean saveReturn(@RequestBody ReturnDTO returnDTO){
        return returnService.saveReturn(returnDTO);

    }

    @DeleteMapping
    public boolean deleteReturn(@RequestParam String return_id){
        return returnService.deleteReturn(return_id);
    }

    @PutMapping
    public boolean updateReturn(@RequestBody ReturnDTO returnDTO){
        return returnService.updateReturn(returnDTO);
    }




}
