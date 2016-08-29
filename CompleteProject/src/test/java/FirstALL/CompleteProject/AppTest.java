package FirstALL.CompleteProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
public class AppTest{
@org.testng.annotations.Test
	public void testing(){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		String tit1  =driver.getTitle();
		if(tit1.contentEquals("Google")){
			System.out.println("TestPassed");
		}
			else 
			{
				System.out.println("TestFailed");
			}
		}
	}

