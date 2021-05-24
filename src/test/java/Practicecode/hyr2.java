package Practicecode;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class hyr2 {

	@Test
	public void mymethod2() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ekta\\eclipse-workspace\\Automationproject\\src\\test\\resources\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");

		Select Dropdown1 = new Select(driver.findElement(By.xpath("//select[@id=\"course\"]")));

		List<WebElement> optionslist = Dropdown1.getOptions();

		int counter = 0;
		String newoption = "cloudcomputing";
		for (WebElement str : optionslist) {

			if (str.getText().equals(newoption)) {

				counter++;

			}
		}
		Assert.assertTrue(counter > 0);

	}

}
