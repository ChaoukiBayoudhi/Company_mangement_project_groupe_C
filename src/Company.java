import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Company {
    //attributes
    private String name;
    private String phoneNumber;
    private String email;
    private Address address;
    private ArrayList<Department> departments = new ArrayList();

    public boolean addDepartment(Department department) {
        return true;
    }
     public boolean transferEmployee(long employeeId, int newDeptId) {
        return  true;
     }
}
