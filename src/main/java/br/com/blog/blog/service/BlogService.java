package br.com.blog.blog.service;

import java.util.List;

import br.com.blog.blog.model.Post;

public interface BlogService {
	
	List<Post> findAll();
	Post findById(long id);
	Post save(Post post);

}
