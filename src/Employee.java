import lombok.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "department")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Employee {
    @EqualsAndHashCode.Include
    private long id;
    private String name;
    private JobTitle job;
    private LocalDate hiredate;
    private double salary;
    private Department department;

    public void getEmployee(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the employee name");
        name=sc.nextLine();
        System.out.println("Enter the employee salary");
        salary= sc.nextDouble();

        //get the LocalDate value from the keyboard
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.print("Enter the employee hiredate : (yyyy-MM-dd) : ");
        hiredate=LocalDate.parse(sc.next(),formatter);

        //get the jobTitle (enum) from the keyboard
        System.out.print("Enter the jobTitle : (analyst,manager, salesman, president, HR, other) : ");
        job =JobTitle.valueOf(sc.next().toUpperCase());
    }
}
