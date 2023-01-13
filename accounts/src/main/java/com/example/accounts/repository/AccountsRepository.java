package com.example.accounts.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.accounts.entity.AccountsDO;

@Repository
public interface AccountsRepository extends CrudRepository<AccountsDO, Long> {

	Optional<AccountsDO> findByCustomerId(int customerId);
}
