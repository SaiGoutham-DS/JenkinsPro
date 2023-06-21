package org.StepDefinition;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo_Jenkins {

	WebDriver driver;

	@Given("To launch the URL in ChromeBrowser")
	public void to_launch_the_URL_in_ChromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	}

	@When("To Enter the Ipad in flipkart Homepage SearchBox")
	public void to_Enter_the_Ipad_in_flipkart_Homepage_SearchBox() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement clik2 = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		clik2.click();
		WebElement txt = driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
		txt.sendKeys("ipad");
		WebElement clk = driver.findElement(By.xpath("//button[@type='submit']"));

		js.executeScript("arguments[0].click()", clk);

	}

	@When("To Click anyone of them from the Suggestions")
	public void to_Click_anyone_of_them_from_the_Suggestions() throws InterruptedException {

		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement clk1 = driver.findElement(
				By.xpath("//div[text()='APPLE iPad (9th Gen) 64 GB ROM 10.2 inch with Wi-Fi Only (Space Grey)']"));
		js.executeScript("arguments[0].click()", clk1);

	}

	@Then("To close the Browser")
	public void to_close_the_Browser() {
		driver.close();
	}

}
