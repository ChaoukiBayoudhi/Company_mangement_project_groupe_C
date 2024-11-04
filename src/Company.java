import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Scanner;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Company {
    //attributes
    private String name;
    private String phoneNumber;
    private String email;
    private Address address=new Address();
    private ArrayList<Department> departments = new ArrayList();

    public boolean addDepartment(Department department) {
        if(departments.contains(department))
            return false;
        departments.add(department);
        return true;
    }
     public boolean transferEmployee(long employeeId, int newDeptId) {
        //verify if the new department exists or not
        Department department =findDepartment(newDeptId);
        if (department == null)
        {
            System.out.println("Could not find department");
            return false;
        }

        return  true;
     }
     public Department findDepartment(int id)
     {
         Department dept=null;
         int i=0;
         while(i<departments.size() && dept==null) {
             if (departments.get(i).getId() == id)
                 dept = departments.get(i);
             i++;
         }
         return dept;
     }
     void getCompany()
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("name ? ");
         name=sc.nextLine();
         System.out.println("email ? ");
         email=sc.next();
         System.out.println("phone number ? ");
         phoneNumber=sc.next();
         System.out.println("Address ? ");
         address.getAddress();;
     }

    public Department findEmployeeByDept(long idEmployee)
    {
        int i=0;
        Department foundDepartment=null;
        while(i<departments.size() && foundDepartment==null){ //loop through departments
            Employee e1=departments.get(i).findEmployee(idEmployee);
            if(e1==null)
                i++;
            else
                foundDepartment=e1.getDepartment();

        }
        return foundDepartment;
    }
}
