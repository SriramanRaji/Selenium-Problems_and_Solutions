package imageBasedAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

/**
 * A simple program to demonstrate how to utilize Sikuli - Image based automation API to upload files to Web Browsers integrated with Selenium
 * 
 * @author Sriraman Raji
 * @version 1.0
 * @category Automation Problem
 * @since 14-October-2021
 *
 */

public class FileUploadWithSikuli {

//	URL
	private static String URL = "https://sriramanraji.github.io/requestprogram/uploadFile.html";
	
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
//		screen.wait(new Pattern("D:\\Live Directory\\eclipse\\ZAutomationSolutions\\resources\\btnChooseFile.JPG"), 5);  //Pleace a wait on first element if required
		screen.click(new Pattern("D:\\Live Directory\\eclipse\\ZAutomationSolutions\\resources\\btnChooseFile.JPG"));
		
		screen.type(new Pattern("D:\\Live Directory\\eclipse\\ZAutomationSolutions\\resources\\winTxtFilePath.JPG"), "/Insert a File Path/");
		
		screen.click(new Pattern("D:\\Live Directory\\eclipse\\ZAutomationSolutions\\resources\\winBtnOpen.JPG"));

//		Browser Teardown
		driver.close();
		driver.quit();
	}

}
