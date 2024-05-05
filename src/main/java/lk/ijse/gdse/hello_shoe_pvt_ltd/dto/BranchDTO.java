package lk.ijse.gdse.hello_shoe_pvt_ltd.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BranchDTO implements SuperDTO{
    private String branch_code;
    private String branch_name;
    private String branch_manager;
    private int no_of_employees;
    private String contact;
    private String address;

    private List<EmployeeDTO> employees;


}
