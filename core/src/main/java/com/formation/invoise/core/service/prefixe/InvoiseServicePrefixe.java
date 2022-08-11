package com.formation.invoise.core.service.prefixe;

import com.formation.invoise.core.entity.invoise.Invoise;
import com.formation.invoise.core.repository.InvoiseRepositoryInterface;
import com.formation.invoise.core.service.InvoiseServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

//@Service
public class InvoiseServicePrefixe implements InvoiseServiceInterface {

    @Value("${invoise.lastNumber}")
    private long lastNumber;
    @Value("${invoise.prefixe}")
    private String prefixe;

    public String getPrefixe() {
        return prefixe;
    }

    public void setPrefixe(String prefixe) {
        this.prefixe = prefixe;
    }

    @Autowired
    private InvoiseRepositoryInterface invoiseRepository ;

    public long getLastNumber() {
        return lastNumber;
    }

    public void setLastNumber(long lastNumber) {
        this.lastNumber = lastNumber;
    }

    public InvoiseRepositoryInterface getInvoiseRepository() {
        return invoiseRepository;
    }

    public void setInvoiseRepository(InvoiseRepositoryInterface invoiseRepository) {
        this.invoiseRepository = invoiseRepository;
    }

    public Iterable<Invoise> getInvoiseList() {
        return invoiseRepository.findAll();
    }

    public Invoise createInvoise(Invoise invoise){

        invoise.setNumber(String.valueOf(prefixe + (++lastNumber)));
        invoiseRepository.save(invoise);
        return invoise;
    }

    public Invoise getInvoiseByNumber(String number) {
        return invoiseRepository.findById(number).orElseThrow();
    }
}
