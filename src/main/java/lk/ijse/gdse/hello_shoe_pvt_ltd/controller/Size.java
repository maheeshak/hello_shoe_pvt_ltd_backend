package lk.ijse.gdse.hello_shoe_pvt_ltd.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/size")
@RequiredArgsConstructor
public class Size {

    @GetMapping("/health")
    public String healthCheck(){
        return "Hello I'm size controller and I'm okay!";
    }
}
