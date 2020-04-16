package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHRMSteps {
	WebDriver driver;

@Given("I launch chrome browser")
public void i_launch_chrome_browser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\TestAutomation\\FreeCRMBDDFramework\\Driver\\Chrome\\chromedriver.exe");
     driver = new ChromeDriver();
     
    
}

@When("I open orange HRM page")
public void i_open_orange_HRM_page() {
	driver.get("https://www.orangehrm.com/");
    
}

@Then("I Verify that the logo present on page")
public void i_Verify_that_the_logo_present_on_page() {
	driver.findElement(By.className("nav-logo")).isDisplayed();
    
}

@Then("close browser")
public void close_browser() {
	driver.quit();
    
}




}
