package com.practice.base.postmanEcho;

import com.practice.base.BaseHelper;
import io.restassured.response.Response;

/**
 * Specific to a service
 * It contains helper methods for the service only
 */
public class PostmanHelper {
    public static String url = "https://postman-echo.com/";

    BaseHelper baseHelper = new BaseHelper();

    public Response get(String pathParam){
        Response response = baseHelper.get(url+pathParam);
        return response;
    }

}
