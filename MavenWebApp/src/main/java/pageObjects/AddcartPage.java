package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddcartPage {

	private WebDriver driver;

	By search = By.xpath("//div[@class='_3OO5Xc']/input");
	By searchbutton = By.xpath("//button[@class='L0Z3Pu']");

	public AddcartPage(WebDriver driver) {

		this.driver = driver;
	}

	public WebElement searchfield() {
		return driver.findElement(search);
	}
	public WebElement searchButton() {
		return driver.findElement(searchbutton);
	}
	
	
}
