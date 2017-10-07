package com.cucumber.StepDefinitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	format = {"pretty", "html:target/html"},
        features = "src/test/java/com/cucumber/features",
        plugin = { 
                    "pretty",
                    "html:target/cucumber",
                } 

        )
public class RunCukeTest {
}
