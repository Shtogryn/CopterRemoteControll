package com.shtohryn.validate;

import com.shtohryn.RESTClientControler.RESTClient;
import org.testng.Assert;

public class Validator {
    public Validator(RESTClient client) {
        this.client = client;
    }

    private RESTClient client;

    public Validator validateStatusCode(Integer statusCode, String message) {
        Assert.assertEquals(new Integer(client.getResponse().statusCode()), statusCode, message + "\n");
        return this;
    }

    public Validator validateFieldValueIsPresent(String field) {
        String actualValue = client.getResponse().getBody().asString();
        Assert.assertTrue(actualValue.contains(field), "There is no such field");
        return this;
    }
    public Validator validateFieldValueIsNotPresent(String field) {
        String actualValue = client.getResponse().getBody().asString();
        Assert.assertFalse(actualValue.contains(field), "There is no such field");
        return this;
    }
}

