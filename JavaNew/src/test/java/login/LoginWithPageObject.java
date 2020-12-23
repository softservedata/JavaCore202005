package login;
import org.junit.Test;
import parentTest.ParentTest;

public class LoginWithPageObject extends ParentTest {

    @Test
    public void validLogin() {
        loginPage.openPage();
        loginPage.enterMobileInputLogin("+380635929001");
        loginPage.clickOnButtonSubmit();
        loginPage.enterPassLogin("1");
        loginPage.clickOnButtonSubmit();


        checkExpectedResult("Person isn't it", homePage.isAvatarPresent());
    }

    @Test
    public void invalidLogin() {
        loginPage.loginInSite("+380635920000", "1");
        checkExpectedResult("Invalid mobile number", !homePage.isAvatarPresent());
    }
}
