package com.formation.invoise.core.controller.keyboard;

import com.formation.invoise.core.controller.InvoiseControllerInterface;
import com.formation.invoise.core.entity.customer.Customer;
import com.formation.invoise.core.entity.invoise.Invoise;
import com.formation.invoise.core.service.InvoiseServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Scanner;

//@Controller
public class InvoiseControllerKeyBord implements InvoiseControllerInterface {

    @Autowired
    private InvoiseServiceInterface invoiseService;

    public InvoiseServiceInterface getInvoiseService() {
        return invoiseService;
    }

    public void setInvoiseService(InvoiseServiceInterface invoiseService) {
        this.invoiseService = invoiseService;
    }

    public String createInvoise(Invoise invoise){
        System.out.println( "please enter the name of the customer:" );
        Scanner sc = new Scanner(System.in);
        String customerName = sc.next();
        invoise = new Invoise();
        Customer customer = new Customer(customerName);
        invoise.setCustomer(customer);
        invoiseService.createInvoise(invoise);
        return "";
    }
}
