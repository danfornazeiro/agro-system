package com.agro.sensores.domain.model;

import java.security.PrivateKey;

import com.agro.sensores.domain.enuns.TipoSensor;

import jakarta.validation.ValidationException;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Sensor {
	private String id;
	private String nome;
	private String localizacao;
	private TipoSensor tipo;
	private boolean ativo;
	
	public Sensor(
			String id,
			String nome,
			String localizacao,
			TipoSensor tipo,
			boolean ativo
		) {
		
		if (nome == null || nome.isBlank()) {
			throw new ValidationException("Nome do sensor é obrigatório");
		}

		if (localizacao == null || localizacao.isBlank()) {
			throw new ValidationException("Localização do senhor é obrigatório");
		}
		
		if (tipo == null) {
			throw new ValidationException("Tipo do senhor é obrigatório");
		}


		this.id = id;
		this.nome = nome;
		this.localizacao = localizacao;
		this.tipo = tipo;
		this.ativo = ativo;
	}
	
	//comportamentos do dominio
	public void Ativar() {
		this.ativo = true;
	}
	
	public void desativar() {
		this.ativo = false;
	}
	
	public boolean isAtivo() {
		return ativo;
	}
}
