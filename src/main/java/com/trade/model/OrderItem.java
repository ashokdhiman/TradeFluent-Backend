package com.trade.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "order_items")
public class OrderItem {

    @Id
    private String id;

    private double quantity;

    @DBRef
    private Coin coin;

    private double buyPrice;

    private double sellPrice;

    @JsonIgnore
    @DBRef
    private Order order;
}
