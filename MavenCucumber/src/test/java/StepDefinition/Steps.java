package StepDefinition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Steps {
	WebDriver driver;



@Given("Login application present")
public void login_application_present() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\NehaGoel\\Desktop\\SDet\\lib\\geckodriver.exe");
	driver=new FirefoxDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");

	
}

@When("Enter valid Name")
public void enter_valid_name() {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
}


@When("Enter valid password click on submit")
public void enter_valid_password_click_on_submit() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).click();
	  Thread.sleep(3000);
}

	/*
	 * @When("click on submit") public void click_on_submit() throws
	 * InterruptedException { // Write code here that turns the phrase above into
	 * concrete actions
	 */

@Then("Login successful")
public void login_successful() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	String expectedName=driver.findElement(By.id("welcome")).getText();
	  Thread.sleep(3000);
	String ActualName="Welcome Paul";
			Assert.assertEquals(expectedName, ActualName);
	driver.findElement(By.id("welcome")).click();
}

@When("Enter Invalid Name")
public void enter_invalid_name() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	driver.findElement(By.id("txtUsername")).sendKeys("AAdmin");
}


@When("Enter Invalid password  click on submit")
public void enter_invalid_password_click_on_submit() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	driver.findElement(By.id("txtPassword")).sendKeys("admin2123");
	driver.findElement(By.id("btnLogin")).click();
	  Thread.sleep(3000);}



@Then("Login Unsuccessful")
public void login_unsuccessful() {
	
	//String expectedName=driver.findElement(By.id("welcome")).getText();
	String error="Invalid";
			//Assert.assertEquals(expectedName, ActualName);
}
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
}

