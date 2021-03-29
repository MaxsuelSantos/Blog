package br.com.blog.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.blog.blog.model.Post;

public interface BlogRepository extends JpaRepository<Post, Long>{

}
