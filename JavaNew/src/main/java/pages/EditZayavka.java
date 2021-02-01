package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditZayavka extends ParentPage {
    public EditZayavka(WebDriver webDriver) {
        super(webDriver);
    }
    @FindBy(xpath = "//app-order-edit/div/div[2]/div[2]/span[2]")
    private WebElement fieldWithNumberService;
}
