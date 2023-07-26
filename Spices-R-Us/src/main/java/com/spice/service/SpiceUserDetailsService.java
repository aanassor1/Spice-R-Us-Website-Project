package com.spice.service;

import java.util.Optional;

import com.spice.model.SpiceUser;
import com.spice.repo.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class SpiceUserDetailsService implements UserDetailsService{
	
	@Autowired
	private UserRepository userRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<SpiceUser> user = userRepo.findByUsername(username);
		
		user.orElseThrow( () -> new UsernameNotFoundException("User not found with that username"));
		
		return user.map(SpiceUserDetails::new).get();
	}

}
