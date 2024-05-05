package lk.ijse.gdse.hello_shoe_pvt_ltd.dao;

import lk.ijse.gdse.hello_shoe_pvt_ltd.entity.BranchEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BranchRepo extends JpaRepository<BranchEntity, String> {

}
