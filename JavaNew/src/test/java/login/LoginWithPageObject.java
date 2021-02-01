package login;
import org.junit.Test;
import parentTest.ParentTest;

public class LoginWithPageObject extends ParentTest {

    @Test
    public void validLogin() {
        loginPage.openPage();
        loginPage.enterMobileInputLogin("+380632978641");
        loginPage.clickOnButtonSubmit();
        loginPage.enterPassLogin("1");
        loginPage.clickOnButtonSubmit();


        checkExpectedResult("Person isn't it", homePage.isAvatarPresent());
    }


}
