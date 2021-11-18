package com.minhalojadegames.minhalojadegames.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
<<<<<<< HEAD
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

=======
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModelProperty;

>>>>>>> d49394bdc20ea03f45c6da668a21510a22f5159b
@Entity
@Table(name = "tb_usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
<<<<<<< HEAD
	private Long id;

	@NotNull
	@Size(min = 2, max = 50)
	private String nome;
	
	@NotNull
	@Size(min = 2, max = 50)
	private String usuario;
	
	@NotNull
	@Size(min = 6, max = 15)
	private String senha;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
=======
	private long id;

	@NotNull
	@Size(min = 2, max = 100)
	private String nome;
	
	
	@ApiModelProperty(example = "email@email.com.br")
	@NotNull(message = "O atributo Usuário é Obrigatório!")
	@Email(message = "O atributo Usuário deve ser um email válido!")
	@Size(min = 5, max = 100)
	private String usuario;

	@NotNull
	@Size(min = 5, max = 100)
	private String senha;

	public long getId() {
		return id;
	}

	public void setId(long id) {
>>>>>>> d49394bdc20ea03f45c6da668a21510a22f5159b
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
<<<<<<< HEAD
	
=======
>>>>>>> d49394bdc20ea03f45c6da668a21510a22f5159b

}
