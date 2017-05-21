import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//in google page click on gmail link
public class Test2 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in");
		driver.findElement(By.linkText("Gmail")).click();
		//driver.findElement(By.xpath("//a[@href='https://mail.google.com/mail/?tab=wm']")).click();//2 matching nodes
		//driver.findElement(By.xpath("//a[.='Gmail']")).click(); //2 matching nodes
////a[ .='Gmail' and @href='https://mail.google.com/mail/?tab=wm' ] it doesnt work as per scenario 1 still shows up 2 matching nodes
		//driver.findElement(By.className("gb_P")).click();
		//how does classname work ?it should have tag class eg class=gb_P
	}

}
