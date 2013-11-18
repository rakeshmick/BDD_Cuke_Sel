package com.bdd.SeleniumCucumber;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleSearchSteps {
	
	private WebDriver driver;
	  private String baseUrl;
	
	  
	@Before
	public void setUp() throws Exception {
	    driver = new FirefoxDriver();
	    baseUrl = "https://www.google.co.in/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }
	

@Given("^I am in Google home page$")
public void I_am_in_Google_home_page() throws Throwable {
	
	driver.get(baseUrl + "/");
	System.out.println(driver.getTitle());
    driver.findElement(By.id("gbqfq")).clear();
    System.out.println(driver.getTitle());
    
}




@When("^I type  selenium in search field and I click in search button$")
public void I_type_selenium_in_search_field_and_I_click_in_search_button() throws Throwable {
	 driver.findElement(By.id("gbqfq")).sendKeys("Selenium");
	    driver.findElement(By.id("gbqfb")).click();
    
}

@Then("^I should get result selenium$")
public void I_should_get_result_selenium() throws Throwable {
    // Express the Regexp above with the code you wish you had
	assertEquals("Selenium", driver.findElement(By.cssSelector("div.kno-ecr-pt")).getText());
    assertEquals("Selenium - Google Search", driver.getTitle());
   
}
	

	  @After
	  public void tearDown() throws Exception {
	    driver.quit();
	  
	  }

}
