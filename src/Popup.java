//import java.util.concurrent.TimeUnit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Popup {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://online.actitime.com/sts");
		driver.findElement(By.id("username")).sendKeys("monishadominic");//username
		driver.findElement(By.name("pwd")).sendKeys("ty7uzEXe");//password
	    driver.findElement(By.xpath("//div[.='Login ']")).click();//login
		driver.findElement(By.xpath("//div[text()='TASKS']")).click();//click on task
		driver.findElement(By.xpath("//a[.='All']")).click();//click on all task
		driver.findElement(By.linkText("Completed Tasks")).click();//click on completed task
		System.out.println("aaaaaaaaaaaaaaaaaa");
		driver.findElement(By.className("hierarchy_element_wide_button")).click();
		System.out.println("aaaaaaaaaaaaaaaaaa");
		Alert alert=driver.switchTo().alert();
		String act_msg="Please select tasks to delete";
		String exp_msg=alert.getText();
		if(act_msg.equals(exp_msg))
		 
		{
		System.out.println("pass");	
		}
		else
		{
		System.out.println("fail");	
		}
		alert.accept();
	}

}
