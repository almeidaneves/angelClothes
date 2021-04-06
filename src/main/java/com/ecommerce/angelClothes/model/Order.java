package com.ecommerce.angelClothes.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Table(name ="pedido")
@Entity
@Data
public class Order extends AngelClothesResponse{
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @OneToOne
    @JoinColumn(name = "product")
    private Product product;
    @Column
    private int quantity;


}
