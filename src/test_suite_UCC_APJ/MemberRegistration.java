package test_suite_UCC_APJ;

import org.testng.annotations.Test;
import utilities.UCAConstants;
import utilities.UCAUtils;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class MemberRegistration {
	WebDriver driver;
	UCAUtils uccUtils = new UCAUtils();
	
  @Test  
  public void f() throws Exception {
	  
	//  uccUtils.userLogin();	  
	  //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		Select saDropdown = new Select(driver.findElement(By.id("salutation")));		
		Select atDropdown = new Select(driver.findElement(By.id("academicTitle")));
		Select psDropdown = new Select(driver.findElement(By.id("position")));		
		Select dpDropdown = new Select(driver.findElement(By.id("department")));
		Select mbDropdown = new Select(driver.findElement(By.id("membershipType")));	
		Select insType = new Select(driver.findElement(By.id("institutionType")));
		Select cnDropdown = new Select(driver.findElement(By.id("country")));

		WebElement fName = driver.findElement(By.id("firstName"));
		WebElement lName = driver.findElement(By.id("lastName"));
		WebElement phone = driver.findElement(By.id("phone"));
		WebElement email = driver.findElement(By.id("email"));		
		WebElement pwd = driver.findElement(By.id("password"));
		WebElement pwdc = driver.findElement(By.id("passwordConfirm"));
		WebElement insName = driver.findElement(By.id("institutionName"));
		WebElement stAddress = driver.findElement(By.id("streetAddress"));		
		WebElement city = driver.findElement(By.id("city"));
		WebElement pCode = driver.findElement(By.id("postalZip"));
		WebElement state = driver.findElement(By.id("stateProvince"));		
		WebElement temsCond = driver.findElement(By.id("agreement"));
		WebElement submiBtn = driver.findElement(By.id("submit"));
		
		fName.sendKeys("Erick");
		lName.sendKeys("Mejia");
		phone.sendKeys("0400650852");
		email.sendKeys("tester1@uccapj.com");
		pwd.sendKeys("tester123");
		pwdc.sendKeys("tester123");
		insName.sendKeys("QUT");
		stAddress.sendKeys("25 Charlotte Ave");
		city.sendKeys("Brisbane");
		pCode.sendKeys("4000");
		state.sendKeys("Queensland");
		
		temsCond.click();		
		
		saDropdown.selectByIndex(2);
		atDropdown.selectByIndex(2);
		psDropdown.selectByIndex(2);
		dpDropdown.selectByIndex(2);
		mbDropdown.selectByIndex(2);
		insType.selectByIndex(2);
		cnDropdown.selectByIndex(2);
		submiBtn.click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Return Home"));
	
      System.out.println("Successfully opened the UCC APJ website");
      System.out.println("UCC APJ member login page successfully displayed");
  }
  @BeforeMethod
  public void beforeMethod() throws Exception {
	// Create a new instance of the Firefox driver
	   driver = new FirefoxDriver();
 
      //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
      //Launch the Online Store Website
      driver.get(UCAConstants.UCCAPJ_WEBSITE);
      
      WebElement register = driver.findElement(By.id("registerLink"));
	   register.click();
	   Thread.sleep(3000);
  }

  @AfterMethod
  public void afterMethod() {
	  
	  
  }

}
