package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class spicejet {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https:/www.spicejet.com");
		driver.findElement(By.className("home_flight_search")).click();
		driver.findElement(By.xpath("html/body/form/div[4]/div[2]/div/div[4]/div[2]/div[1]/div[2]/div[2]/div/div[1]/table/tbody/tr/td[2]/input")).click();
		driver.findElement(By.xpath("html/body/form/div[4]/div[2]/div/div[4]/div[2]/div[1]/div[2]/div[2]/div/div[2]/div/div[1]/input[1]")).click();
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		driver.findElement(By.xpath("html/body/form/div[4]/div[2]/div/div[4]/div[2]/div[1]/div[2]/div[2]/div/div[2]/div/div[2]/input[1]")).click();
		driver.findElement(By.xpath("//a[@value='GOI']")).click();
		driver.findElement(By.id("ctl00_mainContent_txt_Fromdate")).click();
		driver.findElement(By.xpath("html/body/div[1]/div[1]/table/tbody/tr[4]/td[2]/a")).click();
		driver.findElement(By.id("ctl00_mainContent_txt_Todate")).click();
		driver.findElement(By.xpath("html/body/div[1]/div[2]/table/tbody/tr[5]/td[2]/a")).click();
		Select dropdown = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		dropdown.selectByVisibleText("5 Adults");
		Select dropdown1 = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
		dropdown1.selectByVisibleText("2 Children");
		Select dropdown2 = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		dropdown2.selectByIndex(1);
		driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).click();
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	}

}
