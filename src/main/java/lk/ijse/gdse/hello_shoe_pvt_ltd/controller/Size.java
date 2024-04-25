package lk.ijse.gdse.hello_shoe_pvt_ltd.controller;

import lk.ijse.gdse.hello_shoe_pvt_ltd.dto.SaleDTO;
import lk.ijse.gdse.hello_shoe_pvt_ltd.dto.SizeDTO;
import lk.ijse.gdse.hello_shoe_pvt_ltd.service.SizeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/size")
@RequiredArgsConstructor
public class Size {
    private final SizeService sizeService;

    @GetMapping("/health")
    public String healthCheck(){
        return "Hello I'm size controller and I'm okay!";
    }

    @PostMapping
    public boolean saveSize(@RequestBody SizeDTO sizeDTO){
        return sizeService.saveSize(sizeDTO);
    }

    @DeleteMapping
    public boolean deleteSize(@RequestParam String size_id){
        return sizeService.deleteSize(size_id);
    }

    @PutMapping
    public boolean updateSize(@RequestBody SizeDTO sizeDTO){
        return sizeService.updateSize(sizeDTO);
    }

    @GetMapping("/find")
    public SizeDTO searchSize(@RequestParam String size_id){
        System.out.println(size_id);
        SizeDTO sizeDTO = new SizeDTO();
        sizeDTO.setSize_id(size_id);
        return sizeDTO;
    }

    @GetMapping
    public SizeDTO getAllSizes(){
        SizeDTO sizeDTO = new SizeDTO();
        sizeDTO.setSize_id("S001");
        return sizeDTO;
    }
}
