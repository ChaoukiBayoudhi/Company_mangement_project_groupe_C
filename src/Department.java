import lombok.*;

import java.util.ArrayList;
//@ToString //redefine the toString() method by returning the value of all fields
//@ToString(exclude = {"description","employees"})
//@ToString(onlyExplicitlyIncluded = true)
@ToString(of = {"id","name","description"})
@Getter
@Setter
@RequiredArgsConstructor //a constructor with only required fields as parameters
@AllArgsConstructor
//@EqualsAndHashCode //redefine the equals method and the hashCode method
//compare two departments using all fields
//@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@EqualsAndHashCode(exclude = "employees")//compare using all fields except employees
public class Department {
   // @ToString.Include
    //@EqualsAndHashCode.Include
    @NonNull
    private int id;
   // @ToString.Include
    @NonNull //the name is required
    private String name;
    private String description;
    private ArrayList<Employee> employees=new ArrayList<>();

}
