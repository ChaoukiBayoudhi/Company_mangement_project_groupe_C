import lombok.*;

import java.util.ArrayList;
@ToString
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
