package DropDownChrome;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class currenttablinkUrl {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\workspace\\ChromedriverDropDown\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Outlook.com']")).click();
		
		Set<String> handles = driver.getWindowHandles();
		List<String> list = new ArrayList(handles);
		
		for(String allhandle:list) {
			driver.switchTo().window(allhandle);
			String str = driver.getTitle();
			
			if(str.equalsIgnoreCase("outlook")) {
				Thread.sleep(4000);
				WebElement web =driver.findElement(By.xpath(("/html/body/main/aside[1]/div/div/div[2]/ul/li[2]/a")));
				web.click();
				System.out.println("sign in");
			}
			
			
		}

	}

}
