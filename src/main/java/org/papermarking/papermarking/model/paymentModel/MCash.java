package org.papermarking.papermarking.model.paymentModel;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "mcash")
public class MCash {
    @org.springframework.data.annotation.Id
    private String Id;
    private String mobile;

    @PersistenceConstructor
    public MCash(String mobile) {
        this.mobile = mobile;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
