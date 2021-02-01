package zayavki;

import org.junit.Test;
import parentTest.ParentTest;

public class CreateZayavka extends ParentTest {
    @Test
    public void createZayavka() {
        zayavkiPage.goToThisPage();
        zayavkiPage.clickOnTabZayavki();
        zayavkiPage.clickOnButtonCreateZayavky();
        zayavkiPage.enterTextInToFieldInputService("0080-0243658");
        zayavkiPage.clickOnButtonCreateZayavky();
        zayavkiPage.clickOnConfirmOpenZayavka();


    }


}
