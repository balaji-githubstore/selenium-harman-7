package com.harman.alert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		
		driver.get("https://nasscom.in/nasscom-membership");
		
		//click on Calculate Membership fee
		driver.findElement(By.linkText("Calculate Membership Fee")).click();
		
		String alertText= driver.switchTo().alert().getText();
		System.out.println(alertText);
		
		driver.switchTo().alert().accept();
	}

}
