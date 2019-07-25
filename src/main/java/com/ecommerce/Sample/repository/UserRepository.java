package com.ecommerce.Sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.Sample.entity.UserAccount;

public interface UserRepository extends JpaRepository<UserAccount, String>{
}