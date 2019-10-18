package DropDownChrome;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import org.junit.internal.ArrayComparisonFailure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownwithAlphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\workspace\\ChromedriverDropDown\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		
		WebElement month = driver.findElement(By.id("month"));
		
		Select select =new Select(month);
		System.out.println(select);
		System.out.println("month is selected");
		
		//List as=new ArrayList();
	
		List<WebElement> alpha = select.getOptions();
		System.out.println("alpha "+alpha.size());
		
/*for(WebElement d:alpha) {
			System.out.println(d.getText());
			as.add(d.getText());
		}
        Collections.sort(as);
        System.out.println("aplhabets order"+as);*/
		//for(int i=0;i<alpha.size();i++) {
			// select.selectByIndex(i);
				}
	}


