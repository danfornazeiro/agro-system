package com.agro.sensores.domain.model;

import com.agro.sensores.domain.enuns.UserRole;
/*
//a classe que representa o usuario no dominio (não é entidade/entity JPA)
//descreve regras/constraints que devem ser aplicadas aos dados referentes ao perfil.
//por exemplo: username, senha, entre outros;

public class Usuario {
	//identificador unico do usuário
	private String id;
	
	//login do usuario
	private String login;
	private String senha;
	private UserRole role;
	
	public Usuario(
			String id,
			String login,
			String senha,
			UserRole role
			) {
		this.id= id;
		this.login = login;
		this.senha = senha;
		this.role = role;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public UserRole getRole() {
		return role;
	}

	public void setRole(UserRole role) {
		this.role = role;
	}
}*/

import jakarta.validation.ValidationException;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(exclude = "senha")
public class Usuario {
	private String id;
	
	//login do usuario
	private String login;
	private String senha;
	private UserRole role;
	
	public Usuario(String id,
			String login,
			String senha,
			UserRole role
		) {
		if (login == null || login.isBlank()) {
			throw new ValidationException("login é obrigatório!");
		}
		
		if (senha == null || senha.length() < 6) {
			throw new ValidationException("senha deve ter pelo menos 6 caracteres!");
		}
		
		this.id= id;
		this.login = login;
		this.senha = senha;
		this.role = role;				
	}
	
	public boolean isAdmin() {
		return this.role == UserRole.ADMIN;
	}
}