package RestAssuredTestCase;

import org.testng.annotations.Test;import io.restassured.RestAssured;
import io.restassured.response.Response;


@Test
     public class GETRequestDemo { @Test
     public void Get_Request() {
      Response resp=RestAssured.
      given()
     .when()
      .get("https://reqres.in/api/users?page=2");
     String Resp=resp.asString();
     int StatusCode=resp.statusCode();
     System.out.println("The StatusCode " +StatusCode);
     String firstname= resp.jsonPath().getString("data.first_name[3]");
     String id= resp.jsonPath().getString("data.id[3]");
     System.out.println("the value of first_name :"+firstname+"or id is :"+id);
}}

