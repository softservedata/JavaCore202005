package login;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.util.concurrent.TimeUnit;

public class Login {
    @Test
    public void validLogin() {
        File file = new File("./src/drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());

        WebDriver webDriver = new ChromeDriver();

        webDriver.manage().window().fullscreen();
        webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        webDriver.get("http://b2b-pds.stage.k8s.mc.gcf/login");

        System.out.println("Site was opened");

        webDriver.findElement(By.xpath("//*[@placeholder='+38(050) XXX XX XX']")).sendKeys("+380635929001");
        webDriver.findElement(By.xpath("//*/button[2]")).click();

        Assert.assertTrue("Login isn ot valid");
        webDriver.quit();
    }
}