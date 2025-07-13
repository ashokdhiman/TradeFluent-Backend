package com.trade.model;

import com.trade.domain.OrderStatus;
import com.trade.domain.OrderType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "orders")
public class Order {

    @Id
    private String id;

    @DBRef
    private User user;

    private OrderType orderType;

    private BigDecimal price;

    private LocalDateTime timestamp;

    private OrderStatus status = OrderStatus.PENDING;

    @DBRef
    private OrderItem orderItem;
}
