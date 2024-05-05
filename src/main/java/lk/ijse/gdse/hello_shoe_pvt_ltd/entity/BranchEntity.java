package lk.ijse.gdse.hello_shoe_pvt_ltd.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "branch")
public class BranchEntity implements SuperEntity {
    @Id
    private String branch_code;
    private String branch_name;
    private String branch_manager;
    private int no_of_employees;
    private String contact;
    private String address;

    @OneToMany(mappedBy = "branch")
    private List<EmployeeEntity> employees = new ArrayList<>();
}
