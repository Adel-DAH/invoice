package com.formation.invoise.core.entity.invoise;


import com.formation.invoise.core.entity.customer.Customer;
import com.formation.invoise.core.entity.invoise.InvoiceLine;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Invoise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="INVOICE_NUMBER",columnDefinition="BIGINT")
    private String number;
    @Column(length = 13)
    private String orderNumber;

    @Transient
    private Customer customer;

    private Long idCustomer;
    @OneToMany(
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JoinColumn(name = "INVOICE_NUMBER", nullable = false)
    private List<InvoiceLine> lines=new ArrayList<>();

    public Invoise(String number, String orderNumber, Customer customer) {
        this.number = number;
        this.orderNumber = orderNumber;
        this.customer = customer;
    }

    public Invoise(String number, Customer customer) {
        this.number = number;
        this.customer = customer;
    }

    public Invoise(Customer customer) {
        this.customer = customer;
    }

    public Invoise() {
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public List<InvoiceLine> getLines() {
        return lines;
    }

    public void addLine(InvoiceLine line) {
        this.lines.add(line);
    }

    public void removeLine(InvoiceLine line) {
        this.lines.remove(line);
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Long getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Long idCustomer) {
        this.idCustomer = idCustomer;
    }
}
