package com.MouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PageTransition {

	
	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "D:/geckodriver133.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.tatacliq.com/");
		
		}
	
	@Test
	public void flow() throws InterruptedException {

driver.findElement(By.xpath("(//div[text()='Gift Card'])[2]")).click();
		
	}
	
	}
