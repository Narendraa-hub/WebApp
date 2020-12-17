package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlipLoginPage {

	public WebDriver driver;
	By popup = By.xpath("//div[@class='_2QfC02']/button");
	
	By Loginbutton = By.xpath("//div[@class='_1psGvi _3BvnxG']/div/a");
	By email = By.xpath("//input[@class='_2IX_2- VJZDxU']");
	By pass = By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']");
	By signin = By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']");
	By passwordincorrectmessage = By.xpath("//span[contains(text(),'Your username or password is incorrect')]");

	
	
	By search = By.xpath("//div[@class='_3OO5Xc']/input");
	By searchbutton = By.xpath("//button[@class='L0Z3Pu']");
	By Minbutton = By.xpath("//div[@class='_1YAKP4']/select");
	
	By Maxbutton = By.xpath("//div[@class='_3uDYxP']/select");
	By profile = By.xpath("//div[contains(text(),'Narendra')]");
	By logout = By.xpath("//ul[@class='pO9syL undefined']/li[10]");
	By headerbar = By.xpath("//div[@class=\"_1kidPb\"]/span");

public FlipLoginPage(WebDriver driver) {
	
	this.driver = driver;
}

public WebElement getPopup() {
	
	return driver.findElement(popup);
}

public WebElement getLoginButton() {
	
	return driver.findElement(Loginbutton);
}

public WebElement getEmail() {
	
	return driver.findElement(email);
}

public WebElement getpass() {
	
	return driver.findElement(pass);
}

public WebElement getsignin() {
	
	return driver.findElement(signin);
}

public WebElement getsearch() {
	
	return driver.findElement(search);
}

public WebElement getsearchbutton() {
	
	return driver.findElement(searchbutton);
}

public WebElement getMinimumfield() {
	
	return driver.findElement(Minbutton);
}

public WebElement getMaximum() {
	
	return driver.findElement(Maxbutton);
}

public WebElement getProfileLogoutOption() {
	
	return driver.findElement(profile);
}

public WebElement getLogout() {
	
	return driver.findElement(logout);
}


public  WebElement getLoginErrorMessage() {
	
	return  driver.findElement(passwordincorrectmessage);
	
}



















}