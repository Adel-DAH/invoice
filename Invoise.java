package com.formation.invoise.core.entity;

import javax.persistence.*;

@Entity
public class Invoise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="INVOICE_NUMBER",columnDefinition = "BIGINT")
    private String number;
    @Column(nullable = false,length = 50)
    private String customerName;
    @Column(length = 50)
    private String orderNumber;

    public Invoise(String number, String customerName) {
        this.number = number;
        this.customerName = customerName;
    }

    public Invoise(String number, String customerName, String orderNumber) {
        this.number = number;
        this.customerName = customerName;
        this.orderNumber = orderNumber;
    }

    public Invoise() {
    }

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
