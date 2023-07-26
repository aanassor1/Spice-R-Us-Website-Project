package com.spice.repo;

import java.util.Optional;

import com.spice.model.SpiceUser;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository for Spice-R-Us User
 */
@Repository
public interface UserRepository extends JpaRepository<SpiceUser, Integer>{
    	
	public Optional<SpiceUser> findByUsername(String username);

	public Optional<SpiceUser> findByEmail(String email);
}
