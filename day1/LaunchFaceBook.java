package week2.day1;

import org.openqa.selenium.edge.EdgeDriver;

public class LaunchFaceBook {

	public static void main(String[] args) {
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.close();
		

	}

}
