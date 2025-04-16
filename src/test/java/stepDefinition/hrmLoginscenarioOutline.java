package stepDefinition;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class hrmLoginscenarioOutline {
	EdgeDriver  driver = new EdgeDriver();
//	
//
//@Given("User on the Login Page")
//public void userOnTheLoginPage() {
//	System.setProperty("edgedriver.chrome.driver", "./Drivers/msedgedriver.exe");
//	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//	driver.manage().window().maximize();
//	
//    
//   
//}
//@When("User entering a values kiruba and kiruba123")
//public void userEnteringAValuesKirubaAndKiruba123() {
//    
//   
//}
//@When("User Clicking a Login button")
//public void userClickingALoginButton() {
//    
//   
//}
//@Then("Website take a User to Home Page")
//public void websiteTakeAUserToHomePage() {
//    
//   
//}



@Given("User on the Login Page")
public void user_on_the_login_page() {
	System.setProperty("edgedriver.chrome.driver", "./Drivers/msedgedriver.exe");
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
   
   
}

@When("User entering a values {string} and {string}")
public void user_entering_a_values_and(String string, String string2) {
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.name("username")).sendKeys(string);
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.name("password")).sendKeys(string2);
   
}

@When("User Clicking a Login button")
public void user_clicking_a_login_button() {
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.xpath("//button[@type='submit']")).click();
    
   
}
}

