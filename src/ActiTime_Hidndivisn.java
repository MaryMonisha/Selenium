import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActiTime_Hidndivisn {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://online.actitime.com/sts/tasks/otasklist.do");
		driver.findElement(By.id("username")).sendKeys("monishadominic");
		driver.findElement(By.name("pwd")).sendKeys("ty7uzEXe");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		driver.findElement(By.xpath("(//div[@class='label'])[2]")).click();
		driver.findElement(By.name("taskSelected[17]")).click();
		driver.findElement(By.className("hierarchy_element_wide_button")).click();
		driver.findElement(By.id("deleteTaskPopup_deleteConfirm_cancelBtn")).click();
	}

}
