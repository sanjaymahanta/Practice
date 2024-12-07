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
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		try {
			// Wait for the second "Gift Card" element to be visible
			WebElement giftCardElement = wait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[text()='Gift Card'])[2]")));
			giftCardElement.click();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			driver.quit();
		}
	}
}
