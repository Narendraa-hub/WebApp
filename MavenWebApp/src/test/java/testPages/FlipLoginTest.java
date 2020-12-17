package testPages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.FlipLoginPage;
import resources.baseclass;

public class FlipLoginTest extends baseclass {

	FlipLoginPage L = new FlipLoginPage(driver);
	
	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		
	}

	@Test(enabled = false)
	public void validateLogin() throws InterruptedException {
		
		L.getPopup().click();

		if (!(L.getLoginButton().getText()).equals("Login")) {

			System.out.println("L.getLoginButton().getText()");
			L.getLoginButton().click();
			L.getEmail().sendKeys("8096780703");
			L.getpass().sendKeys("Narendra711");
			L.getsignin().click();

			Thread.sleep(5000);
			L.getsearch().sendKeys("moboiles");
			L.getsearchbutton().click();

			Thread.sleep(5000);

			Select Mini = new Select(L.getMinimumfield());
			Mini.selectByIndex(1);
			Thread.sleep(5000);
			Select Max = new Select(L.getMaximum());
			Max.selectByIndex(3);

			WebElement Narendra = L.getProfileLogoutOption();
			Actions actions = new Actions(driver);
			actions.moveToElement(Narendra).perform();
			// Narendra.sendKeys(Keys.ARROW_DOWN); //L.getLogout().click();
			System.out.println("already user logged in");

		}

		else {

			L.getsearch().sendKeys("moboiles");
			L.getsearchbutton().click();

			Thread.sleep(5000);
//selecting Item Price Rage by using Select class
			Select Mini = new Select(L.getMinimumfield());
			Mini.selectByIndex(1);
			Thread.sleep(5000);
			Select Max = new Select(L.getMaximum());
			Max.selectByIndex(3);

			List<WebElement> list = driver.findElements(By.xpath("//div[@class=\"_1kidPb\"]/span"));

			System.out.println(list.size());
			for (WebElement links : list) {

				System.out.println(links.getText());

			}
//Printing header line all links
			List<WebElement> three = driver.findElements(By.xpath("//div[@class=\"_1kidPb\"]/a"));

			System.out.println(three.size());
			for (WebElement thre : three) {

				System.out.println(thre.getText());

			}
// Get mobiles names
			List<WebElement> moboilesnames = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
			System.out.println(moboilesnames.size());
			for (WebElement mobi : moboilesnames) {

				System.out.println(mobi.getText());

			}
			
// Getting mobiles costs

			List<WebElement> moboilescost = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
			System.out.println(moboilescost.size());

			for (int i=0; i<moboilescost.size(); i++) {

				System.out.println(i);
				String str = moboilescost.get(i).getText();
				
				ArrayList<String> costs = new ArrayList<String>();
			
				String s1 = str.replaceAll("[?]", "");
				costs.add(s1);

				System.out.println(costs);

				//WebElement realme = driver.findElement(By.xpath("//div[text()='Realme Narzo 20 (Glory Silver, 128 GB)']"));

				if (costs.contains("?10,599")) {

					//realme.click();
					System.out.println("jsdf");

				}

			}

		}
		
		/*
		 * @Test public void addcortFlow() { AddcartPage acp = new AddcartPage(driver);
		 * 
		 * }
		 */
		
		
	}
    @Test
	private void verifyLoginErrorMessage() {
		L.getPopup().click();
		L.getLoginButton().click();
		L.getEmail().sendKeys("8096780703");
		L.getpass().sendKeys("Narendra844");
		L.getsignin().click();
		if(!(L.getLoginErrorMessage().isDisplayed())) {
			L.getsearch().sendKeys("Mobiles");
			System.out.println("user has been Logged in");
			
		}else {
			
			System.out.println("License key is invalid");
		}
		

	} 
    @AfterTest 
	public void teardown()
	{ 
		driver.quit(); 
	}
	
		 
}
