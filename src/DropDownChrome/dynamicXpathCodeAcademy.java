package DropDownChrome;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicXpathCodeAcademy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\workspace\\ChromedriverDropDown\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.codecademy.com/");
		
		
		//#1 using contains for dynamic xPath
		driver.findElement(By.xpath("//input[contains (@type,'email')]")).sendKeys("ANV");
		
		
		//#2 using AND,OR attribute for xPath
		driver.findElement(By.xpath("//*[@type='password' or @name='password']")).sendKeys("99999999");
		
		Thread.sleep(3000);
		
		//#3 using text() attribute for xPath
		driver.findElement(By.xpath("//*[text()='Start coding now']")).click();
		
		driver.findElement(By.xpath("//a[text()='Pricing']")).click();

		
		
		
	}

}
