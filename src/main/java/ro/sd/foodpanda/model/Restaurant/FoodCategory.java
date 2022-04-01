package ro.sd.foodpanda.model.Restaurant;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "food_category")
public class FoodCategory {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id_category", updatable = false, nullable = false)
    private int idCategory;

    @Column(name = "name")
    private String name;

    @OneToMany
    @JoinColumn(name = "category")
    private List<MenuItem> menuItems;

    public FoodCategory(String name){
        this.name = name;
    }

}
