package common;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleBase {
	
	public WebDriver driver;
	
	public void launchBrowser() {

//pasting code from GoogleSearch (lines 15-19)
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");	
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	}
	
	public void closeBrowser() {
	
		driver.close();
		
	}
}
	