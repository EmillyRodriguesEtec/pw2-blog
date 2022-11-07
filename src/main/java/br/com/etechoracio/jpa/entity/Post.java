package br.com.etechoracio.jpa.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "TBL_POST")
public class Post {

	@Id
	@Column(name = "ID_POST")
	private Long idPost;
	
	@Column(name = "TX_TITULO")
	private String titulo;
	
	@Column(name = "TX_CONTEUDO")
	private String conteudo;
	
	@Column(name = "DT_CRIACAO")
	private LocalDateTime dtCriacao;
	
	
}
