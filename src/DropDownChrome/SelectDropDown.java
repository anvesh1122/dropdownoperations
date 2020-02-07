package DropDownChrome;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\workspace\\ChromedriverDropDown\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement day=driver.findElement(By.id("day"));
		Select select=new Select(day);
		WebElement month=driver.findElement(By.id("month"));
		Select select1=new Select(month);
		WebElement year=driver.findElement(By.id("year"));
		Select select2=new Select(year);
		
		/*if(select.isMultiple())
		{
			System.out.println("multi select drop down");
		}
		else
		{
			System.out.println("is not Multi select drop down");
		}*/
		select.selectByIndex(28);
		select.selectByIndex(9);
		select.selectByValue("4");
		//select.selectByVisibleText("28"); 
		//select.selectByVisibleText("30");
		//select.deselectByVisibleText("10");
           select1.selectByIndex(5);
		   select1.selectByValue("10");
	       select1.selectByVisibleText("Sept");
	       
	       select2.selectByIndex(1);
	       select2.selectByValue("2010");
	       select2.selectByVisibleText("1992");
	       
	       
	      
		
		List<WebElement> dropDown = select.getOptions();
		System.out.println("No of webelements in drop down:" +dropDown);
		
		List<WebElement> dropDown1 =select1.getOptions();
		System.out.println("No of webelements in dropdown:" +dropDown1);
		
		List<WebElement> dropDown2=select2.getOptions();
		System.out.println("no of wele in drop down:"+dropDown2);
		
		
	}
	

}   