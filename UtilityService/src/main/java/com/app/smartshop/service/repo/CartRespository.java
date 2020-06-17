package com.app.smartshop.service.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.smartshop.service.entity.Cart;
import com.app.smartshop.service.entity.Users;

@Repository
public interface CartRespository extends CrudRepository<Cart, Long> {

	@Query("SELECT c FROM Cart c WHERE  c.userId = ?1")
	public List<Cart> findAllByUsers(String userId);
}
