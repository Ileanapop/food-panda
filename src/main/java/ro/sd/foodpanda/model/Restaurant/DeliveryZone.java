package ro.sd.foodpanda.model.Restaurant;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter

@Entity
@Table(name = "delivery_zone")
public class DeliveryZone {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id_zone", updatable = false, nullable = false)
    private int idZone;

    @Column(name = "zone_name")
    private String zoneName;
}
