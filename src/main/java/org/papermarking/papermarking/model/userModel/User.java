package org.papermarking.papermarking.model.userModel;


import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class User {
    @Id
    private String id;
    private String email;
    private String name;
    private int telephone;
    private int type;
    private int state;
    private Date createdAt;
    private Date updatedAt;
    private Date lastLoggedAt;

    

}

