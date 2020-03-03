/**
 * 
 */
package com.mindtree.api.corporatebookingservice.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author M1026334
 *
 */
public class DateTest {
	public static void main(String[] args) {
		String[] arrivalDateTime = "2020-04-14T19:45:00".split("T");
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		DateA a = new DateA();
		Date arrivalDate = null;
		try {
			arrivalDate = format.parse(arrivalDateTime[0]);
			a.setArriavlDate(arrivalDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  ObjectMapper mapper = new ObjectMapper();
	        try {
				String writeValueAsString = mapper.writeValueAsString(a);
				System.out.println(writeValueAsString);
			} catch (JsonProcessingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
