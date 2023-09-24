package org.example;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    DriverManager driverManager=new DriverManager();
    @Before
    public void setUp(){
        driverManager.openBrowser();
    }
    @After
    public void tearDown(){
        driverManager.closeBrowser();
    }
}
