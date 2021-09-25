package stepDefintions;

import Pages.SearchPage;
import UI.BasePage;
import UI.DriverUtil;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class SearchStpDef {
    SearchPage sp = new SearchPage(DriverUtil.getDriver());

    @Given("^User Launch browser$")
    public void user_Launch_browser() throws InterruptedException {
        System.out.println("Given Condition");
        BasePage.LaunchUrl();
    }

    @When("^User browse \"([^\"]*)\" on google$")
    public void user_browse_on_google(String text) {
        sp.enterSearchText(text);
        sp.clickOnGoogleSearchButton();
    }

    @Then("^User verify the first link$")
    public void user_verify_the_first_link() {
        String firstText = sp.getTextFirstSeachResult();
        Assert.assertTrue(firstText.contains("Walmart"));
    }

    @Then("^User click on first link and verify the title$")
    public void user_click_on_first_link_and_verify_the_title() {
        sp.clickOnFirstSeachResult();
    }

}
