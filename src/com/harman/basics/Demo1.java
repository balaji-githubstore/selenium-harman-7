package com.harman.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/"); //wait for page load to complete
		
		String title= driver.getTitle();
		System.out.println(title);
		
		//get the url and print it
		String url= driver.getCurrentUrl();
		System.out.println(url);
		
		String html=driver.getPageSource();
		System.out.println(html);
		
		driver.quit();
		//will start at 7:45 PM IST
	}

}
