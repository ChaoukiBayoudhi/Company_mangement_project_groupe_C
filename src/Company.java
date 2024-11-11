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
        Department newDepartment =findDepartment(newDeptId);
        if (newDepartment == null)
        {
            System.out.println("Could not find department");
            return false;
        }
        //find the employee
         Department empDepartment = findEmployeeById(employeeId);
        if (empDepartment == null){
            System.out.println("Could not find employee");
            return false;
        }
        //get the employee
         Employee e1=empDepartment.findEmployee(employeeId);
         //remove the employee from the empDepartment (pld dept)
         empDepartment.removeEmployee(employeeId);
        //modify the employee department
         e1.setDepartment(newDepartment);
         //add the employee to the newDepartment
         newDepartment.addEmployee(e1);
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
     public void getCompany()
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

    public Department findEmployeeById(long idEmployee)
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

    public double totalSalaries_v1(){
        double totalSal=0;
        //looping using indexes
        for(int i=0;i<departments.size();i++)//loop through departments
            for(int j=0;j<departments.get(i).getEmployees().size();j++)//loop through employees of each department
                totalSal+=departments.get(i).getEmployees().get(j).getSalary();
        return totalSal;
    }
    public double totalSalaries_v2(){
        double totalSal=0;
        //looping using content
        for(Department dept : departments ){
            for (Employee emp : dept.getEmployees())
                totalSal+= emp.getSalary();
        }
        return totalSal;
    }
}
