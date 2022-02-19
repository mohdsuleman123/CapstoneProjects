package RestAssuredTestCase;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;



public class Test_Delete {
	@Test
	public void PutRequest() {
	
	Response resp=RestAssured
	.given()
	.delete("https://reqres.in/api/users ");

	System.out.println("delete Response body is:"+resp.asString());
	System.out.println("the status response code is :"+resp.getStatusCode());
}
}
	

