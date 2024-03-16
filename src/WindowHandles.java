import java.time.Duration;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//String windowID = driver.getWindowHandle();
		//System.out.println(windowID);
		
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		
		Set<String> windowIDs=driver.getWindowHandles();
		
		/*Iterator<String> it = WindowIDs.iterator();
		
		String parentWindowID = it.next();
		String childWindowID = it.next();
		
		System.out.println("Parent windowID" +parentWindowID);
		System.out.println("Child windowID" +childWindowID);*/
		
		List<String> windowIDsList = new ArrayList(windowIDs);
		
		
		String parentWindowID = windowIDsList.get(0);
		
		String childWindowID = windowIDsList.get(1);
		
		
	}

}
