package com.nextBase.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(


        glue = {"com/nextBase/stepdefinitions","com/nextBase/failedTestHooks"},
        features = "@target/rerun.txt"

)
public class FailedTestRunner {


}
