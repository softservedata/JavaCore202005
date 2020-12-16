package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class LoginPage extends ParentPage {


    public LoginPage(WebDriver webDriver) {

        super(webDriver);
    }

    public void openPage() {

        try {
            webDriver.get("http://b2b-pds.stage.k8s.mc.gcf/");
            System.out.println("Login page was opened");
        } catch (Exception e) {
            System.out.println("Can not open Login Page" + e);
            Assert.fail("Can not open Login Page" + e);
        }
    }

    public void enterTextInputLogin(String login) {
        try {
            webDriver.findElement(By.xpath("//*[@placeholder='+38(050) XXX XX XX']")).clear();
            webDriver.findElement(By.xpath("//*[@placeholder='+38(050) XXX XX XX']")).sendKeys(login);
            System.out.println(login + " was inputted");
        } catch (Exception e) {
            System.out.println("Can not work with element" + e);
            Assert.fail("Can not work with element" + e);
        }

    }
    public void clickOnButtonSubmit() {
        try {
            webDriver.findElement(By.xpath("//*/button[2]")).click();
            System.out.println(" Button was clicked");
        } catch (Exception e) {
            System.out.println("Can not work with element" + e);
            Assert.fail("Can not work with element" + e);
        }

    }
    public void enterPassLogin(String pass) {
        try {
            webDriver.findElement(By.xpath("//*[@type='password']")).sendKeys(pass);
            System.out.println(pass + " was inputted");
        } catch (Exception e) {
            System.out.println("Can not work with element" + e);
            Assert.fail("Can not work with element" + e);
        }

    }

}
