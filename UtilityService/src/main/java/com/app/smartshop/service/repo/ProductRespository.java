package com.app.smartshop.service.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.smartshop.service.entity.Product;

@Repository
public interface ProductRespository  extends CrudRepository<Product, Long>{

}
