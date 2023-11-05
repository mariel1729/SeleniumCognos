package SeleniumPractica1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPracticaFInal_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String exe_Path="./driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exe_Path);
		
		WebDriver driver= (WebDriver) new ChromeDriver();
		driver.get("https://google.com");
		
		driver.get("https://demoqa.com/text-box");
		
		//pantalla completa windows 
		driver.manage().window().maximize();
	
		
		
		WebElement btnpropiedades = driver.findElement(By.xpath("//span[contains(.,'Broken Links-Images')]"));
		Thread.sleep(2000);
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoview();", btnpropiedades);
		
		WebElement forms = driver.findElement(By.id("item-0"));
				forms.click();
				Thread.sleep(2000);
				//username.clear();
				
				WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
				email.sendKeys("gatahuichi@bancounion.com.bo");
				Thread.sleep(2000);
				
				WebElement current = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
				current.sendKeys("Calle 1");
				Thread.sleep(2000);
				
				
		
				
				JavascriptExecutor js1= (JavascriptExecutor) driver;
				js1.executeScript("arguments[0].scrollIntoview();", btnpropiedades);
				
				
				WebElement permanent = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
				permanent.sendKeys("av. 8 de Mayo");
				Thread.sleep(2000);
				//WebElement boton=driver.findElement(By.xpath("//*[@id=\"submit\"]"));
				
				
				WebElement boton=driver.findElement(By.id("submit"));
				boton.click();
				
		
		
		
	}

}
