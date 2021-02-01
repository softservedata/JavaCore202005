package searchZayavka;

import org.junit.Test;
import parentTest.ParentTest;

public class SearchZayavka extends ParentTest {
    @Test
    public void addNewCategorySearch() {
        zayavkiPage.goToThisPage();
        zayavkiPage.clickOnMenuSearch();
        zayavkiPage.clickInCategorySearch();

    }

}
