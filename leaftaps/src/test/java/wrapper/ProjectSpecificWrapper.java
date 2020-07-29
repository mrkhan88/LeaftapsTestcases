package wrapper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectSpecificWrapper {    //superClass
	public ChromeDriver driver;    //Creating universal object of chromedriver
	
	@BeforeMethod
	public void login() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); 
		
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("DemoSalesManager"); //Enter User Name.
		driver.findElement(By.xpath("//input[@name=\"PASSWORD\"]")).sendKeys("crmsfa");  //Enter password.
		driver.findElement(By.xpath("//input[@class=\"decorativeSubmit\"]")).click();  //Click on login button.
		
		driver.findElement(By.linkText("CRM/SFA")).click();   //click on CRM/SFA
		
			
		
	}
	@AfterMethod
	public void closeBrowser() {
		driver.close();
		
	}

}
