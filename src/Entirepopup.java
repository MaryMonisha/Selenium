import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Entirepopup {

	public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	//JAVASCRIPT POPUP -not colourful,no inspect, cannot move
	driver.get("https://www.irctc.co.in");
	driver.findElement(By.id("loginbutton")).click();
	Alert alert=driver.switchTo().alert();
	String act_msg = alert.getText();
	String exp_msg=("Enter User ID");
	if(exp_msg.equals(act_msg))
	{
	System.out.println("mes verified");	
	}
	else{
		System.out.println("fail");
		}
	
	alert.accept();
	driver.close();
	
	
	
	
	}

}
