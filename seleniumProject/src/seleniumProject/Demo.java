package seleniumProject;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException 
	{
	
		
		System.out.println("Hello Automation");
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");  
		
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 Thread.sleep(30);
		 
		 
		 driver.navigate().to("http://www.omayo.blogspot.com"); 
		 
	
		 driver.findElement(By.linkText("SeleniumTutorial")).click();
	
		 
		 
		 Set<String> set = driver.getWindowHandles();
		 
		Iterator<String>itr=set.iterator();
		
		String mainwindowid=itr.next();
		String chlidwindowid=itr.next();
		
		driver.switchTo().window(chlidwindowid);
		
	driver.findElement(By.linkText("Sign Up")).click();
	
	Thread.sleep(300);
	
	}

}