package com.trade.service;


import com.trade.domain.VerificationType;
import com.trade.exception.UserException;
import com.trade.model.User;


public interface UserService {

	public User findUserProfileByJwt(String jwt) throws UserException;
	
	public User findUserByEmail(String email) throws UserException;
	
	public User findUserById(String userId) throws UserException;

	public User verifyUser(User user) throws UserException;

	public User enabledTwoFactorAuthentication(VerificationType verificationType,
											   String sendTo, User user) throws UserException;


	User updatePassword(User user, String newPassword);

	void sendUpdatePasswordOtp(String email,String otp);

}
