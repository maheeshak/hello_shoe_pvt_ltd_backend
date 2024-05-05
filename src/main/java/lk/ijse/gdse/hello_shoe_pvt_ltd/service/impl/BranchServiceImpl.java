package lk.ijse.gdse.hello_shoe_pvt_ltd.service.impl;

import jakarta.transaction.Transactional;
import lk.ijse.gdse.hello_shoe_pvt_ltd.dao.BranchRepo;
import lk.ijse.gdse.hello_shoe_pvt_ltd.dao.CustomerRepo;
import lk.ijse.gdse.hello_shoe_pvt_ltd.dto.BranchDTO;
import lk.ijse.gdse.hello_shoe_pvt_ltd.entity.BranchEntity;
import lk.ijse.gdse.hello_shoe_pvt_ltd.entity.CustomerEntity;
import lk.ijse.gdse.hello_shoe_pvt_ltd.entity.EmployeeEntity;
import lk.ijse.gdse.hello_shoe_pvt_ltd.service.BranchService;
import lk.ijse.gdse.hello_shoe_pvt_ltd.util.Converter;
import lk.ijse.gdse.hello_shoe_pvt_ltd.util.Mapping;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class BranchServiceImpl implements BranchService {
    private final BranchRepo branchRepo;
    private final Mapping mapping;
    private final Converter converter;

    @Override
    public boolean saveBranch(BranchDTO branchDTO) {
        BranchEntity branchEntity = mapping.toBranchEntity(branchDTO);
        branchRepo.save(branchEntity);
        return true;
    }

    @Override
    public boolean deleteBranch(String id) {
        Optional<BranchEntity> tmpBranch = branchRepo.findById(id);
        if (tmpBranch.isPresent()) {
            branchRepo.delete(tmpBranch.get());
            return true;
        }

        return false;
    }

    @Override
    public boolean updateBranch(BranchDTO branchDTO) {
        Optional<BranchEntity> tmpBranch = branchRepo.findById(branchDTO.getBranch_code());
        if (tmpBranch.isPresent()) {
            converter.convertBranchEntity(branchDTO, tmpBranch.get());
        }

        return true;
    }

    @Override
    public List<BranchDTO> getAllBranches() {
        List<BranchEntity> all = branchRepo.findAll();
        return mapping.toBranchDTOList(all);
    }

    @Override
    public BranchDTO getSelectedBranch(String id) {
        BranchEntity referenceById = branchRepo.getReferenceById(id);
        return mapping.toBranchDTO(referenceById);
    }
}
