package lk.ijse.gdse.hello_shoe_pvt_ltd.controller;

import lk.ijse.gdse.hello_shoe_pvt_ltd.dto.ReturnDTO;
import lk.ijse.gdse.hello_shoe_pvt_ltd.service.ReturnService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/return")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class Return {

    private final ReturnService returnService;



    @PostMapping
    public boolean saveReturn(@RequestBody List<ReturnDTO> returnDTO) {
        return returnService.add(returnDTO);
    }


    @PutMapping
    public boolean updateReturn(@RequestBody ReturnDTO returnDTO) {
        return returnService.update(returnDTO);
    }


    @DeleteMapping
    public boolean deleteReturn(@RequestParam String return_id) {
        return returnService.delete(return_id);
    }


    @GetMapping
    public ReturnDTO searchReturn(@RequestParam String return_id) {
        return returnService.search(return_id);
    }


    @GetMapping("/all")
    public List<ReturnDTO> getAllReturn() {
        return returnService.getAll();
    }


    @GetMapping("health")
    public String healthCheck() {
        return "Hello I'm return Controller. I'm OK! Have a nice day!";
    }
}
