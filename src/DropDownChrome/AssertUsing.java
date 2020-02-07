package DropDownChrome;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertUsing {
	
	public static WebDriver driver;

	@Test
	public static void main() {
		
		System.setProperty("webdriver.chrome.driver","D:\\workspace\\ChromedriverDropDown\\Driver\\chromedriver.exe");
	    driver= new ChromeDriver();
		driver.get("https://www.cigniti.com");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		String actual = driver.getTitle();
		String expected = "https://www.cigniti.com";
		
		Assert.assertEquals(actual, expected);
		System.out.println("both ok");

	}

}
