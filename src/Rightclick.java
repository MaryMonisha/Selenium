

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement w = driver.findElement(By.id("irctc_tourism"));
		driver.get("https://www.irctc.co.in");
		Actions a=new Actions(driver);
		a.moveToElement(w);
		driver.findElement(By.linkText("Tourist Train")).click();

	}

}
