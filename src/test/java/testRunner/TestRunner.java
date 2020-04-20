package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\admin\\Desktop\\TestAutomation\\FreeCRMBDDFramework\\features\\OrangeHRM.feature",
		glue = {"stepDefinition"}		//, format= {"pretty","html:test-output"}
		)
public class TestRunner {

}
