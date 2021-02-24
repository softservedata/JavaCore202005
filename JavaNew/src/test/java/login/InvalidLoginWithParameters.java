package login;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import parentTest.ParentTest;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class InvalidLoginWithParameters extends ParentTest {
    String loginMobile;

    public InvalidLoginWithParameters(String loginMobile) {
        this.loginMobile = loginMobile;
    }

    @Parameterized.Parameters(name = "Parameters are {0}")
    public static Collection testData() {
        return Arrays.asList(new Object[]{
                "+380635929000", "+380635558700",
                 });

    }


    @Test
    public void invalidLogin () {
        loginPage.openPage();
        loginPage.enterMobileInputLogin(loginMobile);
        loginPage.clickOnButtonSubmit();

        checkExpectedResult("Avatar shouldn't present via Login", loginPage.isWindowErrorMessage());
    }
}


