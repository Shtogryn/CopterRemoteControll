package com.shtohryn.service;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import com.shtohryn.RESTClientControler.RESTClient;
import com.shtohryn.entity.Copter;

public class CopterService extends BaseService {
    private RESTClient client;

    public CopterService(RESTClient client) {
        super(client);
    }

    public Response getCopterCoordinats(String url) {
        return client.get("http://localhost:8080/Copter", ContentType.JSON);
    }

    public Response setComand(String endpoint, Copter copter) {
        return client.post(endpoint, ContentType.JSON, copter);
    }
}
