package lk.ijse.gdse.hello_shoe_pvt_ltd.service;

import lk.ijse.gdse.hello_shoe_pvt_ltd.dto.BranchDTO;
import lk.ijse.gdse.hello_shoe_pvt_ltd.dto.CustomerDTO;

import java.util.List;

public interface BranchService {
    boolean saveBranch(BranchDTO branchDTO);
    public boolean deleteBranch(String id);
    public boolean updateBranch(BranchDTO branchDTO);
    public List<BranchDTO> getAllBranches();

    BranchDTO getSelectedBranch(String id);
}
