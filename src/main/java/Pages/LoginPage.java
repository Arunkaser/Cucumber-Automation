package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	
WebDriver driver;
	
	public  LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By userId = By.xpath("");	
	By password = By.xpath("");
	By SubmitButton = By.xpath("");
	
	public void enterUserId(String userIdText) {
		
	}
}
