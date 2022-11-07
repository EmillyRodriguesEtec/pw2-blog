package br.com.etechoracio.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.etechoracio.jpa.entity.Comentario;
import br.com.etechoracio.jpa.entity.Post;
import br.com.etechoracio.jpa.repository.PostRepository;

@SpringBootApplication
public class Pw2BlogApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Pw2BlogApplication.class, args);

	}

	@Autowired
	private PostRepository postRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		List<Post> lista = postRepository.findAll();
		
		Post post = new Post();
		
		lista.add(post);
		
		Comentario comentario = new Comentario();
		
		lista.add(comentario);
		
		lista.forEach(e -> {
			System.out.println("Id: " + e.getIdPost());
			System.out.println("Título: " + e.getTitulo());
		});
	}

}
