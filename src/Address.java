import lombok.*;

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

}
