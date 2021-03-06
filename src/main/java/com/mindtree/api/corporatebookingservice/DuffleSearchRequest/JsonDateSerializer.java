/**
 * 
 */
package com.mindtree.api.corporatebookingservice.DuffleSearchRequest;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

/**
 * @author M1026334
 *
 */
public class JsonDateSerializer extends JsonSerializer<Date>{

private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	@Override
	public void serialize(Date date, JsonGenerator gen, SerializerProvider serializers) 
			throws IOException {
		String formattedDate = dateFormat.format(date);
		gen.writeString(formattedDate);
		
	}

}
