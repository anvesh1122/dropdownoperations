package DropDownChrome;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class infosys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\workspace\\ChromedriverDropDown\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.get("https://www.infosys.com");
		String info = driver.findElement(By.xpath("//body[@class=\"page basepage basicpage \"]")).getText();
		System.out.println(info);
	List<WebElement>frame =  driver.findElements(By.tagName("iframe"));	
	System.out.println(frame.size());
//		List arr = new ArrayList();
//		
//		System.out.println("identify");
//		for(WebElement web:frame) {
//		arr.add(web);
//			System.out.println(arr);
//	} 

}
}