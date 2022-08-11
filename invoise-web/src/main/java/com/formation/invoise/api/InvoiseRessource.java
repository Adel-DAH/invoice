package com.formation.invoise.api;

import com.formation.invoise.core.entity.invoise.Invoise;
import com.formation.invoise.core.service.InvoiseServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/invoise")
public class InvoiseRessource {

    @Autowired
    private InvoiseServiceInterface invoiseService;

    public InvoiseServiceInterface getInvoiseService() {
        return invoiseService;
    }

    public void setInvoiseService(InvoiseServiceInterface invoiseService) {
        this.invoiseService = invoiseService;
    }

    @PostMapping
    public Invoise create(@RequestBody Invoise invoise){
        System.out.println("La methode create a été invoquée");
            return invoiseService.createInvoise(invoise);
    }

    @GetMapping
    public Iterable<Invoise> list(){
        System.out.println("la méthode list a été invoquée");
        return invoiseService.getInvoiseList();
    }
    @GetMapping("/{id}")
    public Invoise displayInvoise(@PathVariable("id")String number){
        System.out.println("la méthode get a été invoquée");
        return invoiseService.getInvoiseByNumber(number);
    }

   /* @GetMapping("/create-form")
    public String displayInvoiseCreateForm(@ModelAttribute InvoiseBaking invoiseBaking){

        return "invoise-create-form";
    }*/
}
