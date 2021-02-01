package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends ParentPage {
    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = "//header/div[1]/a")
    private WebElement avatar;
    @FindBy(xpath = "//*[@id=\"mat-dialog-0\"]/ng-component/div[2]/button")
    private WebElement errorMobileDD;

    public boolean isAvatarPresent() {

        return actionsWithOurElements.isElementPresent(avatar);

    }

    public boolean isErrorMobileDDPresent() {

        return actionsWithOurElements.isElementPresent(errorMobileDD);
    }
}

