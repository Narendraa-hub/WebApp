package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingHomepage {

	public WebDriver driver;

	By LoginsignupText = By.xpath("//a[contains(text(),'Login / Signup')]");
	By ofertext = By.xpath("//span[contains(text(),' OFFERS')]");
	By Emailtext = By.cssSelector("input[id='emmail_login']");
	By password = By.xpath("");
	By loginbutton = By.xpath("");

	public LandingHomepage(WebDriver driver) {

		this.driver = driver;

	}

	public WebElement getLoginsignupText() {

		return driver.findElement(LoginsignupText);
	}

	public WebElement OfferText() {

		return driver.findElement(ofertext);

	}

}