import lombok.*;

import java.util.ArrayList;
//@ToString //redefine the toString() method by returning the value of all fields
//@ToString(exclude = {"description","employees"})
//@ToString(onlyExplicitlyIncluded = true)
@ToString(of = {})
@Getter
@Setter
@RequiredArgsConstructor //a constructor with only required fields as parameters
@AllArgsConstructor
public class Department {
    @ToString.Include
    @NonNull
    private int id;
    @ToString.Include
    @NonNull //the name is required
    private String name;
    private String description;
    private ArrayList<Employee> employees=new ArrayList<>();

}
