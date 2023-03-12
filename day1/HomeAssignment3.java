package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HomeAssignment3 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Gomathy");	
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Vasudevan");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Goma");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("HR");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("NIL");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("goms91186@gmail.com");
		
		WebElement Province = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dropone = new Select(Province);
		dropone.selectByVisibleText("New York");
		
		driver.findElement(By.name("submitButton")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CTS");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Raji");
		driver.findElement(By.className("smallSubmit")).click();
		
		if(driver.getTitle().contains("View Lead | opentaps CRM")) {
			System.out.println("Test Case Passed");
		}
		else
			System.out.println("Test Case Failed");
		
		driver.close();
		

	}

}
