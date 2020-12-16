package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends ParentPage {
    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean isPersonPresent() {
        try {
            return webDriver.findElement(By.xpath("//div[2]/img")).isDisplayed();

        } catch (Exception e) {
            return false;
        }


    }
}
