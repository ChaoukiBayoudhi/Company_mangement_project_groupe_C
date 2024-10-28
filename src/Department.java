import lombok.*;

import java.util.ArrayList;
import java.util.Scanner;

//@ToString //redefine the toString() method by returning the value of all fields
//@ToString(exclude = {"description","employees"})
//@ToString(onlyExplicitlyIncluded = true)
@ToString(of = {"id","name","description"})
@Getter
@Setter
@RequiredArgsConstructor //a constructor with only required fields as parameters
//@AllArgsConstructor
//@EqualsAndHashCode //redefine the equals method and the hashCode method
//compare two departments using all fields
//@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@EqualsAndHashCode(exclude = "employees")//compare using all fields except employees
public class Department {
   // @ToString.Include
    //@EqualsAndHashCode.Include
    //@NonNull
    private int id;
    private static int lastId=0;
   // @ToString.Include
    @NonNull //the name is required
    private String name;
    private String description;
    private ArrayList<Employee> employees=new ArrayList<>();

    public Department() {
        id=++lastId;
        name="";
    }

    public Department(@NonNull String name, String description, ArrayList<Employee> employees) {
        this.id=++lastId;
        this.name = name;
        this.description = description;
        this.employees = employees;
    }

    //get department information from the keyboard
    public void getDepartment(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the department name");
        name=sc.nextLine();
        System.out.println("Enter the department description");
        description=sc.nextLine();

    }
    //find Employee by id
    //returns null if not found or the employee if not
    public Employee findEmployee(long id){
        Employee foundEmp=null;
        //...
        return foundEmp;
    }
     public boolean addEmployee(Employee employee)
     {
        Employee foundEmp=findEmployee(employee.getId());
        if(foundEmp!=null)
            return false;
        employees.add(employee);
        return true;

     }

}
