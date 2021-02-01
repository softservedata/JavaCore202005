package libs;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsWithOurElements {
    WebDriver webDriver;
    Logger logger = Logger.getLogger(getClass());
    WebDriverWait wait1, wait5, wait10, wait15;
    public ActionsWithOurElements(WebDriver webDriver) {
        this.webDriver = webDriver;
        wait10 = new WebDriverWait(webDriver, 10);
        wait15 = new WebDriverWait(webDriver, 15);
        wait5 = new WebDriverWait(webDriver, 5);
        wait1 = new WebDriverWait(webDriver, 1);

    }

    public void enterTextInToElement(WebElement element, String mobile) {
        try {
            element.clear();
            element.sendKeys(mobile);
            logger.info(mobile + " was input into element ");
        } catch (Exception e) {
            printErrorAndStopTest(e);
        }

    }

    private void printErrorAndStopTest(Exception e) {
        logger.error("Cannot work with element" + e);
        Assert.fail("Cannot work with element" + e);
    }

    public void clickOnElement(WebElement element) {
        try {
            element.click();
            logger.info("Element was clicked");
        } catch (Exception e) {
            printErrorAndStopTest(e);
        }
    }
    public boolean isElementPresent (WebElement webElement) {
        try {
            boolean isDisplayed = webElement.isDisplayed();
            logger.info("Element is displayed --> " + isDisplayed);
            return isDisplayed;
        }catch (Exception e) {
            logger.info("Element is displayed --> false");
            return false;
        }
    }

    public void selectTextInDropDown(WebElement element, String text) {
        try {
            Select select = new Select(element);
            select.selectByVisibleText(text);
            logger.info(text + " was selected in DropDown");
        } catch (Exception e) {
            printErrorAndStopTest(e);
        }

    }
    public void selectValueInDropDown(WebElement element, String value) {
        try {
            Select select = new Select(element);
            select.selectByVisibleText(value);
            logger.info(value + " was selected in DropDown");
        } catch (Exception e) {
            printErrorAndStopTest(e);
        }

    }
    public void clickOnTabZayavki(WebElement onTabZayavki) {
        try {
            wait5.until(ExpectedConditions.visibilityOf(onTabZayavki));
            wait5.until(ExpectedConditions.elementToBeClickable(onTabZayavki));
            onTabZayavki.click();
        } catch (WebDriverException wb) {
            logger.error("Element is not clickable");
        }
    }

    public void clickOnButtonCreateZayavky(WebElement buttonCreateZayavka) {
        try {
            wait5.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class = 'spinner-full-screen ng-star-inserted']")));
            wait1.until(ExpectedConditions.visibilityOf(buttonCreateZayavka));
            wait1.until(ExpectedConditions.elementToBeClickable(buttonCreateZayavka)).click();
            //buttonCreateZayavka.click();

            logger.info("buttonCreateZayavka was clicked");
        } catch (Exception e) {
            printErrorAndStopTest(e);
        }
    }

    public void clickOnFieldInputService(WebElement element, String inputNumberService) {


    }

    public void clickOnConfirmOpenZayavka(WebElement clickOnConfirmOpenZayavka) {
        try {
            clickOnConfirmOpenZayavka.click();
            logger.info("clickOnConfirmOpenZayavka was clicked");
        } catch (Exception e) {
            printErrorAndStopTest(e);
        }
    }

    public void enterTextInToFieldInputService(WebElement element, String inputService) {
        try {
            element.clear();
            element.sendKeys(inputService);
            logger.info(inputService + " was input into element ");
        } catch (Exception e) {
            printErrorAndStopTest(e);
        }
    }

    public void clickOnMenuSearchButton(WebElement searchButton) {
            try {
                wait5.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class = 'spinner-full-screen ng-star-inserted']")));
                wait1.until(ExpectedConditions.visibilityOf(searchButton));
//                wait1.until(ExpectedConditions.elementToBeClickable(searchButton)).click();
                searchButton.click();

                logger.info("searchButton was clicked");
            } catch (Exception e) {
                printErrorAndStopTest(e);
            }
        }

    public void clickOnInCategorySearch(WebElement categorySearch) {
        try {
               wait1.until(ExpectedConditions.elementToBeClickable(categorySearch)).click();
            //categorySearch.click();

            logger.info("searchCategory was chosen");
        } catch (Exception e) {
            printErrorAndStopTest(e);
        }
    }

}

