package com.formation.invoise.core.controller.scan;

import com.formation.invoise.core.controller.InvoiseControllerInterface;
import com.formation.invoise.core.entity.customer.Customer;
import com.formation.invoise.core.entity.invoise.Invoise;
import com.formation.invoise.core.service.InvoiseServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;

//@Controller
public class InvoiseControllerDouchette implements InvoiseControllerInterface {

    @Autowired
    private InvoiseServiceInterface invoiseService;

    public InvoiseServiceInterface getInvoiseService() {
        return invoiseService;
    }

    public void setInvoiseService(InvoiseServiceInterface invoiseService) {
        this.invoiseService = invoiseService;
    }
    public String createInvoise(Invoise invoise) {

        System.out.println("usage of a scanner ...");
        invoise = new Invoise();
        Customer customer = new Customer("scanned name...");
        invoise.setCustomer(customer);
        invoiseService.createInvoise(invoise);
        return "";

    }
}
