package lk.ijse.gdse.hello_shoe_pvt_ltd.dao;

import lk.ijse.gdse.hello_shoe_pvt_ltd.entity.SaleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepo extends JpaRepository<SaleEntity, String> {

}
