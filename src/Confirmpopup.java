import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Confirmpopup {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();

	}

}
