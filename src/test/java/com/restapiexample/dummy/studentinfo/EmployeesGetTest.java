package com.restapiexample.dummy.studentinfo;


import com.restapiexample.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

import static io.restassured.RestAssured.given;

/*
 *  Created by Jay
 */
public class EmployeesGetTest extends TestBase {

    @Test
    public void getAllEmplyees() {
        Response response=given()
                .when()
                .get("/employees");
        response.then().statusCode(200);
        response.prettyPrint();

        List<?> totalrecords = response.then().extract().path("data");
        System.out.println("Total records of Emplyees :"+totalrecords.size());

        int id= response.then().extract().path("data[23].id");
        System.out.println("Get emplyee id :"+id);

        String emplyeename= response.then().extract().path("data[23].employee_name");
        System.out.println("Get emplyee name :"+emplyeename);

        String message= response.then().extract().path("message");
        System.out.println("Get emplyoyee :"+message);

        String status= response.then().extract().path(" success");
        System.out.println("Get emplyee status :"+status);

        int employeesalary=response.then().extract().path("data[2].employee_salary");
        System.out.println("Get Employee salary :"+employeesalary);

        int employeeage=response.then().extract().path("data[0].employee_age");
        System.out.println("Get Employee age :"+employeeage);

        String nameEmp= response.then().extract().path("data[10].employee_name");
        System.out.println("Get employee name whose Id is 11 :"+nameEmp);
























    }






    }


