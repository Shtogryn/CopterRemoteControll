package com.shtohryn.service;

import com.jayway.restassured.RestAssured;
import com.shtohryn.RESTClientControler.RESTClient;

public class BaseService {
    protected RESTClient client;

    public BaseService(RESTClient client) {
        this.client = new RESTClient();
        RestAssured.baseURI = "url";
    }
}
