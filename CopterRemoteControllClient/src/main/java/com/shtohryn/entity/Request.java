package com.shtohryn.entity;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Header;

public class Request {
    private String path;
    private ContentType contentType;
    private Object body;
    private Header[] headers;
    private String method;
    private Gson gson;

    public Request(String method, String path, ContentType contentType, Object body, Header... headers) {
        this.path = path;
        this.contentType = contentType;
        this.body = body;
        this.headers = headers;
        this.method = method;
        gson = new GsonBuilder().setPrettyPrinting().create();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public ContentType getContentType() {
        return contentType;
    }

    public void setContentType(ContentType contentType) {
        this.contentType = contentType;
    }

    public Object getBody() {
        return body;
    }

    public void setBody(Object body) {
        this.body = body;
    }

    public Header[] getHeaders() {
        return headers;
    }

    public void setHeaders(Header[] headers) {
        this.headers = headers;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Gson getGson() {
        return gson;
    }

    public void setGson(Gson gson) {
        this.gson = gson;
    }
}
