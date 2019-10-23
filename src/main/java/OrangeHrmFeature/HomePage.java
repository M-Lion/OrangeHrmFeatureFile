package OrangeHrmFeature;

import org.openqa.selenium.By;
import org.testng.Assert;

public class HomePage extends Utils {

    LoadProps loadProps = new LoadProps();

    private By _enterUserName = By.id("txtUsername");
    private By _enterPassword = By.id("txtPassword");
    private By _clickOnLogin = By.id("btnLogin");
    private By _errorMessage = By.id("spanMessage");

    public void userOnHomePage () {
        assert_URLMethod("https://opensource-demo.orangehrmlive.com/");
    }
    //Enter UserName
    public void enterUserNameAndPassword (String text, String text1) {
        enterText(_enterUserName, text );
        enterText(_enterPassword, text1);
    }
    //Enter Password
    //public void enterPassword () {
        //enterText(_enterPassword, loadProps.getProperty("Password"));    }
    //Click on Login
    public void clickOnLogin () {
        clickOnElement(_clickOnLogin);
    }
    //To verify expected and actual result will be same
    public void errorMessage (String text) {
        String expectedResult = text;
        String actualResult = extractText(_errorMessage);
        Assert.assertEquals(actualResult, expectedResult);
    }
    //Enter correct credential
    public void enterValidCredential () {
        enterText(_enterUserName, loadProps.getProperty("UserName"));
        enterText(_enterPassword,loadProps.getProperty("Password"));
    }

}
