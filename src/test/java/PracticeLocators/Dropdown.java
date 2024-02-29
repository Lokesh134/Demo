package PracticeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.airasia.com/en/gb");
		Thread.sleep(2000);
		 driver.manage().deleteAllCookies();
		 //driver.switchTo().alert().dismiss();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[@class=\"FlightSearchWidget__TripTypeWrapper-sc-9n630u-5 gqrQvW\"]")).click();
		  driver.close();
		 
	}

}
