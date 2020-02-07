package DropDownChrome;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptexcutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\workspace\\ChromedriverDropDown\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https:\\www.gmail.com");
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//js.executeScript(arg0, arg1);
		
		WebElement nxt = driver.findElement(By.xpath("//span[@class='RveJvd snByac']"));
		
		js.executeScript("document.getElementById('identifierId').setAttribute('value','chanvesh.qe@gmail.com')");
		System.out.println("Identified");
		js.executeScript("arguments[0].click();",nxt);
		System.out.println("Identified nxt");
		//js.executeScript("document.getElementById('password').setAttribute('value','anvesh99120')");
		//System.out.println("Identified pwd");
		js.executeScript("window.open('https://www.flipkart.com'),'_blank'");
		System.out.println("open new tab");
	   //js.excuteScript("document.getElementByxpath('//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/a'),'_blank'");
		js.executeScript("document.getElementByxpath('/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input').setAttribute('value','anvesh475@gmail.com'))");
		System.out.println("enter data");
	}

}
