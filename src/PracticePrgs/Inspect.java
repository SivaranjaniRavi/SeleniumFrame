package PracticePrgs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Inspect {
	
	
	static{

		System.setProperty("webdriver.chrome.driver","./driver/chromerdriver");
		
	}
	
	
	public static void main(String[]args) 
	{
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.bluestone.com/");
	
	WebElement ele = driver.findElement(By.className("icon-img hs wishlist-icon"));
	ele.click();
	
	
	

}
}
