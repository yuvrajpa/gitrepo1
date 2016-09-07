package rediff;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class FirstRediff{
	@org.testng.annotations.Test
	public void first(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Anu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.rediff.com");
		driver.findElement(By.linkText("Create a Rediffmail account")).click();
		
	}
}

