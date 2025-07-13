package com.trade.model;

import com.trade.domain.VerificationType;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "forgot_password_tokens")
@Data
@NoArgsConstructor
public class ForgotPasswordToken {

    @Id
    private String id;

    @DBRef
    private User user;

    private String otp;

    private VerificationType verificationType;

    private String sendTo;
}
