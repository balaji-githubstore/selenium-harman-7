package com.harman.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2FBLogin {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/"); // wait for page load to complete
		
	   WebElement ele=driver.findElement(By.id("email"));
	   ele.sendKeys("heelo@gmail.com");

//		driver.findElement(By.id("email")).sendKeys("bala123456789@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("bala@123");
		
		//click on login
		driver.findElement(By.name("login")).click();
	}

}
