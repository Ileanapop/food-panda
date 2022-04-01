package ro.sd.foodpanda.model.Users;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ro.sd.foodpanda.model.Restaurant.Restaurant;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "administrator")
public class Administrator {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id_administrator", updatable = false, nullable = false)
    private int idAdministrator;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @OneToOne(mappedBy = "administrator")
    private Restaurant restaurant;

    public Administrator(String username, String password){
        this.username = username;
        this.password = password;
    }
}
