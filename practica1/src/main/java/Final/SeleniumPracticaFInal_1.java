package Final;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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
		driver.manage().window().maximize();
		//driver.get("https://demoqa.com/text-box");

		driver.get("https://demoqa.com/automation-practice-form");
		
		//WebElement element = driver.findElement(By.linkText("Home"));

		//pantalla completa windows 
		
		//JavascriptExecutor executor1 = (JavascriptExecutor)driver;
		//executor1.executeScript("document.body.style.zoom = '0.8'");
		
        //WebElement elemento = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[1]/span/div/div[1]"));
		//elemento.click();
										
	//	WebElement elemento1 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[2]/span/div"));
		//WebElement elemento1 = driver.findElement(By.xpath("//div[text()='Forms']"));
		//elemento1.click();
		
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollBy(0,250)", "");
		
		//WebElement forms = driver.findElement(By.xpath("//*[@id="item-0"]/span"));
		//forms.click();
		
		WebElement forms1 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[2]/div"));
		forms1.click();
				//Thread.sleep(2000);
				//username.clear();
		WebElement name = driver.findElement(By.id("firstName"));
		name.sendKeys("Mariel");
		Thread.sleep(2000);
		
		WebElement lastname = driver.findElement(By.id("lastName"));
		lastname.sendKeys("Atahuichi");
		Thread.sleep(2000);
		
		WebElement email = driver.findElement(By.id("userEmail"));
		email.sendKeys("gatahuichi@bancounion.com.bo");
		Thread.sleep(2000);
		
		//check
		WebElement genero = driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label"));
		genero.click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
		
		WebElement movile = driver.findElement(By.id("userNumber"));
		movile.sendKeys("73224549000");
		Thread.sleep(2000);
				
		//fechaNac
		WebElement calendary = driver.findElement(By.id("dateOfBirthInput"));
		calendary.click();
		//fechaNac
		for (int i=0; i<=5;i++) {
		WebElement month = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/button[1]"));
		month.click();
		} 
		WebElement year = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select"));
		year.click();
		
		WebElement year1 = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select/option[96]\r\n"));
		year1.click();
		
		WebElement day = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[1]"));
		day.click();
		
		
		WebElement subject = driver.findElement(By.id("subjectsInput"));
		subject.sendKeys("adiciona tarea");
		Thread.sleep(2000);
		
				
		//hobbies 
		WebElement hobby = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
		hobby.click();
		
		//picture
		WebElement picture = driver.findElement(By.xpath("//input[@type='file']"));
		picture.sendKeys("C:\\Users\\Administrador\\Pictures\\imagen.jpg");

		WebElement current = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		current.sendKeys("Calle 1");
		Thread.sleep(2000);
					
		//JavascriptExecutor executor = (JavascriptExecutor)driver;
		//executor.executeScript("document.body.style.zoom = '0.6'");
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
       js1.executeScript("window.scrollBy(0,150)", "");
						
	//select state
        WebElement state = driver.findElement(By.id("react-select-3-input"));  
        state.sendKeys("NCR");
        state.sendKeys(Keys.ARROW_DOWN);
        state.sendKeys(Keys.ENTER);
        
        //Thread.sleep(4000);
   
    //select city
     
	 WebElement city = driver.findElement(By.id("react-select-4-input"));
	 city.sendKeys("Noida");
	 city.sendKeys(Keys.ARROW_DOWN);
	 city.sendKeys(Keys.ENTER);
	 
	//envio
    WebElement boton=driver.findElement(By.id("submit"));
    boton.sendKeys(Keys.ARROW_DOWN);
    boton.submit();
	
    //cierra emergente
    Alert alert = driver.switchTo().alert();
    alert.dismiss();
		
	}

}
