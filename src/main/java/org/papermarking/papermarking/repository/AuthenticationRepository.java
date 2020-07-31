package org.papermarking.papermarking.repository;



import org.papermarking.papermarking.model.Authentication;
import org.springframework.data.mongodb.repository.MongoRepository;



public interface AuthenticationRepository extends MongoRepository<Authentication, String> {

    Authentication findByEmailAndPassword(String email , String password);

    Authentication findByEmail(String email);



}
