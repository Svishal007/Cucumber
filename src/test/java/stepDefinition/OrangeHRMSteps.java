package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class OrangeHRMSteps {
	WebDriver driver;

@Given("User is already login page")
public void user_is_already_login_page() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\TestAutomation\\FreeCRMBDDFramework\\Driver\\Chrome\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.get("https://www.freecrm.co.in//");
    System.out.println("Link opened : ");

}
@When("Title of the login page is Free CRM")
public void title_of_the_login_page_is_Free_CRM() {
 String title = driver.getTitle();
 Assert.assertEquals("Free CRM #1 cloud software for any business large or small", title);
 System.out.println("Title is "+ title);
}
@Then("^user enters \"(.*)\" and \"(.*)\"$")
public void user_enters_username_password(String username, String pwd) {
		/*
		 * JavascriptExecutor js = (JavascriptExecutor)driver; js.executeScript(script,
		 * args)
		 */
	driver.findElement(By.xpath("//span[contains(text(),'Log In')]")).click();
	driver.findElement(By.name("email")).sendKeys(username);
	driver.findElement(By.name("password")).sendKeys(pwd);
	System.out.println("Password provided");

}
@Then("user clicks on login button")
public void user_clicks_on_login_button() {
	driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
	System.out.println("Login successful");
}

@Then("user is on home page")
public void user_is_on_home_page() {
	
	System.out.println("User is at home page");
}

@Then("close the browser")
public void close_the_browser() {
    driver.quit();
}


}
