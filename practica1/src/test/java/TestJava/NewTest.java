package TestJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  
	  String exe_Path="./driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exe_Path);
		
		WebDriver driver= (WebDriver) new ChromeDriver();
		driver.get("https://google.com");
  }
}
