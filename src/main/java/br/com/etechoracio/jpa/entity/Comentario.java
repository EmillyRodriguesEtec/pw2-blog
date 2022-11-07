package br.com.etechoracio.jpa.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "TBL_COMENTARIO")
public class Comentario {

	@Id
	@Column(name = "ID_COMENTARIO")
	private Long idComentario;
	
	@Column(name = "TX_CONTEUDO")
    private String conteudo;
	
	@Column(name = "TX_AUTOR")
	private String autor;
	
	@Column(name = "DT_CRIACAO")
	private LocalDateTime dtCriacao;
	
	@JoinColumn (name = "ID_POST")
	@ManyToOne
	private Post idPost;
	
	
}
