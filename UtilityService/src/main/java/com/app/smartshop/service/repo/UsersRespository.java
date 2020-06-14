package com.app.smartshop.service.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.smartshop.service.entity.Users;

@Repository
public interface UsersRespository  extends CrudRepository<Users, Long>{

	@Query("SELECT u FROM Users u WHERE  u.email = ?1")
	public Users findByEmailUsers(String email);
}
