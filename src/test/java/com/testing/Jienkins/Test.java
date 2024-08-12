package com.testing.Jienkins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
//		driver.findElement(By.id("input-username")).sendKeys("admin123");
//		driver.findElement(By.id("input-firstname")).sendKeys("admin");
//		driver.findElement(By.id("input-lastname")).sendKeys("123");
//		driver.findElement(By.id("input-email")).sendKeys("admin@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("admin@123");
//		driver.findElement(By.xpath("//*[@id=\"captcha-image\"]/ul/li[1]/a/img")).click();
//		driver.findElement(By.xpath("//*[@id=\"button-register\"]/button[1]")).click();
//		
//		System.out.println("Register Completed");
//		
//		
//		driver.findElement(By.xpath("//*[@id=\"navbar-collapse-header\"]/div/a[1]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
		System.out.println("Login Completed");
}
}
