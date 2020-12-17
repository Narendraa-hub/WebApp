package testPages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObjects.automationLoginPage;
import resources.baseclass;

public class AutomationLoginTest extends baseclass {

	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		driver.get(pro.getProperty("automationsiteurl"));
	}

	@Parameters({ "Email", "pass" })
	@Test
	public void Login(String Email, String pass) throws InterruptedException {

		automationLoginPage alp = new automationLoginPage(driver);
		alp.getsigninButton().click();
		alp.getemailfield().sendKeys(Email);
		alp.getpassfile().sendKeys(pass);
		alp.getsignin().click();

		WebElement wlink = alp.getwomanlink();
		Actions actions = new Actions(driver);
		actions.moveToElement(wlink).perform();
		alp.getTshertLink().click();
		WebElement fadedTsher = alp.getFadedTshert();
//moving curser on item.		
		Thread.sleep(5000);
		actions.moveToElement(fadedTsher).perform();
		alp.getAddCart().click();
		Thread.sleep(8000);
//Getting cost of item		
		String pc = alp.getProductcost().getText().replace("$", "");
		String tpc = alp.getTotalcoast().getText().replace("$", "");
		alp.getProceedCheckoutButton().click();
//entered into shopping cart summary
		String spc = alp.getFinalProductValue().getText().replace("$", "");
		String stpc = alp.getFinalProductTotalCost().getText().replace("$", "");

		if (pc.equals(spc)) {
			System.out.println("successfully product value compared in summary phase");

			if (tpc.equals(stpc)) {

				System.out.println("successfully product total value compared in summary phase");
			}

		} else {

			System.out.println("price is not comatible");
		}

//click on checkout button in summary phase      
		alp.getProceedtocheckoutSummaryPhase().click();
//click on checkout button in Address phase      
		alp.getProceedtocheckoutSummaryPhase().click();
//click on terms&conditions check box
		alp.getTermsCheckbox().click();
//click on checkout button in shipping phase      
		alp.getProceedtocheckoutSummaryPhase().click();
//click on paymentmethod link shipping page      
		alp.getPaymentMethodLink().click();

//verify product total price in shipping phase
		String PPIPP = alp.getProductpriceinPaymentPhase().getText().replace("$", "");
		if (tpc.equals(PPIPP)) {

			System.out.println("succssfully compared product total cost in payment page");
		}
//click on "i confirm order" button		
		alp.getOrderConfirmButton().click();
		System.out.println("i am successfully ordered 'Faded T-shert' ");
//click on signout button
		alp.getSignOutButton().click();
		System.out.println("successfully signout the my Accout");

	}

	@AfterTest
	public void teardown() throws InterruptedException {

		Thread.sleep(5000);
		driver.close();
	}

}
