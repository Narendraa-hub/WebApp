package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class automationLoginPage {

	public WebDriver driver;

	By signinbutton = By.xpath("//a[@class='login']");
	By email = By.xpath("//input[@id='email']");
	By pass = By.xpath("//input[@id='passwd']");
	By signin = By.xpath("//button[@id='SubmitLogin']");
	By womanlink = By.xpath("//a[@title='Women']");
	By tsherts = By.xpath("(//a[@title='T-shirts'])[1]");
	By fadedItem = By.xpath("//a[@title='Faded Short Sleeve T-shirts']");
	By addcart = By.xpath("//span[contains(text(),'Add to cart')]");
	By productcost = By.xpath("(//div[@class='layer_cart_row']/span)[1]");
	By totalcost = By.xpath("(//div[@class='layer_cart_row']/span)[3]");
	By proceedtoCheckout = By.xpath("//span[contains(text(),'Proceed to checkout')]");
	By finalproductvalue = By.xpath("(//div[@class='layer_cart_row']/span)[3]");
	By finalproducttotalcost = By.xpath("(//div[@class='layer_cart_row']/span)[3]");
	By proceedtoCheckoutinSummaryphase = By.xpath("(//span[contains(text(),'Proceed to checkout')])[2]");
	By termscheckbox = By.xpath("//input[@id='cgv']");
	By paymentmethodlink = By.xpath("//a[@class='bankwire']");
	By productcostinpaymentpage = By.xpath("//span[@id='amount']");
	By confirmorder = By.xpath("//span[contains(text(),'I confirm my order')]");
	By signout = By.xpath("//a[@title='Log me out']");

	
	
	public automationLoginPage(WebDriver driver) {

		this.driver = driver;
	}

	public WebElement getsigninButton() {

		return driver.findElement(signinbutton);
	}

	public WebElement getemailfield() {

		return driver.findElement(email);
	}

	public WebElement getpassfile() {

		return driver.findElement(pass);
	}

	public WebElement getsignin() {

		return driver.findElement(signin);
	}

	public WebElement getwomanlink() {

		return driver.findElement(womanlink);

	}

	public WebElement getTshertLink() {

		return driver.findElement(tsherts);

	}

	public WebElement getFadedTshert() {

		return driver.findElement(fadedItem);

	}

	public WebElement getAddCart() {

		return driver.findElement(addcart);

	}

	public WebElement getProductcost() {

		return driver.findElement(productcost);

	}

	public WebElement getTotalcoast() {

		return driver.findElement(totalcost);

	}

	public WebElement getProceedCheckoutButton() {

		return driver.findElement(proceedtoCheckout);

	}

	public WebElement getFinalProductValue() {

		return driver.findElement(finalproductvalue);

	}

	public WebElement getFinalProductTotalCost() {

		return driver.findElement(finalproducttotalcost);

	}

	public WebElement getProceedtocheckoutSummaryPhase() {

		return driver.findElement(proceedtoCheckoutinSummaryphase);

	}

	public WebElement getTermsCheckbox() {

		return driver.findElement(termscheckbox);

	}

	public WebElement getPaymentMethodLink() {

		return driver.findElement(paymentmethodlink);

	}
	public WebElement getProductpriceinPaymentPhase() {

		return driver.findElement(productcostinpaymentpage);

	}
	public WebElement getOrderConfirmButton() {

		return driver.findElement(confirmorder);

	}
	public WebElement getSignOutButton() {

		return driver.findElement(signout);

	}
	
}
