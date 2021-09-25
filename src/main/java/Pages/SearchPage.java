package Pages;

import UI.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchPage {


    WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    By searchBar = By.xpath("//*[@title='Search']");
    By searchButton = By.name("btnK");
    By searchResults = By.xpath("//*[@id='search']//h3");

    public void enterSearchText(String searchValue) {
        BasePage.enterText(searchBar, searchValue);
    }

	public void clickOnGoogleSearchButton(){
        BasePage.clickOnElement(searchButton);
	}

    public void clickOnFirstSeachResult(){
        List<WebElement> element = BasePage.getListOfElement(searchResults);
        element.get(0).click();
    }

    public String getTextFirstSeachResult(){
        List<WebElement> element = BasePage.getListOfElement(searchResults);
        String text = element.get(0).getText();
        return text;
    }




}
