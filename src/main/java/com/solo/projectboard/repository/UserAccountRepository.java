package com.solo.projectboard.repository;

import com.solo.projectboard.domain.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public class UserAccountRepository extends JpaRepository<UserAccount, Long> {
}
