package lk.ijse.gdse.hello_shoe_pvt_ltd.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lk.ijse.gdse.hello_shoe_pvt_ltd.util.Gender;
import lk.ijse.gdse.hello_shoe_pvt_ltd.util.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "employee")
public class EmployeeEntity implements SuperEntity{
    @Id
    private String employee_code;
    private String employee_name;
    private String profile_pic;
    private Gender gender;
    private String status;
    private String Designation;
    private Role role;
    private Date dob;
    private Date joined_date;
    private String branch;
    private String building_no;
    private String lane;
    private String city;
    private String state;
    private String postal_code;
    private String contact;
    private String email;
    private String guardian_name;
    private String emergency_contact;
}