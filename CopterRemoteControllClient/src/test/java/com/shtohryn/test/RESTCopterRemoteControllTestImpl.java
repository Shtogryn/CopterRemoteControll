package com.shtohryn.test;

import com.shtohryn.entity.*;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class RESTCopterRemoteControllTestImpl extends RESTCopterRemoteControllTest {
    private Copter copter;
    private String link;
    private String quantity;

    @Test(description = "Verify get all bills")
    public void getAllBillsPositiveTest() {
        repository.copterService().getCopterCoordinats("/coordinats");
        validator.validateStatusCode(200, "Money wasn't added");
    }
}
