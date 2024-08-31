 package stepDefinition;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class search {
	
	WebDriver driver;
	@Given("The user is on NoBroker website homepage")
	public void the_user_is_on_no_broker_website_homepage() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver = new ChromeDriver();
		driver.get("https://www.nobroker.in/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
	}

	@When("The user click on buy button")
	public void the_user_click_on_buy_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.findElement(By.xpath("//div[text()='Buy']")).click();

	}

	@When("The user select <{string}> in the search field")
	public void the_user_select_in_the_search_field(String Location) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		WebElement location = driver.findElement(By.className("css-19bqh2r"));
        location.sendKeys(Location);

	}

	@When("The user enters <{string}> in the search bar")
	public void the_user_enters_in_the_search_bar(String Locality) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		 WebElement locality = driver.findElement(By.id("listPageSearchLocality"));
	        locality.sendKeys(Locality);
	        locality.click();

	}

	@When("The user selects <{string}> from options")
	public void the_user_selects_from_options(String projectType) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		WebElement propertyTypeOption = driver.findElement(By.name("propertyType"));
        propertyTypeOption.click();
	}

	@When("The user selects <{string}> from offers")
	public void the_user_selects_from_offers(String plotType) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		
		WebElement plotTypeOption = driver.findElement(By.xpath("//span[text()='New Builder Projects']"));
		plotTypeOption.sendKeys(plotType);
        plotTypeOption.click();

	}

	@When("The user click on search button")
	public void the_user_click_on_search_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.findElement(By.xpath("//button[@id]")).click();
	}

	@Then("The user should be on property list page")
	public void the_user_should_be_on_property_list_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.findElement(By.id("listPageContainer")).click();
	}
	
}

