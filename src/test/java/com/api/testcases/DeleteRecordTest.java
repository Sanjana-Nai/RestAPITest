package com.api.testcases;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

/**
 * 
 * @author Sanjana
 *
 */
public class DeleteRecordTest {

	@Test
	public DeleteRecordTest() {
		
		Response resp = RestAssured.delete("http://dummy.restapiexample.com/api/v1/delete/ID");
		int code = resp.getStatusCode();
		System.out.println(code);
		
		String line = resp.getStatusLine();
		System.out.println(line);
		
	}
}
