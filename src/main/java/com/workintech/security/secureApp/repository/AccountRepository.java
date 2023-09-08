package com.workintech.security.secureApp.repository;

import com.workintech.security.secureApp.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Integer> {
}
