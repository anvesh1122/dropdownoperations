package DropDownChrome;



import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adp {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\workspace\\ChromedriverDropDown\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.adp.com/about-adp.aspx");
		String s1="ADP";
		String s2="adp,";
		String data=driver.findElement(By.xpath("//body[@class='en ']")).getText();
		System.out.println(data);
		String[] s =data.split(" ");
		Map<String, Integer> hm=new HashMap<String, Integer>();
		
		
		for(String word:s)
		{
			if(hm.get(word)!=null)
			{
				hm.put(word, hm.get(word)+1);
				}
			else {
				hm.put(word, 1);
				
			}
		}
		Iterator<String> temp=hm.keySet().iterator();String info = driver.findElement(By.xpath("//body[@class=\"page basepage basicpage \"]")).getText();
		System.out.println(info);
		while(temp.hasNext())
		{
			String temp1=temp.next();
			
			if(hm.get(temp1)>1) {
				System.out.println(temp1+ "=" +hm.get(temp1));
			}
			
		}
		 
		
		
	}

}
















