import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Actitime_fileupload {

	public static void main(String[] args) {
		//class  saveButton
		
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com/sts/tasks/otasklist.do");
		driver.findElement(By.id("username")).sendKeys("monishadominic");
		driver.findElement(By.name("pwd")).sendKeys("ty7uzEXe");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		//driver.findElement(By.className("popup_menu_icon settings_icon")).click();
		driver.findElement(By.className("popup_menu_label")).click();
		driver.findElement(By.linkText("Logo & Color Scheme")).click();
		driver.findElement(By.id("uploadNewLogoOption")).click();
		driver.findElement(By.name("formCustomInterfaceLogo.logo")).sendKeys("C:\\UsersCHETHAN\\Desktop\\logo.png");
		//driver.findElement(By.className("inputChooseFile")).sendKeys("C:/Users/CHETHAN/Desktop/logo.png");
	}

}
