package com.pedro.woekshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pedro.woekshopmongo.domain.User;
import com.pedro.woekshopmongo.repository.UserRepository;
import com.pedro.woekshopmongo.services.exception.ObejectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll() {
		return repo.findAll();
		
	}
	
	public User findById(String id) {
		Optional<User> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObejectNotFoundException("Objeto não encontrado"));
		
	}
}
