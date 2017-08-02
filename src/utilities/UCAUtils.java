package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UCAUtils {
	WebDriver driver;
	
	public void userLogin() {
		WebElement login = driver.findElement(By.id("loginLink"));
		login.click();
		WebElement emailField = driver.findElement(By.id("Email"));
		WebElement pwdField = driver.findElement(By.id("Password"));
		
		emailField.sendKeys(UCAConstants.OPERATOR_USER_ID);
		pwdField.sendKeys(UCAConstants.OPERATOR_USER_PWD);
		
		driver.findElement(By.className("btn btn-default"));
		
		
	}
}
