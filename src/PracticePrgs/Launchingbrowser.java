package PracticePrgs;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launchingbrowser 
{
	
	static{

	System.setProperty("webdriver.chrome.driver","./driver/chromerdriver");
	
}


public static void main(String[]args) throws InterruptedException
{
	System.out.println("enter browser");
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	sc.close();
	WebDriver driver=null;
	if(str.equals("gc"))
	{
		driver=new ChromeDriver();
	}
	else
		if(str.equals("ff"))
	{
		driver=new FirefoxDriver();
	}
	Thread.sleep(1000);
	driver.close();

}
}
