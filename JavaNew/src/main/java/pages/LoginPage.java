package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class LoginPage extends ParentPage {


    public LoginPage(WebDriver webDriver) {

        super(webDriver);
    }

    @FindBy(xpath = "//*[@placeholder='+38(050) XXX XX XX']")
    private WebElement inputMobile;

    @FindBy(xpath = "//*[@type='password']")
    private WebElement inputPassword;

    @FindBy(xpath = "//*/button[2]")
    private WebElement clickOnEnterButton;

    public void openPage() {

        try {
            webDriver.get("http://b2b-pds.stage.k8s.mc.gcf/");
            System.out.println("Login page was opened");
        } catch (Exception e) {
            System.out.println("Can not open Login Page" + e);
            Assert.fail("Can not open Login Page" + e);
        }
    }

    public void enterMobileInputLogin(String login) {
//        try {
//            inputMobile.clear();
//            inputMobile.sendKeys(login);
//            System.out.println(login + " was inputted");
//        } catch (Exception e) {
//            System.out.println("Can not work with element" + e);
//            Assert.fail("Can not work with element" + e);
//        }
        actionsWithOurElements.enterTextInToElement(inputMobile, login);

    }
    public void clickOnButtonSubmit() {
//        try {
//            clickOnEnterButton.click();
//            System.out.println(" Button was clicked");
//        } catch (Exception e) {
//            System.out.println("Can not work with element" + e);
//            Assert.fail("Can not work with element" + e);
//        }
        actionsWithOurElements.clickOnElement(clickOnEnterButton);

    }
    public void enterPassLogin(String pass) {
//        try {
//            inputPassword.sendKeys(pass);
//            System.out.println(pass + " was inputted");
//        } catch (Exception e) {
//            System.out.println("Can not work with element" + e);
//            Assert.fail("Can not work with element" + e);
//        }
        actionsWithOurElements.enterTextInToElement(inputPassword, pass);

    }

}
