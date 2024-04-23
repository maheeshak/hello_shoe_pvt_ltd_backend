package lk.ijse.gdse.hello_shoe_pvt_ltd.dao;

import lk.ijse.gdse.hello_shoe_pvt_ltd.entity.InventoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepo extends JpaRepository<InventoryEntity, String> {
}
