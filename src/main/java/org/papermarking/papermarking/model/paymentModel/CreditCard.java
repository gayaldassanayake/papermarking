package org.papermarking.papermarking.model.paymentModel;

import org.papermarking.papermarking.model.userModel.User;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "creditCard")
public class CreditCard {
    @Id
    private String methodId;
    private String cardNumber;
    private String pin;
    private String ownerName;

    @PersistenceConstructor
    public CreditCard(String methodId, String cardNumber, String pin, String ownerName) {
        this.methodId = methodId;
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.ownerName = ownerName;
    }

    public String getMethodId() {
        return methodId;
    }

    public void setMethodId(String methodId) {
        this.methodId = methodId;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

}
