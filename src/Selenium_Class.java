import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_Class {

	public static void main(String[] args)  {
	
		//System.setProperty("webdriver.Chrome.driver", "D:\\chromedriver_win32 (1)");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.swt.travel/");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//div[@class='userorlogin']")).click();
		driver.findElement(By.id("email")).sendKeys("shruc.provab@gmail.com");
		driver.findElement(By.id("password")).sendKeys("provaB@123");
		driver.findElement(By.id("login_submit")).click();
		
		
	}

}
