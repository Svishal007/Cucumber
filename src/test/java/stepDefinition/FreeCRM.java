package stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class FreeCRM {
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

// we can use either  \"([^\*)\"  or \"(.*)\"
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
	String hometitle = driver.getTitle();
	Assert.assertEquals("Cogmento CRM", hometitle);
	System.out.println("User is at home page ****************");
}
@Then("user moves to new contact page")
public void user_moves_to_new_contact_page() throws Exception {
	//driver.findElement(By.partialLinkText("https://ui.freecrm.com/contacts/new")).click();
	driver.navigate().to("https://ui.freecrm.com/contacts/new");
	Thread.sleep(5000);
}
@Then("user enters contact details {string} and {string} and {string}")
public void user_enters_contact_details(String firstname, String lastname, String position) {
//	driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys(firstname);
//	driver.findElement(By.name("last_name")).sendKeys(lastname);
//	driver.findElement(By.name("position")).sendKeys(position);
	
}



@Then("close the browser")
public void close_the_browser() {
    //driver.quit();
}


}
