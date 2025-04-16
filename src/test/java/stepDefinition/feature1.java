//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.testng.Assert;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class feature1 {
//	EdgeDriver driver=new EdgeDriver();
//	
//
//@Given("User on the Login Page")
//public void user_on_the_login_page() {
//	
//	System.setProperty("edgedriver.chrome.driver", "./Drivers/msedgedriver.exe");
//	  
//	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//
//	  driver.manage().window().maximize();
//	  
//	  driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
//    
//}
//@When("User Entering the Values {string} and {string}")
//public void user_entering_the_values_and(String string, String string2) {
//	
//	 driver.findElement(By.name("username")).sendKeys(string);
//	  driver.findElement(By.name("password")).sendKeys(string2);
//   
//}
//@When("User Clicking the Login button")
//public void user_clicking_the_login_button() {
//	 driver.findElement(By.xpath("//*[@type='submit']")).click();
//	  String Actual = driver.getTitle();
//	  Assert.assertEquals("OrangeHRM", Actual);
//   
//}
//@Then("The Website Taking a User to Next page")
//public void the_website_taking_a_user_to_next_page() throws InterruptedException {
//	
//	 String Actual = driver.getTitle();
//	  Assert.assertEquals("OrangeHRM", Actual);
//	  Thread.sleep(5000);
//	  driver.close();            
//}
//	
//}
