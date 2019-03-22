package org.ceg.dao;

import org.ceg.entities.Transaction;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface TransactionRepository extends ReactiveMongoRepository<Transaction,String> {
}
