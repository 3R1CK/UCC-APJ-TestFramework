package test_suite_UCC_APJ;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import utilities.UCAConstants;


public class SampleTestCase {
	
		
	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
				
		WebDriver driver = new FirefoxDriver();
		       
		driver.get(UCAConstants.UCCAPJ_WEBSITE);	
		//utilsUCA.userLogin();
		
		WebElement login = driver.findElement(By.id("loginLink"));
		login.click();
		Thread.sleep(3000);
		
		WebElement emailField = driver.findElement(By.id("Email"));
		WebElement pwdField = driver.findElement(By.id("Password"));
		
		emailField.sendKeys(UCAConstants.OPERATOR_USER_ID);
		pwdField.sendKeys(UCAConstants.OPERATOR_USER_PWD);
		
		driver.findElement(By.className("btn"));
		
        System.out.println("Successfully opened the UCC APJ website");
        System.out.println("UCC APJ member login page successfully displayed");
 
		//Wait for 5 Sec
		Thread.sleep(5000);
		
        // Close the driver
        driver.close();
		
	}

}
