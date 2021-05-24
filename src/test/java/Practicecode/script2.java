package Practicecode;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;

public class script2 {

	/*
	 * @Test(retryAnalyzer=IRetryAnalyzer_01.class) public void myMethod02() {
	 * 
	 * Assert.assertTrue(0>1); }
	 */

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");

		Actions action = new Actions(driver);

		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Women')]"))).perform();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//a[contains(text(),'Kurtas & Suits')]")).click();

		
	}

}
