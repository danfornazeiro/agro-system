package com.agro.sensores.domain.exception;

//trata exceção de erros potenciais para regra de negocios
public class RegraNegocioException extends RuntimeException{
	//definir o contrutor
	public RegraNegocioException(String mensagem) {
		//referencia a nossa super classe
		super(mensagem);
	}
}
