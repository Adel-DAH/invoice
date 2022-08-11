package com.formation.invoise.bakingbeans;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class InvoiseBaking {

    private String number;
    @NotBlank(message = "the name of the customer must not be blank")
    private String customerName;
    @Size(min = 10, max = 13,message = "the order number has not the right length")
    private String orderNumber;

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
