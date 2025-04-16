package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class secnearioOutline {
	EdgeDriver driver=new EdgeDriver();
//	
//	@Given("User open a Sign Up Page")
//	public void user_open_a_sign_up_page() {
//		
//		 System.setProperty("edgedriver.chrome.driver", "./Drivers/msedgedriver.exe");
//		 driver.get("https://demowebshop.tricentis.com/");
//		 driver.findElement(By.linkText("Register")).click();
//		 driver.findElement(By.id("gender-male")).click();		
//	    
//	}
//	@When("User enter a <{string}> and <{string}> as well as <{string}>")
//	public void user_enter_a_and_as_well_as(String FirstName, String LastName, String Email) {
//		driver.findElement(By.id("FirstName")).sendKeys(FirstName);	
//		driver.findElement(By.id("LastName")).sendKeys(LastName);	
//		driver.findElement(By.id("Email")).sendKeys(Email);
//		
//	    
//	}
//	@Then("User enter a <{string}> and <{string}>")
//	public void user_enter_a_and(String Password, String ConfirmPassword) {
//		driver.findElement(By.id("Password")).sendKeys(Password);	
//		driver.findElement(By.id("ConfirmPassword")).sendKeys(ConfirmPassword);	
//	   
//	}
//	@Then("User Click the Register Button")
//	public void user_click_the_register_button() {
//		
//		driver.findElement(By.id("register-button")).click();
//	}
////	@Then("The Page takes a User to Home page")
////	public void the_page_takes_a_user_to_home_page() {
////	    
////	}
//
//
	

@Given("User open a Sign Up Page")
public void user_open_a_sign_up_page() {

	 System.setProperty("edgedriver.chrome.driver", "./Drivers/msedgedriver.exe");
	 driver.get("https://demowebshop.tricentis.com/");
	 driver.findElement(By.linkText("Register")).click();
	 driver.findElement(By.id("gender-male")).click();		
    
    
}
@When("User enter a <{string}> and <{string}> as well as <{string}>")
public void user_enter_a_and_as_well_as(String string, String string2, String string3) {
	driver.findElement(By.id("FirstName")).sendKeys(string);	
	driver.findElement(By.id("LastName")).sendKeys(string2);	
	driver.findElement(By.id("Email")).sendKeys(string3);
    
    
}
@When("User enter a <{string}> and <{string}>")
public void user_enter_a_and(String string, String string2) {
    
	driver.findElement(By.id("Password")).sendKeys(string);	
	driver.findElement(By.id("ConfirmPassword")).sendKeys(string2);
    
}
@When("User Click the Register Button")
public void user_click_the_register_button() {
	
	driver.findElement(By.id("register-button")).click();
    
}
//@Then("The Page takes a User to Home page")
//public void the_page_takes_a_user_to_home_page() {
//    
//    
//}


}
