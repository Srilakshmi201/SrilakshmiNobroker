package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PropertySearch {
     WebDriver driver;
     
     public PropertySearch(WebDriver driver) {
    	 this.driver = driver;
    	 PageFactory.initElements(driver, this);
     }
     
     @FindBy(xpath= "//div[contains(@class,'cursor-pointer ') and text()='Buy']")
     WebElement buyButton;
     
     @FindBy(xpath="//button[text()='SEARCH']")
     WebElement searchButton;
      
     @FindBy(xpath="//div[@class='css-16pqwjk-indicatorContainer nb-select__indicator nb-select__dropdown-indicator']")
     WebElement locationDropdown;
     
     @FindBy(xpath="//input[@id='listPageSearchLocality']")
     WebElement locality;
     
     @FindBy(xpath="//span[normalize-space()='Domlur']")
     WebElement nearByLocality1;
     
     @FindBy(xpath="//span[normalize-space()='Halasuru']")
     WebElement nearByLocality2;
     
     @FindBy(xpath="//div[contains(@class,'nb__2A52y') and div[text() ='Full House']]")
     WebElement plotType;
    		 
     @FindBy(xpath="//div[text()='BHK Type']")
     WebElement BHKtype;
     
     @FindBy(xpath="//div[text()='Property Status']")
     WebElement propertyStatus;
     
     @FindBy(xpath="//div[@class='nb-checkbox checkbox']")
     WebElement projectType;
     		
     //main[@id='listPageTop']
     @FindBy(xpath="//span[@id='saveSearch']")
     WebElement propertyListPage;
     
     public void clickBuyButton() {
    	 buyButton.click();
     }
     
     public void clickSearchButton() {
    	 searchButton.click();
     }
     public void selectLocation(String Location) {
    	 locationDropdown.sendKeys(Location);
     }
     
     public void enterLocality(String Locality) {
    	 locality.sendKeys("Indiranagar");
     }
     
     public void selectNearbyLocality1(String Locality1) {
    	 nearByLocality1.sendKeys("Domlur");
    	 
     }
     
     public void selectNearbyLocality2(String Locality2) {
    	 nearByLocality2.sendKeys("Halasuru");
    	 
     }
     
     public void selectPlotType(String PlotType) {
    	 plotType.sendKeys(PlotType);
     }
     
     public void selectBHTType(String BHKType) {
    	 BHKtype.sendKeys(BHKType);
     }
     
     public void selectPropertyStatus(String PropertyStatus) {
    	 propertyStatus.sendKeys(PropertyStatus);
     }
     
     public void selectProjectType(String ProjectType) {
    	 projectType.sendKeys(ProjectType);
     }
     
     public void clickPropertyListPage() {
    	 propertyListPage.click();
     }
}
