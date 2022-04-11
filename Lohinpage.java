package Waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitDemo {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","F:\\chrome extension\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.name("email")).sendKeys("vaibhav");
		
		driver.findElement(By.name("pass")).sendKeys("dhon");
		
		driver.findElement(By.name("login")).click();
		
		driver.quit();

	}

}
