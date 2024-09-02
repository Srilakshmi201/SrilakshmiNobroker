package stepDefinition;
import Pages.PropertySearch;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class search {
	WebDriver driver;
	PropertySearch propertySearch;

	/*@Given("The user is on NoBroker website homepage")
	public void the_user_is_on_no_broker_website_homepage() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver = new ChromeDriver();
		driver.get("https://www.nobroker.in/");
		driver.manage().window().maximize();
		propertySearch = new PropertySearch(driver);
	}

	@When("The user click on buy button")
	public void the_user_click_on_buy_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		propertySearch.clickBuyButton();
	}

	@When("The user select Location from drop down as <{string}>")
	public void the_user_select_location_from_drop_down_as(String Location) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		propertySearch.selectLocation(Location);
	}

	@When("The user click on the search button")
	public void the_user_click_on_the_search_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		propertySearch.clickSearchButton();
	}

	@Then("The the error message should be display")
	public void the_the_error_message_should_be_display() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("The user enter one Locality in search field as <{string}>")
	public void the_user_enter_one_locality_in_search_field_as(String Locality) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		propertySearch.enterLocality("Indiranagar");
	}

	@When("The user select one nearby Locality1 from drop down as <{string}>")
	public void the_user_select_one_nearby_locality1_from_drop_down_as(String Locality1) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		propertySearch.selectNearbyLocality1("Domlur");
	}

	@When("The user select second nearby Locality2 from drop down as <{string}>")
	public void the_user_select_second_nearby_locality2_from_drop_down_as(String Locality2) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		propertySearch.selectNearbyLocality2("Halasuru");
	}

	@Then("The user click on search button")
	public void the_user_click_on_search_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		propertySearch.clickSearchButton();
	}

	@Then("Verify that the search results are displayed based on the entered localities")
	public void verify_that_the_search_results_are_displayed_based_on_the_entered_localities() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		
	}

	@Then("Verify that the system prevents the entry of more than three localities")
	public void verify_that_the_system_prevents_the_entry_of_more_than_three_localities() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("The user enters Locality in the search field as <{string}>")
	public void the_user_enters_locality_in_the_search_field_as(String Location) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		propertySearch.selectLocation(Location);;
	}

	@When("The user select PlotType from options as <{string}>")
	public void the_user_select_plot_type_from_options_as(String Locality) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		propertySearch.enterLocality("Indiranagar");
	}

	@When("The user select <{string}> from drop down")
	public void the_user_select_from_drop_down(String PlotType) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		propertySearch.selectBHTType("Land/Plot");
	}

	@When("The user enters <{string}> in the search field")
	public void the_user_enters_in_the_search_field(String Location) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		propertySearch.enterLocality(Location);
	}

	@When("The user selects <{string}> from options")
	public void the_user_selects_from_options(String ProjectType) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		propertySearch.selectProjectType(ProjectType);
	}

	@When("The user selects <{string}> from drop down")
	public void the_user_selects_from_drop_down(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user selects <{string}> from property drop down")
	public void the_user_selects_from_property_drop_down(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user selects <{string}> from offers")
	public void the_user_selects_from_offers(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be on property list page")
	public void the_user_should_be_on_property_list_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}*/
	
	@Given("The user is on NoBroker website homepage")
	public void the_user_is_on_no_broker_website_homepage() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver = new ChromeDriver();
		driver.get("https://www.nobroker.in/");
		driver.manage().window().maximize();
		propertySearch = new PropertySearch(driver);
	}

	@When("The user click on buy button")
	public void the_user_click_on_buy_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		propertySearch.clickBuyButton();
	}

	@When("The user select Location from drop down as <{string}>")
	public void the_user_select_location_from_drop_down_as(String Location) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		propertySearch.selectLocation(Location);
	}

	@When("The user click on search button")
	public void the_user_click_on_search_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		propertySearch.clickBuyButton();
	}

	@Then("The the error message should be display")
	public void the_the_error_message_should_be_display() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("The user enter one Locality in search field as <{string}>")
	public void the_user_enter_one_locality_in_search_field_as(String Locality) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		propertySearch.enterLocality("Indiranagar");
		
	}

	@When("The user select one nearby Locality1 from drop down as <{string}>")
	public void the_user_select_one_nearby_locality1_from_drop_down_as(String Locality1) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		propertySearch.selectNearbyLocality1("Domlur");
	}

	@When("The user select second nearby Locality2 from drop down as <{string}>")
	public void the_user_select_second_nearby_locality2_from_drop_down_as(String Locality2) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		propertySearch.selectNearbyLocality2("Halasuru");
	}

	@Then("The user click search button")
	public void the_user_click_search_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		propertySearch.clickSearchButton();
	}

	@Then("Verify that the search results are displayed based on the entered localities")
	public void verify_that_the_search_results_are_displayed_based_on_the_entered_localities() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("Verify that the system prevents the entry of more than three localities")
	public void verify_that_the_system_prevents_the_entry_of_more_than_three_localities() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("The user select PlotType from options as <{string}>")
	public void the_user_select_plot_type_from_options_as(String PlotType) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		propertySearch.selectPlotType(PlotType);
	}

	@When("The user select <{string}> from drop down")
	public void the_user_select_from_drop_down(String Location) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		propertySearch.selectLocation(Location);
	}

	@When("The user enters <{string}> in the search field")
	public void the_user_enters_in_the_search_field(String Locality) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		propertySearch.enterLocality(Locality);
		
	}

	@When("The user selects <{string}> from options")
	public void the_user_selects_from_options(String PlotType) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user selects <{string}> from drop down")
	public void the_user_selects_from_drop_down(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user selects <{string}> from property drop down")
	public void the_user_selects_from_property_drop_down(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user selects <{string}> from offers")
	public void the_user_selects_from_offers(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user click on the search button")
	public void the_user_click_on_the_search_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be on property list page")
	public void the_user_should_be_on_property_list_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}



	

}

