package com.bookstore.service.impl;

import com.bookstore.user.User;
import com.bookstore.user.security.PasswordResetToken;

public interface UserService {
	PasswordResetToken getPasswordResetToken(final String token);

	void createPasswordResetTokenForUser(final User user, final String token);

}
