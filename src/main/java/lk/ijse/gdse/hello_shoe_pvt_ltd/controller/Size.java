package lk.ijse.gdse.hello_shoe_pvt_ltd.controller;

import lk.ijse.gdse.hello_shoe_pvt_ltd.dto.SizeDTO;
import lk.ijse.gdse.hello_shoe_pvt_ltd.service.SizeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/size")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class Size  {

    private final SizeService sizeService;

    @PostMapping
    public boolean saveSize(@RequestBody SizeDTO sizeDTO) {
        return sizeService.add(sizeDTO);
    }


    @PutMapping
    public boolean updateSize(@RequestBody SizeDTO sizeDTO) {
        return sizeService.update(sizeDTO);
    }


    @DeleteMapping
    public boolean deleteSize(@RequestParam String size_code) {
        return sizeService.delete(size_code);
    }


    @GetMapping
    public SizeDTO searchSize(@RequestParam String size_code) {
        return sizeService.search(size_code);
    }


    @GetMapping("/all")
    public List<SizeDTO> getAllSizes() {
        return sizeService.getAll();
    }


    @GetMapping("/health")
    public String healthCheck() {
       return "Hello I'm Size Controller. I'm OK! Have a nice day!";
    }
}
