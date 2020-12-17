package testPages;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingHomepage;
import pageObjects.LoginPage;
import resources.baseclass;

public class HomePageTests extends baseclass {

	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		driver.get(pro.getProperty("us2url"));
		driver.get(pro.getProperty("Flipurl"));
	}

	@Test(priority = 1)
	public void verifyHomePageElements() {
		LandingHomepage l = new LandingHomepage(driver);
		Assert.assertEquals(l.getLoginsignupText().getText(), "Login / Signup");
		Assert.assertTrue(l.OfferText().isDisplayed(), "Offertext is displayed");
		System.out.println("offertext displayed");
	}

	@Test(priority = 2,dataProvider = "getData")
	public void validateLoginpagefunction(String username, String password) {
		LoginPage loginp = new LoginPage(driver);
		loginp.getLoginsignupText().click();
		loginp.getemail().sendKeys(username);
		loginp.getpassword().sendKeys(password);
		loginp.signin().click();
	}
	
	
	
	

	@DataProvider
	public Object[][] getData() {
		// Row stands for how many different data types test should run
		// coloumn stands for how many values per each test

		// Array size is 2
		// 0,1
		Object[][] data = new Object[1][2];
		// 0th row
		data[0][0] = "testingtools711@gmail.com";
		data[0][1] = "Narendra711";

		// 1st row
		/*
		 * data[1][0]="restricteduser@qw.com"; data[1][1]="456788"; data[1][2]=
		 * "Non restricted user";
		 */
		return data;
	}

	@AfterTest
	public void teardown() {

		driver.quit();
	}
}