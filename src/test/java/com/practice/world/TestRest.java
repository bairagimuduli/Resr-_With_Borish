package com.practice.world;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class TestRest {
    /**
     * curl --location --request GET 'https://postman-echo.com/get?test=123'
     */
    @Test
    public void testRestAssured() {
        RestAssured.get("https://postman-echo.com/get?test=123").prettyPrint();

    }
}
