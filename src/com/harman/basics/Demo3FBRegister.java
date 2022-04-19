package com.harman.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo3FBRegister {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		
		driver.get("https://www.facebook.com/"); //no time limit
		
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Balaji");
		driver.findElement(By.name("lastname")).sendKeys("Dinakaran");
		
		driver.findElement(By.name("reg_email__")).sendKeys("prasanth@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("prasanth@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("prasanth@123");
		
		//29 Dec 2000
		
		Select selectDay=new Select(driver.findElement(By.id("day")));
		selectDay.selectByVisibleText("29");
		
		Select selectMon=new Select(driver.findElement(By.name("birthday_month")));
//		selectMon.selectByVisibleText("Dec");
		selectMon.selectByValue("12");
		
		Select selectYear=new Select(driver.findElement(By.id("year")));
		selectYear.selectByVisibleText("2000");
		
		driver.findElement(By.xpath("//input[@value='-1']")).click();
		
		//select --> They: "Wish them a happy birthday!"
		Select selectPro=new Select(driver.findElement(By.name("preferred_pronoun")));
		selectPro.selectByIndex(3);
		
		driver.findElement(By.name("websubmit")).click();
		
	}
}
