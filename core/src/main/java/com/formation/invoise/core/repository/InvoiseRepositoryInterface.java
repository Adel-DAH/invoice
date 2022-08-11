package com.formation.invoise.core.repository;

import com.formation.invoise.core.entity.invoise.Invoise;
import org.springframework.data.repository.CrudRepository;

public interface InvoiseRepositoryInterface extends CrudRepository<Invoise,String> {
/*
    Invoise create(Invoise invoise);
    List<Invoise> list();

    Invoise getById(String id);*/
}
