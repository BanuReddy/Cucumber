package com.cucumber.StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {

	WebDriver driver;

	@Before
	public void testSetup() {
		System.out.println("Before method");
		System.setProperty("webdriver.chrome.driver", "/Users/anureddy/eclipse-workspace/cucumaven/Drivers/chromedriver");

		driver = new ChromeDriver();

	}

	@After 
	public void testStop() {
		System.out.println("After method");
	}

	@Given("^userid is \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void LoginCredentials(String arg1, String arg2) throws Throwable {

		//driver.get("http://www.facebook.com");
		driver.navigate().to("http://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("banureddyqa@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Anuram7");

	}

	@When("^user clicks on Sign in button$")
	public void SigninButton() throws Throwable {
		driver.findElement(By.id("u_0_5")).click();
		
	}

	@Then("^user is logged in$")
	public void LoginPage() throws Throwable {
		System.out.println("Login page displays");
		
		
	}

	
	@When("^user clicks on \"([^\"]*)\"$")
	public void UserClick(String link) throws Throwable {
		driver.wait(10);
		driver.findElement(By.className("dropdown-toggle")).click();
		
		
	}

	@Then("^click \"([^\"]*)\"$")
	public void Click(String dropItem) throws Throwable {
		Select dropDown = new Select(driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul/li[1]/a")));
		dropDown.selectByVisibleText(dropItem);
	}
	
	
	
}
//end;
