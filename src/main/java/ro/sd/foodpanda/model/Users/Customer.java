package ro.sd.foodpanda.model.Users;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id_customer", updatable = false, nullable = false)
    private int idCustomer;

    @Column(name = "username",unique = true, nullable = false)
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "first_name", length = 100)
    private String firstName;

    @Column(name = "last_name", length = 100)
    private String lastName;

    @Column(name = "email", unique = true, nullable = false, length = 100)
    private String email;

    public Customer(String username, String password, String firstName, String lastName, String email){
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

}
