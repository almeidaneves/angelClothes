package com.ecommerce.angelClothes.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name="card")
@NoArgsConstructor
@AllArgsConstructor
public class Card extends AngelClothesResponse{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @OneToMany(mappedBy = "orders")
    private List<Order> orders;
    @Column
    private double valorTotal;
    @Column
    private Payment payments;
}
