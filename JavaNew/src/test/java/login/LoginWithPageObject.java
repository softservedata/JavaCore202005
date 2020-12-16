package login;
import org.junit.Assert;
import org.junit.Test;
import parentTest.ParentTest;

public class LoginWithPageObject extends ParentTest {

    @Test
    public void validLogin() {
        loginPage.openPage();
        loginPage.enterTextInputLogin("+380635929001");
        loginPage.clickOnButtonSubmit();
        loginPage.enterPassLogin("1");
        loginPage.clickOnButtonSubmit();


        checkExpectedResult("Person isn't it", homePage.isPersonPresent());
    }

}
