package leaftaps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import wrapper.ProjectSpecificWrapper;

public class FindLead extends ProjectSpecificWrapper {
	
	@Test
	public void findLead() throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
		
		/*driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		//Click on CRM/SFA
		driver.findElement(By.xpath("//div[@id='label']/a")).click();*/
		
		
		//Click on Leads
		//driver.findElement(By.xpath("//a[@id='ext-gen608']")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
		
		
		//Click on FindLeads
		driver.findElement(By.linkText("Find Leads")).click();
		//Enter name as Hema
		driver.findElement(By.xpath("//input[@id='ext-gen248']")).sendKeys("Hema");
		//Click on FindLeads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		//Click on First resulting element
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		Thread.sleep(3000); //Verify Page Title
	    String pagetitle = driver.getTitle();
	    System.out.println("Page Title: "+pagetitle);
	    
	    //Verify title
	    if (pagetitle.contains("View")) {
	    	System.out.println("Title is matched");
	    }
	    else
	    {
	    	System.out.println("Title not matched");
	    }
	    
	    driver.findElement(By.xpath("//a[text()='Edit']")).click(); //Click on Edit
	    
	    driver.findElement(By.id("updateLeadForm_companyName")).clear();
	    driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("CTS"); //Change Company name
	    
	    driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();// click on Update.
	    
	    String Changedname = driver.findElement(By.id("viewLead_companyName_sp")).getText();
	    System.out.println("Changed Name is: "+Changedname);
	    
	    //if (Changedname.contains("CTS")) {
	    if (Changedname.contains("CTS")) {
	    	System.out.println("Company name was changed successfully");
	    }else {
	    	System.out.println("Name change failed");
	    }
	    
	  //String updateCompany = driver.findElement(By.xpath("//span[text()='CTS (10127)']")).getText();
		   // System.out.println("Changed Company name: "+updateCompany);
	    
	   
	    
	    
	    }
	    
	
}


