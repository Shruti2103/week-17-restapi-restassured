package com.restapiexample.dummy.studentinfo;

import com.restapiexample.dummy.model.RestApiPojo;
import com.restapiexample.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/*
 *  Created by Jay
 */
public class EmployeeDeleteTest extends TestBase {
    @Test
    public void deleteEmplyee() {


        RestApiPojo restApiPojo = new RestApiPojo();
        restApiPojo.setName("dhyani");
        restApiPojo.setSalary(50000);
        restApiPojo.setAge(30);
        restApiPojo.setId(21);


        Response response = given()
                .header("Content-Type", "application/json")
                .pathParam("id", 1)
                .body(restApiPojo)
                .when()
                .delete("delete/{id}");
        response.then().statusCode(200);
        System.out.println("Data is deleted");
        response.prettyPrint();


    }


}
