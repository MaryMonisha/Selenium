import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Javascript {

	public static void main(String[] args)  {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in");
		driver.findElement(By.id("loginbutton")).click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		alert.dismiss();

	}

}
