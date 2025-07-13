package com.trade.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "assets")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Asset {

    @Id
    private String id;

    private double quantity;
    private double buyPrice;

    // Reference to Coin and User (you can use @DBRef or manual id linking)

    @DBRef
    private Coin coin;

    @DBRef
    private User user;
}
