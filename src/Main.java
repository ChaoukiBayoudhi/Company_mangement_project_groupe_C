import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Department d1=new Department(1,"HR");//call the required args constructor
        Department d11=new Department(1,"Computer Science");
        Department d2=new Department(2,"Sales","Sales Department",new ArrayList<>()); // call the all args constructor
        Department d3=new Department(3,"Sales","Sales Department",new ArrayList<>()); // call the all args constructor
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        if(d3.equals(d2))
            System.out.println("The same department");
        else
            System.out.println("Different departments");
    if(d1.equals(d11))
            System.out.println("The same department");
        else
            System.out.println("Different departments");
    }
}