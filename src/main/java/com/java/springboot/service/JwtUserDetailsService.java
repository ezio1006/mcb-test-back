package com.java.springboot.service;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		//username = ezio1006 - password = eziopass
		//password is hash - Bcrypt
		if ("ezio1006".equals(username)) {
			return new User("ezio1006", "$2y$10$3fpJ81fAg2VmkDsHLsydSugEB6uSUEt.5mRJgtxkjWE5e9xs9TeK6",
					new ArrayList<>());
		} else {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
	}

}