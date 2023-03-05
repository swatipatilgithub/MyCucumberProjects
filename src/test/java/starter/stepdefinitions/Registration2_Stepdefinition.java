package starter.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Registration2_Stepdefinition {
    WebDriver driver;
	
	
	@Given("Launch browser`")
	public void launch_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sspat\\eclipse-workspace\\chromedriver.exe");
        driver = new ChromeDriver();
	}

	@Given("User navigate to demo site URL")
	public void user_navigate_to_demo_site_URL() {
		 driver.get("https://www.demo.guru99.com/test/newtours");
		 driver.manage().window().maximize();
		
	}

	@Given("user Click on register")
	public void user_Click_on_register() { 
        WebElement Register = driver.findElement(By.xpath("//a[@href=\"register.php\"]"));
        Register.click();
	}
	
	@Given("user enter first name")
	public void user_enter_first_name() {
		 driver.findElement(By.name("firstName")).sendKeys("Swati");
	}
	
	@Given("user enter last name")
	public void user_enter_last_name() {
		 driver.findElement(By.name("lastName")).sendKeys("Patil");
	}
	
	@Given("user enter phone")
	public void user_enter_phone() {
		 driver.findElement(By.xpath("//input[@name=\"phone\"]")).sendKeys("7896541237");
	}
	
	@Given("user enter email")
	public void user_enter_email() {
		 driver.findElement(By.id("userName")).sendKeys("sspatil820@gmail.com");
	}
	
	@Given("user click on submit")
	public void user_click_on_submit() {
		driver.findElement(By.name("submit")).click();
      }
	
	@Then("verify user registered page")
	public void verify_user_registered_page() {
	    driver.findElement(By.xpath("//img[@src=\"images/mast_register.gif\"]"));	    
	}      
}
