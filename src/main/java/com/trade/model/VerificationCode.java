package com.trade.model;

import com.trade.domain.VerificationType;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "verification_codes")
public class VerificationCode {

    @Id
    private String id;

    private String otp;

    @DBRef
    private User user;

    private String email;

    private String mobile;

    private VerificationType verificationType;
}