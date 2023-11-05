package test_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class test_1 {
	public static void main (String [] args ) {
		String exe_Path="./driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exe_Path);
		
		WebDriver driver= (WebDriver) new ChromeDriver();
		driver.get("https://google.com");
	}
}
