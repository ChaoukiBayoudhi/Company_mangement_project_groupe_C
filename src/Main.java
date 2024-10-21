import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Department d1=new Department(1,"HR");//call the required args constructor
        Department d2=new Department(2,"Sales","Sales Department",new ArrayList<>()); // call the all args constructor
        System.out.println(d1);
        System.out.println(d2);
    }
}