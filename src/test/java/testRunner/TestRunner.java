package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\admin\\Desktop\\TestAutomation\\FreeCRMBDDFramework\\features\\OrangeHRM.feature", //Path of feature file
		glue = {"stepDefinition"}		//path of step definition file
		//,dryRun = true // check for the missing step
		, plugin = {"pretty","html:test-output", "json:json_outpu/cucumber.json", "junit:junit_xml/cucumber.xml"}  // format= {"pretty","html:test-output"} // output in readable format
		,monochrome = true //display the output in readable format, if its true it will generate pretty output i.e. readable output
		)
public class TestRunner {

}
