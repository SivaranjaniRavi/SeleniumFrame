package PracticePrgs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SampleTest 
{
	static{
		System.setProperty("webdriver.chrome.driver", "/home/tyss/Desktop/chromedriver");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement ele = driver.findElement(By.xpath("//span[.='Electronics']"));
		Actions actions=new Actions(driver);
		actions.moveToElement(ele).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Apple']")).click();
		
		
		

	}

}
