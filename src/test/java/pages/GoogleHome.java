package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHome {
	
	WebDriver driver;

	public GoogleHome(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
// pasting line from GoogleSearch after modifying the code
	
// WebElement searchBox = driver.findElement(By.name("q"));
	
	@FindBy(name="q")
	WebElement searchBox;
	
// searchBox.sendKeys(string);
	public void enterSearch(String string) {
		searchBox.sendKeys(string);
	}

//	WebElement searchBtn =driver.findElement(By.name("btnK"));
	@FindBy(name="btnK")
	WebElement searchButton;
	
//	searchBtn.submit();
	public void clickSearch() {
		searchButton.submit();
	}
	

}
