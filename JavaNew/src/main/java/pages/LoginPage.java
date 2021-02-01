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

    @FindBy(xpath = "//button[@type='button']")
    private  WebElement invalidLoginButtonOk;

    public void openPage() {

        try {
            webDriver.get("http://b2b-pds.stage.k8s.mc.gcf/");
            logger.info("Login page was opened");
        } catch (Exception e) {
            logger.error("Can not open Login Page" + e);
            Assert.fail("Can not open Login Page" + e);
        }
    }

    public void enterMobileInputLogin(String login) {

        actionsWithOurElements.enterTextInToElement(inputMobile, login);

    }
    public void clickOnButtonSubmit() {

        actionsWithOurElements.clickOnElement(clickOnEnterButton);

    }
    public void enterPassLogin(String pass) {

        actionsWithOurElements.enterTextInToElement(inputPassword, pass);

    }


    public void loginInSiteInvalid(String loginInSiteInvalid) {
        openPage();
        enterMobileInputLogin(loginInSiteInvalid);
        clickOnButtonSubmit();


    }
    public void loginEnterSite(String login, String pass) {
        openPage();
        enterMobileInputLogin(login);
        clickOnButtonSubmit();
        enterPassLogin(pass);
        clickOnButtonSubmit();

    }


    public boolean isWindowErrorMessage() {

        return actionsWithOurElements.isElementPresent(invalidLoginButtonOk);
    }
}

