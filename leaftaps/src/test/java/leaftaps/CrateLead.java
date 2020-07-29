package leaftaps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import wrapper.ProjectSpecificWrapper;

public class CrateLead extends ProjectSpecificWrapper {
	

		//public static void main(String[] args) {
	@Test
	public void createlead() {
		
			
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mamun\\eclipse-workspace-November2018\\TestCaseOnLeafApp\\lib\\chromedriver\\chromedriver.exe");
//			
//			WebDriver driver = new ChromeDriver();
			
//			driver.get("http://leaftaps.com/opentaps");
//			driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
//			
//			driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("DemoSalesManager"); //Enter User Name.
//			driver.findElement(By.xpath("//input[@name=\"PASSWORD\"]")).sendKeys("crmsfa");  //Enter password.
//			driver.findElement(By.xpath("//input[@class=\"decorativeSubmit\"]")).click();  //Click on login button.
//			
//			driver.findElement(By.linkText("CRM/SFA")).click();   //click on CRM/SFA
			driver.findElement(By.xpath("//a[text()='Create Lead']")).click();   //Click on Create Lead.
			
			driver.findElement(By.xpath("//input[@id=\"createLeadForm_companyName\"]")).sendKeys("Abc"); //Enter company name.
			driver.findElement(By.xpath("//input[@id=\"createLeadForm_firstName\"]")).sendKeys("Rj");  //Enter First Name.
			driver.findElement(By.xpath("//input[@id=\"createLeadForm_lastName\"]")).sendKeys("kumar"); //Enter Last name.
			driver.findElement(By.xpath("//input[@id=\"createLeadForm_birthDate\"]")).sendKeys("06/18/1990"); //Enter DOB
			
			driver.findElement(By.xpath("//input[@name=\"departmentName\"]")).sendKeys("MKT"); //Enter Department name
			
			WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId")); //click on Website under Dropdown Source.
			Select dropdown = new Select(source);
			dropdown.selectByVisibleText("Website");
			
			WebElement marketing = driver.findElement(By.id("createLeadForm_marketingCampaignId")); //Select eCommerce from MarketingCamapign
			Select dropdown3 = new Select(marketing);
			dropdown3.selectByVisibleText("eCommerce Site Internal Campaign");
			
			WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId")); //click on Wete under Dropdown industry
			Select dropdown1 = new Select(industry);
			dropdown1.selectByValue("IND_SOFTWARE");
			
			driver.findElement(By.xpath("//input[@name=\"numberEmployees\"]")).sendKeys("100"); //Type Number of Employee
			
			WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId")); // Coose ownership from dropdowN
			Select dropdown2 = new Select(ownership);
			dropdown2.selectByIndex(2);
			
			driver.findElement(By.xpath("//textarea[@id=\"createLeadForm_description\"]")).sendKeys("TCS"); //Enter Description
			driver.findElement(By.xpath("(//input[@name=\"primaryPhoneAreaCode\"])[4]")).sendKeys("245"); //Type area code
			driver.findElement(By.xpath("(//input[@name=\"primaryPhoneNumber\"])[4]")).sendKeys("1234567"); //Type Primary phone number
			
			driver.findElement(By.xpath("//input[@id=\"createLeadForm_primaryEmail\"]")).sendKeys("rjkm@ymail.com"); //Enter Email address
			driver.findElement(By.xpath("//input[@id=\"createLeadForm_primaryWebUrl\"]")).sendKeys("www.google.com"); //Enter Url
			driver.findElement(By.xpath("//input[@id=\"createLeadForm_generalToName\"]")).sendKeys("Simon_Stewart"); //Enter To name
			
			driver.findElement(By.xpath("//input[@id=\"createLeadForm_generalAddress1\"]")).sendKeys("81 Lexington St."); //Enter primary address
			driver.findElement(By.xpath("//input[@id=\"createLeadForm_generalCity\"]")).sendKeys("Egg Harbor Township"); //Enter city name
			
			driver.findElement(By.xpath("//input[@name=\"generalPostalCode\"]")).sendKeys("08234"); //Enter Zipcode
			
			WebElement state = driver.findElement(By.name("generalStateProvinceGeoId")); //Select State/Province
			Select dropdown4 = new Select(state);
			dropdown4.selectByValue("NJ");
			
//			driver.findElement(By.xpath("(//select[@id=\"createLeadForm_generalStateProvinceGeoId\"]/option)[37]")).click(); //Select State
			
//			driver.findElement(By.xpath("//input[@id=\"ext-gen716\"]")).click(); //Click on Create Lead
			
		
			
			
			
			
	

		}

}
