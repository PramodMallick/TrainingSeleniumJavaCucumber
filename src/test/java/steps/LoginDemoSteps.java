package steps;

import static org.junit.Assert.assertArrayEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.Base;

public class LoginDemoSteps extends Base {
	
//	WebDriver driver = null;

//	@Given("browser is open")
//	public void browser_is_open() {
//		 System.out.println("browser is open");
//		    
////		    String filePath = System.getProperty("user.dir");
////		    //System.out.println(filePath);
////		    System.setProperty("webdriver.chrome.driver", filePath + "/src/test/resources/Drivers/chromedriver.exe");
////		    
////		    driver = new ChromeDriver();
////		    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
////		    driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
////		    //driver.manage().window().maximize();
//	   
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	   
////		driver.navigate().to("https://example.testproject.io/web/"); // run it from ConfigsClass instead
//	}
//
//	@When("^user enters (.*) and (.*)$")
//	public void user_enters_username_and_password(String username, String password) throws InterruptedException {
//	   
//		driver.findElement(By.id("name")).sendKeys(username);
//		driver.findElement(By.id("password")).sendKeys(password);
//		Thread.sleep(2000);
//		
//	}
//	
//	@And("user clicks on login")
//	public void user_clicks_on_login() {
//	    driver.findElement(By.id("login")).click();
//	}
//
//	@Then("user is navigated to the home page")
//	public void user_is_navigated_to_the_home_page() throws InterruptedException {
//		
//		boolean logoutButton = driver.findElement(By.id("logout")).isDisplayed();
//		System.out.println("Logout button is displayed: " + logoutButton);
//		
//		Thread.sleep(2000);
//		
////		driver.close();
////		driver.quit();
//	  
//	}
}
