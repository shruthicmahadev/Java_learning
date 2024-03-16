import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Promt {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.findElement(By.id("promptBox")).click();
		
		/*Alert alert2 = driver.switchTo().alert();
		alert2.sendKeys("Shruthi");
		alert2.accept();*/
		
		
		
			
		

	}

}
