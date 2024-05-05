package lk.ijse.gdse.hello_shoe_pvt_ltd.controller;

import lk.ijse.gdse.hello_shoe_pvt_ltd.dto.BranchDTO;

import lk.ijse.gdse.hello_shoe_pvt_ltd.service.BranchService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/branch")
@RequiredArgsConstructor
public class Branch {
    private final BranchService branchService;
    @GetMapping("/health")
    public String healthCheck(){
        return "Hello I'm branch controller and I'm okay!";
    }

    @PostMapping
    public boolean saveBranch(@RequestBody BranchDTO branchDTO){
        return branchService.saveBranch(branchDTO);

    }


    @PutMapping
    public boolean updateBranch(@RequestBody BranchDTO branchDTO){
        return branchService.updateBranch(branchDTO);
    }

    @DeleteMapping
    public boolean deleteBranch(@RequestParam String branch_code){
        return branchService.deleteBranch(branch_code);
    }

    @GetMapping("/find")
    public BranchDTO searchBranch(@RequestParam String branch_code){
        return branchService.getSelectedBranch(branch_code);

    }

    @GetMapping
    public List<BranchDTO> getAllBranch(){

       return branchService.getAllBranches();
    }

}
