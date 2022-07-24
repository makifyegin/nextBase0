package com.nextBase.step_definitions;

/*
In the class we will be able to pass pre- & post- conditions to
 each scenario and each step
 */


import com.nextBase.utilities.BrowserUtils;
import com.nextBase.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Hooks {
//
//    //import from io.cucumber.java not from junit
//    @Ramazan (order = 1)
////    public void setupScenario(){
////        Driver.getDriver();
////        //System.out.println("====Setting up browser using cucumber @Before");
////    }

    @Before
    public void setupScenarioForLogins(){
        Driver.getDriver().get("https://login.nextbasecrm.com");
        //System.out.println("====this will only apply to scenarios with @login tag");
    }

//    //@Before (value = "@db", order = 0)
//    public void setupForDatabaseScenarios(){
//        System.out.println("====this will only apply to scenarios with @db tag");
//    }


    @After
    public void teardownScenario(Scenario scenario){

        //scenario.isFailed() --> if scenario fails this method will return TRUE boolean value


        if (scenario.isFailed()){

            byte [] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());

        }


        //BrowserUtils.sleep(5);
        //Driver.closeDriver();

        //System.out.println("====Closing browser using cucumber @After");
        //System.out.println("====Scenario ended/ Take screenshot if failed!");
    }

    //@BeforeStep
    public void setupStep(){
        System.out.println("--------> applying setup using @BeforeStep");
    }

    //@AfterStep
    public void afterStep(){
        System.out.println("--------> applying tearDown using @AfterStep");
    }


}
