package Helper;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ConfigMab {
	
	public class actions {

	}
	public static WebDriver driver;
	
	public static Actions actions;
	
	public static void maximiseWindow() {
		driver.manage().window().maximize();

	}
	public static void attente(int s)  {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(s));
		
	}
	

}
