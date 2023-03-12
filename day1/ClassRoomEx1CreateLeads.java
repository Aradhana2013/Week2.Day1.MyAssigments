package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassRoomEx1CreateLeads {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Gomathy");	
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Vasudevan");
		driver.findElement(By.className("smallSubmit")).click();
		
		if(driver.getTitle().contains("View Lead | opentaps CRM")) {
			System.out.println("Test Case Passed");
		}
		else
			System.out.println("Test Case Failed");
		
		driver.close();

	}

}
