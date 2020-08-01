package org.papermarking.papermarking.repository;



import org.papermarking.papermarking.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;


public interface UserRepository extends MongoRepository<User, String> {

    User findByAuthenticationEmail(String email);

//    User findByEmail(String email);
}
