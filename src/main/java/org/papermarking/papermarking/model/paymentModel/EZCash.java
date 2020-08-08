package org.papermarking.papermarking.model.paymentModel;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ezcash")
public class EZCash {

    @Id
    private String id;
    private String mobile;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    @PersistenceConstructor
    public EZCash(String mobile) {
        this.mobile = mobile;
    }
}
