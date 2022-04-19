package com.harman.advance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1GetTest {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		
		driver.get("https://demo.openemr.io/b/openemr");
		
		String tagname=driver.findElement(By.partialLinkText("Licensing")).getTagName();
		System.out.println(tagname);
		
		String text=driver.findElement(By.partialLinkText("Licensing")).getText();
		System.out.println(text);
		
		String header= driver.findElement(By.xpath("//p[contains(text(),'most')]")).getText();
		System.out.println(header);
		
		String href=driver.findElement(By.partialLinkText("Licensing")).getAttribute("href");
		System.out.println(href);
	}

}
