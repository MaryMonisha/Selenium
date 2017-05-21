import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick1 {

	public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	driver.get("https://login.naukri.com");
	WebElement w = driver.findElement(By.xpath("(//div[@class='mTxt'])[1]"));
	Actions a=new Actions(driver);
	a.moveToElement(w);
	
	a.sendKeys(Keys.ARROW_DOWN).perform();
	System.out.println("eeeeeeeeeeeeee");
	a.sendKeys(Keys.ARROW_DOWN).perform();//its choosing browse jobs by company
	a.sendKeys(Keys.ENTER).perform();
	System.out.println("eeeeeeeeeeeeee");

	}

}
