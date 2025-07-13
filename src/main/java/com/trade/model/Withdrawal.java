package com.trade.model;

import com.trade.domain.WithdrawalStatus;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "withdrawals")
public class Withdrawal {

    @Id
    private String id;

    private WithdrawalStatus status;

    private Long amount;

    @DBRef
    private User user;

    private LocalDateTime date;
}
