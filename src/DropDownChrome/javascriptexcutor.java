package DropDownChrome;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
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
		
		js.executeScript("document.getElementById('identifierId').setAttribute('value','anvesh475@gmail.com')");
		

	}

}
