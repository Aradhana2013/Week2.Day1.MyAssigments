package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchApplication {

	public static void main(String[] args) {
		// to launch browser
		ChromeDriver driver = new ChromeDriver();
		
		// to load the url
		driver.get("https://www.amazon.ca/?tag=hydcaabkm-20&ref=pd_sl_2hg2fohwyk_e&adgrpid=1358996604673450&hvadid=84937442592764&hvnetw=o&hvqmt=e&hvbmt=be&hvdev=c&hvlocint=32&hvlocphy=5245&hvtargid=kwd-84937457582123:loc-32&hydadcr=11828_10253915");
	
		//to maximize
		driver.manage().window().maximize();
		
		//to close the browser window
		driver.close();
		
		//should use driver.quit(); for multiple windows opened case
	}

}
