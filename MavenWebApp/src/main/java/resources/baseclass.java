package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseclass {


	public WebDriver driver;
	public Properties pro;	

	public WebDriver initializeDriver() throws IOException {
		
		  pro = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\workspace\\MavenWebApp\\src\\main\\java\\udata.properties");
		pro.load(fis);
		String browserName = pro.getProperty("browser");
		String appURL = pro.getProperty("Flipurl");
		System.out.println(appURL);
		System.out.println(browserName);
		
		if (browserName.equals("chrome")) {
			
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver.exe");
				driver= new ChromeDriver();
				driver.get(appURL);
				
		}
		else if(browserName.equals("firefox")) {
			
			
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
		
	}
}
