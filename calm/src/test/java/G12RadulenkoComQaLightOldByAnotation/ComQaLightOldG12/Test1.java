package G12RadulenkoComQaLightOldByAnotation.ComQaLightOldG12;

import java.net.MalformedURLException;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class Test1 extends ParentTest{
	Zapisatsya zapisatsya;
	public Test1(String browser) throws MalformedURLException {
		super(browser);
		
	}

	@Test
	public void test1 (){
		zapisatsya = new Zapisatsya(driver);
		
		zapisatsya.openPage();
		zapisatsya.selectValueInDDKurs("Автоматизация Selenium");
//		zapisatsya.typeLastNameInToInput("Radulenko");
//		zapisatsya.typeFirstNameInTOInput("Taras");
//		zapisatsya.clickOnButtonKupit();
		
//		Assert.assertTrue("Expected result fail",zapisatsya.isErrorMessageOnPage());
		
		

	}
	
	@After
	public void TearDown(){
		zapisatsya.closePage();
	}
	
	
}
