package com.MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Mousehover {

	
	//div[text()='Categories']
	WebDriver driver;
	
	@BeforeClass
  public void setUp() {
	  
		System.setProperty("webdriver.gecko.driver", "D:/geckodriver133.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.tatacliq.com/");
		driver.manage().window().maximize();
  }
	
	@Test
	public void categoriesMouseHover() {
		
		
		WebElement element = driver.findElement(By.xpath("//div[text()='Categories']"));
		Actions hCategories= new Actions(driver);
		hCategories.moveToElement(element).perform();
		
	}
}
