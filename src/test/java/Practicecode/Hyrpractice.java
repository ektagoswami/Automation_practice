package Practicecode;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Hyrpractice {
	public WebDriver driver;

	@BeforeTest
	public void browsersetup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ekta\\eclipse-workspace\\Automationproject\\src\\test\\resources\\Drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");

	}

	@Test(dataProvider="datasupplier")
	public void mytestcase1(String firstname, String lastname, String emailID, String myPassword) {

		WebElement Textbox1 = driver.findElement(By.xpath("//input[@id=\"firstName\"]"));
		Textbox1.sendKeys(firstname);

		WebElement Textbox2 = driver.findElement(By.xpath("//input[@id=\"lastName\"]"));
		Textbox2.sendKeys(lastname);

		WebElement genderbutton = driver.findElement(By.xpath("//input[@id=\"femalerb\"]"));
		genderbutton.click();

		WebElement checkbox = driver.findElement(By.xpath("//input[@id=\"englishchbx\"]"));
		checkbox.click();

		WebElement EmailTextbox = driver.findElement(By.xpath("//input[@id=\"email\"]"));
		EmailTextbox.sendKeys(emailID);

		WebElement password = driver.findElement(By.xpath("//input[@id=\"password\"]"));
		password.sendKeys(myPassword);
		
		WebElement registerbutton = driver.findElement(By.xpath("//button[@id=\"registerbtn\"]"));
		registerbutton.click();
		
		WebElement clearButton = driver.findElement(By.id("clearbtn"));
		clearButton.click();

		/*String expectedoutputmessage = "Registration is Successful";

		String actualoutputmessage = driver.findElement(By.xpath("//label[@id=\"msg\"]")).getText();

		Assert.assertEquals(actualoutputmessage, expectedoutputmessage);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.open()");

		String Parenthandle = driver.getWindowHandle();
		Set<String> multiplewindow = driver.getWindowHandles();
		for (String str : multiplewindow) {

			if (!(str.equals(Parenthandle))) {

				driver.switchTo().window(str);

			}
		}*/

	}
	
	@DataProvider(name="datasupplier")
	public Object[][] dataprovmethod(){
		
		return new Object[][] {{"Ekta", "goswami", "ektagoswami@gmail.com","ekta@123"},{"ankita", "goswami", "ankitagoswami@gmail.com","ankita@123"}};
		
		
	}
	
	

	@Test(enabled=false)
	public void mytestcase2() {

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

	@AfterTest(enabled=false)
	public void browserteardown() {

		driver.quit();

	}
}
