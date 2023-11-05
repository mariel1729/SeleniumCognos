package SeleniumPractica1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumPractica4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String exe_Path="./driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exe_Path);
		
		WebDriver driver= (WebDriver) new ChromeDriver();
		
		
		//pantalla completa windows 
		((Options) driver.manage().window()).timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
				driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
				
				driver.findElement(By.xpath("//button[@onclick=' jsConfirm()']")).click();
				Thread.sleep(3000);
				Alert alert1 =driver.switchTo().alert();
				System.out.println(alert1.getText());
				alert1.accept();
				
				if(driver.getPageSource().contains("You Clicked: OK"))
				{
					System.out.println("BotonAceptar");
				}
				else 
				{
					System.out.println("BotonCancelar");
				}
				
				Thread.sleep(3000);
				
		
		
		
	}

}
