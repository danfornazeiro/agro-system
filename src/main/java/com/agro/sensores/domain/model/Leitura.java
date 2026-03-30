package com.agro.sensores.domain.model;

import java.time.LocalDateTime;
import java.time.chrono.MinguoChronology;

import com.agro.sensores.domain.exception.ValidacaoException;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Leitura {
	private Long id;
	private String sensorId;
	private Double valor;
	private LocalDateTime dataHora;
	
	public Leitura(
			Long id,
			String sensorId,
			Double valor,
			LocalDateTime dataHora)
	{
		
		//validações
		if (sensorId == null || sensorId.isBlank()) {
			throw new ValidacaoException("SensorId é obrigatório");
		}
		
		if (valor == null) {
			throw new ValidacaoException("Valor de leitura é obrigatório");
		}
		
		if (dataHora == null) {
			throw new ValidacaoException("Data/hora é obrigatório");
		}

		
		this.id = id;
		this.sensorId = sensorId;
		this.valor = valor;
		this.dataHora = dataHora;
	}
	
	public boolean isRecent() {
		return dataHora.isAfter(LocalDateTime.now().minusHours(1));
	}
	
	public boolean isValorValido(double min, double max) {
		return valor >= min && valor <= max;
	}
}
