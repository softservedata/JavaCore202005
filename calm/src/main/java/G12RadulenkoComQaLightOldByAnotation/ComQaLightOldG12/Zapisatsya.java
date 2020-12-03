package G12RadulenkoComQaLightOldByAnotation.ComQaLightOldG12;


import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Zapisatsya {
	WebDriver driver;
	Logger log;
	
	public Zapisatsya(RemoteWebDriver driver) {
		this.driver = driver;
		log = Logger.getLogger(getClass());
		PageFactory.initElements(driver, this);
	}

	@FindBy (xpath = ".//select")
	WebElement ddKurs;
	
	@FindBy (name = "your-name")
	WebElement inputName;
	
	
	public void openPage() {
		try {
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("http://old.qalight.com/zapisatsya-na-kurs/");
			log.info("Page was opened");
		} catch (Exception e) {
			log.error("Can't Open url");
			Assert.fail("Can't Open url");
		}
		
	}

	public void closePage() {
		driver.close();
		
	}

	public void selectValueInDDKurs(String nameOfKurs) {
		try {
			Select valueFromDD = new Select(ddKurs);
			valueFromDD.selectByValue(nameOfKurs);
			log.info(nameOfKurs + "was selected in DD");
		} catch (Exception e) {
			log.error("Can't work with DD");
			Assert.fail("Can't work with DD");
		}
		
	}

	
	
	
	
}
