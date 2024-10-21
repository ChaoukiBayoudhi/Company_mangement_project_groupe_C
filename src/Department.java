import lombok.*;

import java.util.ArrayList;
//@ToString //redefine the toString() method by returning the value of all fields
@ToString(exclude = {"description","employees"})
@Getter
@Setter
@RequiredArgsConstructor //a constructor with only required fields as parameters
@AllArgsConstructor
public class Department {
    @NonNull
    private int id;
    @NonNull //the name is required
    private String name;
    private String description;
    private ArrayList<Employee> employees=new ArrayList<>();

}
