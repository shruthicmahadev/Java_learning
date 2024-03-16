import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args)  {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		driver.get("https://trytestingthis.netlify.app/");
		WebElement dropdown = driver.findElement(By.id("option"));
		Select selectObject = new Select(dropdown);
		/*selectObject.selectByIndex(1);
		selectObject.selectByValue("option 2");
		selectObject.selectByVisibleText("Option 3");*/
		
		List<WebElement> options = selectObject.getOptions();
		
	
	
		
		
		
		
		
		
		
		
		
		
		
	
		
	}

}
