package PracticeLocators;

 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DemoLocators { 


	
  public static void  main(String args[]) throws InterruptedException
  {
	  WebDriver driver  = new ChromeDriver();
	 //System.setProperty("webdriver.chrome.driver", "src/test/resources/Driver/chromedriver.exe");
	  
	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 Thread.sleep(2000);
	 driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Admin");
	 driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	 driver.findElement(By.cssSelector("button.oxd-button")).click();
	 Thread.sleep(2000);
	 String str = driver.findElement(By.cssSelector("h6")).getText();
	 Assert.assertEquals(str, "Dashboard");
 	 System.out.println("Successfull");
 	 Thread.sleep(2000);
	 driver.findElement(By.cssSelector("i[class=\"oxd-icon bi-list oxd-topbar-header-hamburger\"]")); 
	 Thread.sleep(2000);
	 //driver.findElement(By.xpath("//a[contains(@class,'active toggle')]"));
	 //driver.findElement(By.className("oxd-main-menu-item toggle")).click();
	 driver.findElement(By.linkText("My Info")).click();
	 Thread.sleep(2000);
	 driver.getPageSource().contains("Test");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//div[@class=\"oxd-input-group\"] //input[@class=\"oxd-input oxd-input--active orangehrm-middlename\"]")).sendKeys("lokesh");
	 driver.close();
	 

	  
	  
  }
}

