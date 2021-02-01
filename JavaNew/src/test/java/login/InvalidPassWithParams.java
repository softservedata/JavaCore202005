package login;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import parentTest.ParentTest;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class InvalidPassWithParams extends ParentTest {
    String loginMobile;
    String passMobile;

    public InvalidPassWithParams(String loginMobile, String passMobile) {
        this.loginMobile = loginMobile;
        this.passMobile = passMobile;
    }

    @Parameterized.Parameters(name = "Parameters are {0}, {1}")
    public static Collection testData() {
        return Arrays.asList(new Object[][]{
                {"+380635929001", "3"},
                {"+380635929001", "2"},
                });

    }

    @Test
    public void invalidPassword () {
        loginPage.openPage();
        loginPage.enterMobileInputLogin(loginMobile);
        loginPage.clickOnButtonSubmit();
        loginPage.enterPassLogin(passMobile);
        loginPage.clickOnButtonSubmit();

        checkExpectedResult("Avatar shouldn't present", !homePage.isAvatarPresent());

    }

}


