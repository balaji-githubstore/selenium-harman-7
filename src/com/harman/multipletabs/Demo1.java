package com.harman.multipletabs;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		
		driver.get("https://www.db4free.net/");
		
		//click on phpMyAdmin 
		driver.findElement(By.xpath("//b[contains(text(),'phpMy')]")).click();
		
		List<String> windows=new ArrayList<String>(driver.getWindowHandles());
		
		System.out.println(windows.get(0)); 
		System.out.println(windows.get(1));
		
		//switch to 2nd tab
		driver.switchTo().window(windows.get(1));
		
		driver.findElement(By.id("input_username")).sendKeys("admin");
		driver.findElement(By.id("input_password")).sendKeys("admin123");
		driver.findElement(By.id("input_go")).click();
		
		driver.close(); //check with tab is closed
	}

}
