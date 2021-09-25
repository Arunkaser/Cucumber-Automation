package stepDefintions;

import UI.BasePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStpDef {

    @Given("^User Launch \"([^\"]*)\" browser$")
    public void user_Launch_browser(String browser)  {
        System.out.println("Given Condition");
        BasePage.LaunchUrl();
    }

    @Given("^User browse amazon url$")
    public void user_browse_amazon_url()  {
        
    }

    @When("^User login into to Amazon with valid Credentials$")
    public void user_login_into_to_Amazon_with_valid_Credentials()  {
        
    }

    @Then("^User verify the title of the homepage$")
    public void user_verify_the_title_of_the_homepage()  {
        
    }
}
