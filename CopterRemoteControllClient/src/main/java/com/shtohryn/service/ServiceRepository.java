package com.shtohryn.service;

import com.shtohryn.RESTClientControler.RESTClient;

public class ServiceRepository {
    private RESTClient client;
    public ServiceRepository(RESTClient client) {
        this.client = client;
    }

    public CopterService copterService(){
        return new CopterService(client);
    }
}


