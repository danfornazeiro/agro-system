package com.agro.sensores.domain.exception;

public class RecursoNaoEncontradoException extends RuntimeException{
	public RecursoNaoEncontradoException(String mensagem) {
		//referencia a nossa super classe
		super(mensagem);
	}
}

// tratamento de exceptions via RuntimeException
//unchecked exception - não no obriga o tratamento
//Exception - é uma checked exception - obrigado a tratar
//precisamos ter algo como ex: try/catch -> throws

//o uso do runtimeexception nesta camada nos dá a possibilidade de tratar 
//erros que não são necessariament do sistema e sim, 
//algo pontual referente aos dados