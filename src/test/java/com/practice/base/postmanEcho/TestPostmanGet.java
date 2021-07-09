package com.practice.base.postmanEcho;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPostmanGet {
    PostmanHelper postmanHelper= new PostmanHelper();

    @Test
    public void testGet(){
        Response response = postmanHelper.get("get");
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 201, "code is wrong");
    }
}
