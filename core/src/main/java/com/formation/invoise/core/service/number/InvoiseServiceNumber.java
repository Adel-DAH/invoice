package com.formation.invoise.core.service.number;

import com.formation.invoise.core.entity.invoise.Invoise;
import com.formation.invoise.core.repository.InvoiseRepositoryInterface;
import com.formation.invoise.core.service.InvoiseServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvoiseServiceNumber implements InvoiseServiceInterface {

    @Autowired
    private InvoiseRepositoryInterface invoiseRepository;

    public InvoiseRepositoryInterface getInvoiseRepository() {
        return invoiseRepository;
    }

    public void setInvoiseRepository(InvoiseRepositoryInterface invoiseRepository) {
        this.invoiseRepository = invoiseRepository;
    }

    @Override
    public Iterable<Invoise> getInvoiseList() {
        return invoiseRepository.findAll();
    }

    @Override
    public Invoise getInvoiseByNumber(String number) {
        return invoiseRepository.findById(number).orElseThrow();
    }




    public Invoise createInvoise(Invoise invoise){

        return invoiseRepository.save(invoise);
    }


}
