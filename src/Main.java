import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static  int menu(){
        int choice;
        System.out.println("Select a choice :");
        System.out.println("1- get company details");
        System.out.println("2- Add department");
        System.out.println("3- Add employee");
        System.out.println("4- Transfer Employee");
        System.out.println("5- Find Employee");
        System.out.println("6- Find Department");
        System.out.println("7- Show Total Salaries");
        System.out.println("0- Exit");
        Scanner sc=new Scanner(System.in);
        do{
            System.out.print("Enter your choice : ");
            choice=sc.nextInt();
        } while(choice<0 || choice>7);

        return choice;
    }
    public static void main(String[] args) {
       /* Department d1=new Department(1,"HR");//call the required args constructor
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

        */

        JobTitle job=JobTitle.MANAGER;
        /*System.out.println(job);
        job=JobTitle.valueOf("Manager".toUpperCase());
        System.out.println(job);*/
        int choice;
        do{
            choice=menu();
            switch (choice)
            {
                case 1:
                    break;
                case 2:
                        break;
                case 3:
                        break;
                case 4:
                        break;
            }
        }while (choice!=0);
    }
}