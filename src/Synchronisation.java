import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//IMPLICITLY WAIT-wait for the page to be loaded
public class Synchronisation {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.gmail.com");
		driver.findElement(By.id("Email")).sendKeys("monishadominic@gmail.com");//enter email
		driver.findElement(By.id("next")).click();//click on next
		driver.findElement(By.id("Passwd")).sendKeys("08086032249");//enter password
		driver.findElement(By.id("signIn")).click();//click on signin
		//EXPLICITLY WAIT-wait for the elements to be loaded
		WebDriverWait wait=new WebDriverWait (driver, 50);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id(":2m")));
		
		driver.findElement(By.xpath("//span[@class='gb_9a gbii']")).click();//click on signout pic
		driver.findElement(By.id("gb_71")).click();//click on signout button

	}

}
