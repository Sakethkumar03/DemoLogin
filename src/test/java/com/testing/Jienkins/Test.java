package com.testing.Jienkins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	//	WebDriverManager.edgedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
	
		driver.findElement(By.xpath("//a[text()='A/B Testing']")).click();
		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[text()='Basic Auth']")).click();
		driver.navigate().back();
		driver.close();
		System.out.println("Login Completed");
}
}

//driver.findElement(By.id("input-username")).sendKeys("admin123");
//driver.findElement(By.id("input-firstname")).sendKeys("admin");
//driver.findElement(By.id("input-lastname")).sendKeys("123");
//driver.findElement(By.id("input-email")).sendKeys("admin@gmail.com");
//driver.findElement(By.id("input-password")).sendKeys("admin@123");
//driver.findElement(By.xpath("//*[@id=\"captcha-image\"]/ul/li[1]/a/img")).click();
//driver.findElement(By.xpath("//*[@id=\"button-register\"]/button[1]")).click();
//
//System.out.println("Register Completed");
//driver.findElement(By.name("//input[@placeholder='Username']")).sendKeys("Admin");
//driver.findElement(By.name("//input[@placeholder='Password']")).sendKeys("admin123");
//
//driver.findElement(By.xpath("//*[@id=\"navbar-collapse-header\"]/div/a[1]")).click();
