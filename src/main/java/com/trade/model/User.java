package com.trade.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.trade.domain.USER_ROLE;
import com.trade.domain.UserStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "users")
public class User {

	@Id
	private String id; // Use String for MongoDB ObjectId

	private String fullName;
	private String email;
	private String mobile;

	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private String password;

	private UserStatus status = UserStatus.PENDING;

	private boolean isVerified = false;

	private TwoFactorAuth twoFactorAuth = new TwoFactorAuth(); // Embedded automatically in MongoDB

	private String picture;

	private USER_ROLE role = USER_ROLE.ROLE_USER;
}