package br.com.blog.blog.utils;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.blog.blog.model.Post;
import br.com.blog.blog.repository.BlogRepository;

@Component
public class DummyData {
	
	@Autowired
	BlogRepository bogRepository;
	
//	@PostConstruct
	public void savePosts() {
		
		Post post = new Post();
		post.setAutor("Maxsuel Santos");
		post.setData(LocalDate.now());
		post.setTitulo("Java");
		post.setTexto("Java e Orientação a Objetos...");
		
		bogRepository.save(post);
	}
}
