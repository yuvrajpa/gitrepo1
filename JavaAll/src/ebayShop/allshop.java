package ebayShop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class allshop {

	public static void main(String[] args) {
WebDriver driver = new FirefoxDriver();
driver.get("https:/www.ebay.com");
Actions act = new Actions(driver);
act.moveToElement(driver.findElement(By.xpath("html/body/div[3]/div/header/table/tbody/tr/td[3]/form/table/tbody/tr/td[1]/div[1]/div/input"))).sendKeys("toys").build().perform();
WebElement ele = driver.findElement(By.xpath("//select[@title='Select a category for search']"));
Select dropdown = new Select(ele);
dropdown.selectByVisibleText("Baby");
driver.findElement(By.xpath("//input[@type='submit']")).click();
act.moveToElement(driver.findElement(By.xpath("html/body/div[3]/div[3]/ul/li[1]/ul/li[2]/a"))).build().perform();
driver.findElement(By.xpath("html/body/div[3]/div[3]/ul/li[1]/ul/li[2]/ul/li[2]/a")).click();
WebElement ele1 = driver.findElement(By.xpath("//a[@aria-controls='SortMenu']"));
Select drop1 = new Select(ele1);
drop1.selectByIndex(2);
	}

}
