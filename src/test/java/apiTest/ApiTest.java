package apiTest;

import org.junit.jupiter.api.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ApiTest {

    @Test
    void testApi() {

        Response response =
            RestAssured
                .given()
                    .formParam("username", "admin")
                    .formParam("password", "admin123")
                .when()
                    .post("http://localhost:8081/collegeManagment/validateUser.jsp");

        System.out.println("Status Code: " + response.getStatusCode());
        System.out.println("Location: " + response.getHeader("Location"));
        System.out.println("Body: " + response.asString());
    }
}
