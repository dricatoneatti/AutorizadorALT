package configuration;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseTest {

    //intermediario vai inicilalizar o chrome
    @Before(value = "@tsprime")
    public void beforeCenarioWeb() {
        getChrome("https://10.113.3.24/PRIME4/TSPrimeRoot/Default.aspx");
    }

/*
    @After(value = "@tsprime")
    public void tearDown() {
        tearDown();*/
    }
