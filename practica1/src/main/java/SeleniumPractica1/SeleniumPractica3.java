package SeleniumPractica1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumPractica3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String exe_Path="./driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exe_Path);
		
		WebDriver driver= (WebDriver) new ChromeDriver();
		//driver.get("https://google.com");
		
		
		//pantalla completa windows 
		driver.manage().window().maximize();
		
		
				driver.get("https://demoqa.com/select-menu");
				
				
				//obtenemos elemento
				
				JavascriptExecutor js= (JavascriptExecutor) driver;
				js.executeScript("Window.scrollTo(0,280)");
				
				
				WebElement dropdown =driver.findElement(By.xpath("//div[class=' css-yk16xy-control'])[3]"));
				dropdown.click();
				WebElement cajatexto =driver.findElement(By.xpath("//*[@id=\"react-select-4-input\"]"));
				cajatexto.sendKeys("Green");
				
				cajatexto.sendKeys(Keys.ENTER);
				
				WebElement multipleSelect =driver.findElement(By.xpath("//div[.=\"Select...\" and @class=' css-class=' css-1wa3eu0-placeholder'"));
				multipleSelect.click();


				
		
		
		
	}

}
