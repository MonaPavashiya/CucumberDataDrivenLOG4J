package stepDefinitions;

import java.time.Duration;


import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;



public class Steps_DD {

	Logger log = Logger.getLogger(Steps_DD.class);

	WebDriver driver;
	
	@Given("User Launch Chrome browser")
	public void user_Launch_Chrome_browser() {
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath + "\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("user opens URL {string}")
	public void user_opens_URL(String url) {
		driver.get(url);
	}

	@When("^user entering (.*) and (.*)$")
	public void user_entering_Username_and_Password(String username, String password) {
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
	}

	@When("click on login")
	public void click_on_login() {
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
	}
	
	@Then("page title should be {string}")
	public void page_title_should_be(String title) {
		
		if (driver.getPageSource().contains("Epic sadface")) 
		{
			driver.quit();
			Assert.assertTrue(false);
		} else {
			Assert.assertEquals(title, driver.getTitle());
		}
		 
		
	}

	
	@When("user clicks on ReactButton")
	public void user_clicks_on_ReactButton() {
		 driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
	}

	@Then("User clicks on logout link")
	public void user_clicks_on_logout_link() {
		driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();

	}

	@Then("user close browser")
	public void user_close_browser() {
		driver.quit();
	}

	
}
