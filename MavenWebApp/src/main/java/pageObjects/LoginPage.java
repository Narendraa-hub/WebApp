package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public WebDriver driver;

	By LoginsignupText = By.xpath("//a[contains(text(),'Login / Signup')]");
	By email = By.cssSelector("input[id='emmail_login']");
	By pass = By.cssSelector("input[id='password_login']");
	By signinbtn = By.xpath("//button[contains(text(),' Sign in')]");

	public LoginPage(WebDriver driver) {

		this.driver = driver;

	}
	
	
	  public WebElement getLoginsignupText() {
	  
	  return driver.findElement(LoginsignupText); }
	 

	public WebElement getemail() {

		return driver.findElement(email);

	}

	public WebElement getpassword() {

		return driver.findElement(pass);

	}

	public WebElement signin() {

		return driver.findElement(signinbtn);

	}

}
