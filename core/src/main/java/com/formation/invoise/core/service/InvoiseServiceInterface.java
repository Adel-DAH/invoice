package com.formation.invoise.core.service;

import com.formation.invoise.core.entity.invoise.Invoise;
import com.formation.invoise.core.repository.InvoiseRepositoryInterface;

public interface InvoiseServiceInterface {

    Invoise createInvoise(Invoise invoise);
    void setInvoiseRepository(InvoiseRepositoryInterface invoiseRepository);
    Iterable<Invoise> getInvoiseList();

    Invoise getInvoiseByNumber(String number);
}
