package org.ceg.dao;

import org.ceg.entities.Societe;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface SocieteRepository  extends ReactiveMongoRepository<Societe,String> {
}
