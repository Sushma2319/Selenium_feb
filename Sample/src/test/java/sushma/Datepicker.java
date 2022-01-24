package sushma;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Datepicker {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\dasari.sushma\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver dp;
		dp = new ChromeDriver();
		dp.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		dp.get("http://leafground.com/pages/Calendar.html");
		JavascriptExecutor jse=(JavascriptExecutor) dp;
		jse.executeScript("document.getElementById('datepicker').value='10/12/2021'");
			
	  
  }
}
