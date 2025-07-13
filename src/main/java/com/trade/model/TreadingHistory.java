package com.trade.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DBRef;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "treading_history")
public class TreadingHistory {

    @Id
    private String id;

    private double sellingPrice;

    private double buyingPrice;

    // Embedded Coin object (MongoDB allows nested documents)
    private Coin coin;

    @DBRef
    private User user;
}