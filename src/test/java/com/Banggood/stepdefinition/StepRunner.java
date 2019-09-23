package com.Banggood.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"Features"}, glue="com.Banggood.stepdefinition" , plugin= {"html:target","rerun:src/test/resources/failed.txt"}, monochrome=true)

public class StepRunner {

}
