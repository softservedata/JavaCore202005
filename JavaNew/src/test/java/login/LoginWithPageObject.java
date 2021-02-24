package login;
import io.qameta.allure.Issue;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.Test;
import parentTest.ParentTest;

public class LoginWithPageObject extends ParentTest {

    @Issue("3655")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    public void validLogin() {
        loginPage.openPage();
        loginPage.enterMobileInputLogin("+380632978641");
        loginPage.clickOnButtonSubmit();
        loginPage.enterPassLogin("1");
        loginPage.clickOnButtonSubmit();


        checkExpectedResult("Person isn't it", homePage.isAvatarPresent());
    }
    @Issue("3655")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    public void unValidLogin() {
        loginPage.openPage();
        loginPage.enterMobileInputLogin("+380632978641");
        loginPage.clickOnButtonSubmit();
        loginPage.enterPassLogin("2");
        loginPage.clickOnButtonSubmit();


        checkExpectedResult("Person isn't it", homePage.isAvatarPresent());
    }

}
