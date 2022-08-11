package com.formation.invoise.customer.repository;

import com.formation.invoise.core.entity.customer.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepositoryInterface extends CrudRepository<Customer,Long> {
}
