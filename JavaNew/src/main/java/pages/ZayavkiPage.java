package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ZayavkiPage extends ParentPage {
    public ZayavkiPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = "//a[@href='/orders']")
    private WebElement tabZayavki;
    @FindBy(xpath = "//button[contains(@class, 'btn btn-high btn-full')]")
    private WebElement buttonCreateZayavky;
    @FindBy(xpath = "/html/body/app-root/main/app-orders/div/app-order-panel/div/div/app-group-create/div/mat-form-field/div/div[1]/div[3]/input")
    private WebElement fieldInputNumberService;
    @FindBy(xpath = "//*/ng-component/div[2]/button[1]")
    private WebElement confirmOpenNewZayavka;
    @FindBy(xpath = "//header/div[1]/a")
    private WebElement avatar;
    @FindBy(xpath = ".//button[@class='search-new btn btn-full btn-gap-2 mat-focus-indicator mat-flat-button mat-button-base ng-star-inserted']")
    private WebElement searchButton;
    @FindBy(xpath = "//*[@id=\"mat-select-1\"]")
    private WebElement categorySearch;
    @FindBy(xpath = ".//div[@class = 'spinner-full-screen ng-star-inserted']")
    private WebElement spinner;



    public void clickOnTabZayavki() {

        actionsWithOurElements.clickOnTabZayavki(tabZayavki);

    }
    public void clickOnButtonCreateZayavky() {

        actionsWithOurElements.clickOnButtonCreateZayavky(buttonCreateZayavky);


    }
    public void enterTextInToFieldInputService(String inputService) {

        actionsWithOurElements.enterTextInToFieldInputService(fieldInputNumberService, inputService);

    }


    public void clickOnConfirmOpenZayavka() {

        actionsWithOurElements.clickOnConfirmOpenZayavka(confirmOpenNewZayavka);

    }
    public void goToThisPage() {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.loginEnterSite("+380632978641", "1");

        Assert.assertEquals("Avatar is not present", true, isAvatarPresent());
    }
    public boolean isAvatarPresent() {

        return actionsWithOurElements.isElementPresent(avatar);
    }

    public void clickOnMenuSearch() {

        actionsWithOurElements.clickOnMenuSearchButton(searchButton);
    }

    public void clickInCategorySearch() {
        actionsWithOurElements.clickOnInCategorySearch(categorySearch);
    }
}