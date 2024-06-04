package com.pedro.woekshopmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pedro.woekshopmongo.domain.Post;
import com.pedro.woekshopmongo.domain.User;
import com.pedro.woekshopmongo.repository.PostRepository;
import com.pedro.woekshopmongo.services.exception.ObejectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repo;
	
	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObejectNotFoundException("Objeto não encontrado"));
		
	}
}
