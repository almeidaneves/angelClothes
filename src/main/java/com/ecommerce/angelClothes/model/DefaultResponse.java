package com.ecommerce.angelClothes.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DefaultResponse extends AngelClothesResponse{

    private Product product;
    private List<Product> productList;

    private Card card;
    private List<Card> cardList;

    private Payment payment;
    private List<Payment> paymentList;

    private Order order;
    private List<Order> orderList;
}
