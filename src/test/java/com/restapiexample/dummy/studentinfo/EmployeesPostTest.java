package com.restapiexample.dummy.studentinfo;

import com.restapiexample.dummy.model.RestApiPojo;
import com.restapiexample.dummy.testbase.TestBase;


import io.restassured.response.Response;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

/*
 *  Created by Jay
 */
public class EmployeesPostTest extends TestBase {

    @Test
    public void createEmplyee() {




        RestApiPojo restApiPojo =new RestApiPojo();
        restApiPojo.setName("test");
        restApiPojo.setSalary(123);
        restApiPojo.setAge(23);
        restApiPojo.setId(25);





        Response response=given()
              .header("Content-Type","application/json")
              .body(restApiPojo)
              .when()
              .post("/create");
        response.then().statusCode(200);
        response.prettyPrint();



    }
}
