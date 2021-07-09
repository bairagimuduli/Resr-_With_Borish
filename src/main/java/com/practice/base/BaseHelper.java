package com.practice.base;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.Map;

/**
 * This is project level helper class
 * contains all the basic methods
 * it's the skeleton/back bone of the entire project
 */
public class BaseHelper {

    /**
     * get
     * @param urlParam
     * @return
     */
    public Response get(String urlParam){
        Response response = RestAssured.get(urlParam);
        response.prettyPrint();
        return response;
    }

}
