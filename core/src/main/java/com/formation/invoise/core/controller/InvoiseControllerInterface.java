package com.formation.invoise.core.controller;

import com.formation.invoise.core.entity.invoise.Invoise;
import com.formation.invoise.core.service.InvoiseServiceInterface;

public interface InvoiseControllerInterface {

    String createInvoise(Invoise invoise);
    void setInvoiseService(InvoiseServiceInterface invoiseService);
}
