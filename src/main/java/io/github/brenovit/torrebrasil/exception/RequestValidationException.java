package io.github.brenovit.torrebrasil.exception;

import java.util.ArrayList;
import java.util.List;

import io.github.brenovit.torrebrasil.payload.error.Error;
import io.github.brenovit.torrebrasil.util.ErrorCode;
import lombok.Getter;

public class RequestValidationException extends GenericException{

	private static final long serialVersionUID = 8487592134793317048L;
	@Getter
	private List<Error> errors;
	
	public RequestValidationException(ErrorCode errorCode, List<Error> listErro) {
		super(errorCode);
		this.errors = new ArrayList<Error>(listErro);
	}
}