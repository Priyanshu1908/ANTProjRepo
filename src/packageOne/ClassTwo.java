package packageOne;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClassTwo {
	
	@Test
	  public void testTwo(){
		  
		WebDriver driver = new ChromeDriver();
		 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		driver.get("https://compendiumdev.co.uk/selenium/basic_web_page.html");
		 
		driver.close();
		  
	  }

}
