package com.api.testcases;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

/**
 * 
 * @author Sanjana
 *
 */
public class CreateOneEmployeeTest {

	@Test
	public CreateOneEmployeeTest() {
		
		JSONObject jobj=new JSONObject();
		jobj.put("name", "Vicky");
		jobj.put("salary", 30000);
		jobj.put("age", 29);
		
		RequestSpecification req = RestAssured.given();
		req.contentType(ContentType.JSON);
		req.body(jobj.toJSONString());
		
		Response resp = req.post("http://dummy.restapiexample.com/api/v1/create");
		ValidatableResponse res = resp.then();
		res.assertThat().statusCode(201);
		res.assertThat().contentType(ContentType.JSON);
		res.log().all();
		
	}
}
