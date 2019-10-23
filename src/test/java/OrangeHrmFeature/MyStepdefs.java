package OrangeHrmFeature;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;


public class MyStepdefs extends Utils {

    HomePage homePage = new HomePage();
    Dashboard dashboard = new Dashboard();

    @Given("^User is on HomePage$")
    public void userIsOnHomePage() {
        homePage.userOnHomePage();
    }

    @When("^user enter wrong \"([^\"]*)\" and \"([^\"]*)\"$")
    public void userEnterWrongAnd(String User_Name, String Password)  {
        homePage.enterUserNameAndPassword(User_Name,Password);
    }

    @And("^click on login$")
    public void clickOnLogin() {
        homePage.clickOnLogin();
    }

    @Then("^user should see \"([^\"]*)\"$")
    public void userShouldSee(String Login_Failure_Message)  {
        homePage.errorMessage(Login_Failure_Message);
        System.out.println(Login_Failure_Message);
    }

    @When("^user enter correct credentials$")
    public void userEnterCorrectCredentials() {
        homePage.enterValidCredential();
        homePage.clickOnLogin();
    }

    @Then("^user should see dashboard successfully$")
    public void userShouldSeeDashboardSuccessfully() {
        dashboard.toVerifyUserLoggedIn();
    }
}


