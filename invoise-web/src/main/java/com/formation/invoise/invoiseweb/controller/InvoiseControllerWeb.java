package com.formation.invoise.invoiseweb.controller;

import com.formation.invoise.bakingbeans.InvoiseBaking;
import com.formation.invoise.core.entity.customer.Customer;
import com.formation.invoise.core.entity.invoise.Invoise;
import com.formation.invoise.core.service.InvoiseServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/invoise")
public class InvoiseControllerWeb{

    @Autowired
    private InvoiseServiceInterface invoiseService;

    public InvoiseServiceInterface getInvoiseService() {
        return invoiseService;
    }

    public void setInvoiseService(InvoiseServiceInterface invoiseService) {
        this.invoiseService = invoiseService;
    }

    @PostMapping("/create")
    public String createInvoise(@Valid @ModelAttribute InvoiseBaking invoiseBaking, BindingResult results){
        System.out.println("La methode create invoise a été invoquée");
        System.out.println(invoiseBaking.getCustomerName());
        System.out.println(invoiseBaking.getOrderNumber());
        if(results.hasErrors()){
            return "invoise-create-form";
        }else {
            Invoise invoise = new Invoise();
            Customer customer = new Customer(invoiseBaking.getCustomerName());
            invoise.setCustomer(customer);
            invoise.setOrderNumber(invoiseBaking.getOrderNumber());
            invoiseService.createInvoise(invoise);
            return "invoise-created";
        }
    }

    @GetMapping("/home")
    public String displayHome(Model model){
        System.out.println("la méthode displayHome a été invoquée");
        model.addAttribute("invoises",invoiseService.getInvoiseList());
        return "invoise-home";
    }

   /* @GetMapping("/{id}")
    public ModelAndView displayInvoise(@PathVariable("id")String number){
        System.out.println("la méthode displayInvoise a été invoquée");
        ModelAndView mv = new ModelAndView("invoise-details");
        mv.addObject("invoise",invoiseService.getInvoiseByNumber(number));
        return mv;
    }*/

    @GetMapping("/create-form")
    public String displayInvoiseCreateForm(@ModelAttribute InvoiseBaking invoiseBaking){

        return "invoise-create-form";
    }
}
