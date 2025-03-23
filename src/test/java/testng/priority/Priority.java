package testng.priority;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Priority {
	WebDriver driver = new ChromeDriver();

	@Test (priority = 3)
	public void CloseBrowser() {
		
		System.out.println("Closing Google Chrome browser");
		driver.close();
	}

	@Test (priority = 0)
	public void OpenBrowser() {
	
		System.out.println("Launching Google Chrome browser"); 
	}

	@Test (priority = 1)
	public void AccountTest(){
		System.out.println("Some tests for Customer Account");
	}
}
