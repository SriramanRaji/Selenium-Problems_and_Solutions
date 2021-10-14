package imageBasedAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

/**
 * A simple program to demonstrate how to utilize Sikuli - Image based automation API to interact with Web Browser where Selenium is having issues
 * 
 * @author Sriraman Raji
 * @version 1.0
 * @category Automation Problem
 * @since 14-October-2021
 *
 */

public class WebAutomationWithSikuli {

//	URL
	private static String URL = "https://sriramanraji.github.io/SriramanRaji/contact.html";
	
//	Driver Path - Change while executing
	private static String driverPath = "D:/Live Directory/Drivers & Jars/Drivers/chromedriver.exe";

	public static void main(String[] args) throws Exception {

//		Browser Initialization
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);

//		Initializing Sikuli - Screen
		Screen screen = new Screen();
		
//		Entering Text and Clicking by using the Reference Image stored locally
//		screen.wait(new Pattern("D:\\Live Directory\\eclipse\\ZAutomationSolutions\\resources\\txtName.JPG"), 5);  //Pleace a wait on first element if required
		screen.type(new Pattern("D:\\Live Directory\\eclipse\\ZAutomationSolutions\\resources\\txtName.JPG"), "Sriraman Raji");
		
		screen.click(new Pattern("D:\\Live Directory\\eclipse\\ZAutomationSolutions\\resources\\btnSubmit.JPG"));

		screen.type(new Pattern("D:\\Live Directory\\eclipse\\ZAutomationSolutions\\resources\\txtEmail.JPG"), "test@test.com");

		screen.type(new Pattern("D:\\Live Directory\\eclipse\\ZAutomationSolutions\\resources\\txtPhone.JPG"), "0123456789");

		screen.type(new Pattern("D:\\Live Directory\\eclipse\\ZAutomationSolutions\\resources\\txtMessage.JPG"), "This is Just a message, do not click send.!");
		Thread.sleep(5000);

//		Browser Teardown
		driver.close();
		driver.quit();
	}

}
