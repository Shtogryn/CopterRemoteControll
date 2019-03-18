package com.shtohryn.RESTClientControler;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.config.EncoderConfig;
import com.jayway.restassured.config.RestAssuredConfig;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.*;
import com.jayway.restassured.specification.RequestSpecification;
import com.shtohryn.entity.Request;
import com.shtohryn.util.FieldExclusion;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

import static com.jayway.restassured.RestAssured.given;

public class RESTClient {
    private Response response;
    private Request requestData;
    private static Logger logger = LogManager.getLogger(RESTClient.class);
    public Gson gson = new GsonBuilder().addSerializationExclusionStrategy(new FieldExclusion()).create();
    private RestAssuredConfig utfEncoderConfig = RestAssured.config.encoderConfig(new EncoderConfig().defaultContentCharset("UTF-8"));

    public Response getResponse() {
        return response;
    }

    public Response post(String url, ContentType contentType, Object body, Header... headers) {
        RequestSpecification requestSpecification = given()
                .contentType(contentType)
                .config(utfEncoderConfig);
        if (headers != null && headers.length > 0)
            Arrays.stream(headers).forEach(requestSpecification::header);
        Object postBody = body;
        if (!(body instanceof String)) postBody = gson.toJson(body, body.getClass());
        requestData = new Request("POST", url, contentType, postBody, headers);
        response = requestSpecification.body(postBody).
                log().all()
                .when().post(url)
                .then().log().all()
                .extract().response();
        logger.info(response);
        return response;
    }


    public Response get(String url, ContentType contentType, Header... headers) {
        requestData = new Request("GET", url, contentType, null, headers);
        RequestSpecification requestSpecification = given()
                .contentType(contentType)
                .config(utfEncoderConfig);
        if (headers != null && headers.length > 0)
            Arrays.stream(headers).forEach(requestSpecification::header);
        response = requestSpecification.
                log().all()
                .when().get(url)
                .then().log().all()
                .extract().response();
        logger.info(response);
        return response;
    }
}
