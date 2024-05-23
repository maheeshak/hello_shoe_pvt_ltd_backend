package lk.ijse.gdse.hello_shoe_pvt_ltd.controller;

import lk.ijse.gdse.hello_shoe_pvt_ltd.dto.BranchDTO;
import lk.ijse.gdse.hello_shoe_pvt_ltd.service.BranchService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/branch")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class Branch{

    private final BranchService branchService;



    @PostMapping
    public boolean saveBranch(@RequestBody BranchDTO branchDTO) {
        return branchService.add(branchDTO);
    }


    @PutMapping
    public boolean updateBranch(@RequestBody BranchDTO branchDTO) {
        return branchService.update(branchDTO);
    }


    @DeleteMapping
    public boolean deleteBranch(@RequestParam String branch_code) {
        return branchService.delete(branch_code);
    }


    @GetMapping
    public BranchDTO searchBranch(@RequestParam String branch_code) {
        try {

            return branchService.search(branch_code);
        } catch (Exception e) {
            return null;
        }

    }


    @GetMapping("/all")
    public List<BranchDTO> getAllBranches() {
        return branchService.getAll();
    }


    @GetMapping("/health")
    public String healthCheck() {
        return "Hello I'm Branch Controller. I'm OK! and Have a nice day!";
    }

    @GetMapping("/id")
    public String getBranchId() {
        return branchService.getBranchCode();
    }
}
