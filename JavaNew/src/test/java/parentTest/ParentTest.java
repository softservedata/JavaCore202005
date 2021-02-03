package parentTest;

import libs.ConfigProperties;
import org.aeonbits.owner.ConfigFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import pages.EditZayavka;
import pages.HomePage;
import pages.LoginPage;
import pages.ZayavkiPage;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class ParentTest {
    WebDriver webDriver;
    protected static ConfigProperties configProperties
            = ConfigFactory.create(ConfigProperties.class);
    protected LoginPage loginPage;
    protected HomePage homePage;
    protected ZayavkiPage zayavkiPage;
    protected EditZayavka editZayavkapage;

    String browser = System.getProperty("browser");



    @Before
    public void setUp() {
        initDriver();

        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage = new LoginPage(webDriver);
        homePage = new HomePage(webDriver);
        zayavkiPage = new ZayavkiPage(webDriver);
        editZayavkapage = new EditZayavka(webDriver);

    }

    @After
    public void tearDown(){
        webDriver.quit();

    }
    protected void checkExpectedResult(String message, boolean actualResult) {
        Assert.assertEquals(message, true, actualResult);
    }

    private void initDriver() {
        if (browser == null || "chrome".equals(browser.toLowerCase())) {
            File file = new File("./src/driver/chromedriver.exe");
            System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());

            webDriver = new ChromeDriver();
        }
        else if ("firefox".equals(browser.toLowerCase())) {
            File file = new File("./src/driver/geckodriver.exe");
            System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
            FirefoxOptions profile = new FirefoxOptions();
            profile.addPreference("browser.startup.page", 0);
            profile.addPreference("browser.startup.homepage_override.mstone", "ignore");

            webDriver = new FirefoxDriver();
        }

    }
}
