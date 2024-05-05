package lk.ijse.gdse.hello_shoe_pvt_ltd.reqAndresp.secure;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SignUp {
    private String email;
    private String password;
    private String role;
}
