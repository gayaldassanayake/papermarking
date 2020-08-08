package org.papermarking.papermarking.model.fileModel;

import org.papermarking.papermarking.model.userModel.User;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

@org.springframework.data.mongodb.core.mapping.Document(collection = "profileImage")
public class ProfileImage {
    @Id
    private String id;
    @DBRef
    private User user;


}
