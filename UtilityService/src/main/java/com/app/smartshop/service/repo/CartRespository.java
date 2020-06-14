package com.app.smartshop.service.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.smartshop.service.entity.Cart;

@Repository
public interface CartRespository  extends CrudRepository<Cart, Long>{

}
