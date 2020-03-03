/**
 * 
 */
package com.mindtree.api.corporatebookingservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author M1026334
 *
 */
@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
public class NDCServiceGatewayException extends Exception {

	/**
	 * serialVersionUID.
	 */
	private static final long serialVersionUID = 839376058180682236L;

	/**
	 * @param message
	 */
	public NDCServiceGatewayException(String message) {
		super(message);
	}
	

}
