package com.bookstore.repository;

import org.springframework.data.repository.CrudRepository;

import com.bookstore.user.User;

public interface UserRepository extends CrudRepository<User, Long> {
	User findByUsername(String username);

}
