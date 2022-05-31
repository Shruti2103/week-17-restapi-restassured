package com.restapiexample.dummy.studentinfo;

import com.restapiexample.dummy.model.RestApiPojo;
import com.restapiexample.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/*
 *  Created by Jay
 */
public class EmployeesPutTest extends TestBase {
    @Test
    public void updateEmplyoee() {


        RestApiPojo restApiPojo = new RestApiPojo();
        restApiPojo.setName("dhyani");
        restApiPojo.setSalary(50000);
        restApiPojo.setAge(30);
        restApiPojo.setId(21);


        Response response = given()
                .header("Content-Type", "application/json")
                .body(restApiPojo)
                .when()
                .put("update/21");
        response.then().statusCode(200);
        response.prettyPrint();


    }
}