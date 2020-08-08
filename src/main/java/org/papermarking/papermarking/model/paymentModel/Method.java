package org.papermarking.papermarking.model.paymentModel;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("paymentMethod")
public class Method {

    @Id
    private String methodId;
    private  String methodType;

    public Method(String methodType) {
        this.methodType = methodType;
    }

    public String getMethodId() {
        return methodId;
    }

    public void setMethodId(String methodId) {
        this.methodId = methodId;
    }

    public String getMethodType() {
        return methodType;
    }

    public void setMethodType(String methodType) {
        this.methodType = methodType;
    }
}
