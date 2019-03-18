package com.shtohryn.test;

import com.shtohryn.RESTClientControler.RESTClient;
import com.shtohryn.entity.Copter;
import com.shtohryn.service.BaseService;
import com.shtohryn.service.ServiceRepository;
import com.shtohryn.validate.Validator;
import org.apache.log4j.Logger;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class RESTCopterRemoteControllTest {
    Logger LOG = Logger.getLogger(RESTCopterRemoteControllTest.class);
    RESTClient client = new RESTClient();
    Validator validator = new Validator(client);
    ServiceRepository repository = new ServiceRepository(client);

    @BeforeSuite(alwaysRun = true)
    public void setUp() {
        new BaseService(client);
    }

    @BeforeMethod(alwaysRun = true)
    public void generalTestInit() {
        client = new RESTClient();
        repository = new ServiceRepository(client);
        validator = new Validator(client);
    }

    public void step(String message) {
        LOG.info(message);
    }
}
