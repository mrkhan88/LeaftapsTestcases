package leaftaps;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import wrapper.ProjectSpecificWrapper;

public class DuplicateLead extends ProjectSpecificWrapper {
	
	@Test
	public void duplicateLead() throws InterruptedException {
		//Click on Lead
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
		//Click on FindLeads
		driver.findElement(By.linkText("Find Leads")).click();
		
		//Click on Email
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		//Enter Email
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("hema_77@gmail.com");
		//Click on FindLead button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		//Click on first Result (xpath must be parent to child)
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		//Click duplicate lead
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		//Verify Title
		String firstPageTitle = driver.getTitle();
		System.out.println(firstPageTitle);
		
		if (firstPageTitle.contains("Duplicate Lead")) {
			System.out.println("Page Title matched");
		}
		else
		{
			System.out.println("Title Not Matched");
		}
		//CLick on Duplicate Lead
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		String DuplicateTitle = driver.getTitle();
		System.out.println(DuplicateTitle);
		//verify duplicated lead match with fist pageTitle
		if (DuplicateTitle.equals(firstPageTitle)) {
			System.out.println("Lead Matched");
		}else {
			System.out.println("Lead Not Matched");
		}
		
		
	}

}
