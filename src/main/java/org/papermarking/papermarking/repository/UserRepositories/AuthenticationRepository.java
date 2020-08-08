package org.papermarking.papermarking.repository.UserRepositories;



import org.papermarking.papermarking.model.userModel.Authentication;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;


public interface AuthenticationRepository extends MongoRepository<Authentication, String> {

    Authentication findByEmailAndPassword(String email , String password);

    Authentication findByEmail(String email);

    List<Authentication> findAllByAccessLevel(int accessLevel);

}
