package com.agro.sensores.domain.exception;

public class ValidacaoException extends RuntimeException{
	//definir o contrutor
	public ValidacaoException(String mensagem) {
		//referencia a nossa super classe
		super(mensagem);
	}

}
