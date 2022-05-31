package PracticeJenkinTest;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice1Test {
	
	@Test
	public void practice1() throws InterruptedException
	{
		 WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		/*WebDriver driver;
		String browser = System.getProperty("BROWSER");
		 
		 switch(browser)
		 {
		 case "chrome":
			 WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			 break;
			 
		 case "firefox":
		   WebDriverManager.firefoxdriver().setup();
		   driver=new FirefoxDriver();
		   break;
		 
		 default:
			 
			 System.out.println("please specify the browser key");
			 WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			 break;
	      }*/
		 //changes 2
		//santhu
		driver.get("http://localhost:8888");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
	    driver.findElement(By.xpath("//input[@id='submitButton']")).click();
	    
	    driver.findElement(By.xpath("//a[.='Contacts']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();
	    
	    Random ran = new Random();
	    int random = ran.nextInt(1000);
	    driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Raj"+random);
	    driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
	 
	 
	
    }

}
