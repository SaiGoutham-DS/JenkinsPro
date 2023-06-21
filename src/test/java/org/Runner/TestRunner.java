package org.Runner;


import javax.swing.JViewport;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources" , glue="org.StepDefinition")
public class TestRunner {

}
