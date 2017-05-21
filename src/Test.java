import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	//go to google in search bar enter google
public class Test {
	public static void main(String[] args) {
			WebDriver driver=new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://www.google.co.in");
			System.out.println("TTTTTTTTTTTTT");
			driver.findElement(By.className("gsfi")).sendKeys("google");
			//driver.findElement(By.id("gs_htif0")).sendKeys("google");//when clicked on evaluate it doesnt highlight
			//unable to find google search
			//driver.findElement(By.id("_fZl")).click();
//error - org.openqa.selenium.InvalidElementStateException: Element is disabled and so may not be used for actions
			
}
}