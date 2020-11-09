package com.api.testcases;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

/**
 * 
 * @author Sanjana
 *
 */
public class GetAllEmployeesTest {

	@Test
	public GetAllEmployeesTest() {
		
		Response resp = RestAssured.get("http://dummy.restapiexample.com/api/v1/employees");
		
		ValidatableResponse res = resp.then();
		res.assertThat().statusCode(200);
		res.assertThat().contentType(ContentType.JSON);
		
		res.log().all();
	}
}
