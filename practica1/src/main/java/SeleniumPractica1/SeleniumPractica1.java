package SeleniumPractica1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumPractica1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String exe_Path="./driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exe_Path);
		
		WebDriver driver= (WebDriver) new ChromeDriver();
		driver.get("https://google.com");
		
		
		//pantalla completa windows 
		driver.manage().window().maximize();
		
		
				driver.get("https://demoqa.com/select-menu");
				
				Select oldStyleMenu = new Select(driver.findElement(By.id("oldSelectMenu")));

				oldStyleMenu.selectByIndex(1);
				Thread.sleep(3000);

				//Selecciona porvalor

				oldStyleMenu.selectByValue("B");
				Thread.sleep(3000);

				//selecciona por texto
				oldStyleMenu.selectByVisibleText("Magenta");
				
		
		
		
	}

}
