import lombok.*;

import java.util.Scanner;

//@Getter
//@Setter
@NoArgsConstructor
@AllArgsConstructor
//@RequiredArgsConstructor
//@ToString
//@EqualsAndHashCode
@Data // replace the 5 annotations @Getter, @Setter,ToString, EqualsAndHashCode and @RequiredArgsConstructor
public class Address {
    private int id;
    @NonNull
    private int houseNumber;
    @NonNull
    private String streetName;
    @NonNull
    private String city;
    @NonNull
    private String state;
    private String country;
    @NonNull
    private String zipCode;

    public void getAddress()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("id ? ");
        id=sc.nextInt();
        do {
            System.out.println("house number ?");
            houseNumber = sc.nextInt();
        }while (houseNumber<0 ||houseNumber>999);
        System.out.println("Street name ?");
        streetName=sc.nextLine();
        System.out.println("city ?");
        city=sc.nextLine();
        System.out.println("state ?");
        state=sc.nextLine();
        System.out.println("country ?");
        streetName=sc.nextLine();
        System.out.println("zip Code ?");
        zipCode=sc.next();


    }

}
