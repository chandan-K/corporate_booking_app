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
public class FlightNotFoundException extends Exception {

	/**
	 * serialVersionUID.
	 */
	private static final long serialVersionUID = 591767798962480896L;

	/**
	 * @param message
	 */
	public FlightNotFoundException(String message) {
		super(message);
	}

}
