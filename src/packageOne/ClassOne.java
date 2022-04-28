package packageOne;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClassOne {
	
  
  @Test
  public void testOne(){
	  
	 WebDriver driver = new ChromeDriver();
	 
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
	 driver.get("http://omayo.blogspot.in");
		 
	 driver.close(); 
	  
  }
  
  
}
