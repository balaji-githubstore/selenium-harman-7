package com.harman.multipletabs;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		
		driver.get("https://www.medibuddy.in/");
		
		//click on Not Now 
		driver.findElement(By.id("wzrk-cancel")).click();
		
		//click on for employer 
		driver.findElement(By.linkText("For Employer")).click();
		
		//switch to 2nd tab 
		List<String> sessions=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(sessions.get(1));
		
		//enter phone number as 12345
		driver.findElement(By.id("getInTouchMobile")).sendKeys("12345");
		
		//click on GetInTouch
		driver.findElement(By.xpath("//button[text()='Get in Touch']")).click();
	}

}
