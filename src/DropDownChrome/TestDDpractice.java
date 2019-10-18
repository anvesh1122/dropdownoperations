package DropDownChrome;

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestDDpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\workspace\\ChromedriverDropDown\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://testautomationpractice.blogspot.com/");
	 
	 
	 WebElement product = driver.findElement(By.id("products"));
	 System.out.println("product is passed");
	 
	
	 
	 //products related
	 Select select = new Select(product);
	 List <WebElement> list = select.getOptions();
	 System.out.println(list.size());
	 System.out.println("counted Size");
	 
	 ArrayList array=new ArrayList();
	 
	 for(WebElement we:list) {
		 System.out.println(we.getText());
		 array.add(we.getText());
	 }
	 Collections.sort(array);
	 System.out.println("sequence order"+array);
	 
	 
	 
	 
	 //files related
	 WebElement file = driver.findElement(By.id("files"));
	 System.out.println("files passed");
	 Select select1=new Select(file);
	List <WebElement> list1 = select1.getOptions();
	System.out.println(list1.size());
	System.out.println("files catched");
	
	ArrayList arr =new ArrayList();
	
	for(WebElement w:list1) {
		System.out.println(w.getText());
		arr.add(w.getText());	
	}
	Collections.sort(arr);
	System.out.println("sequence order"+arr);
	 
	 
	 
	 
	}

}
