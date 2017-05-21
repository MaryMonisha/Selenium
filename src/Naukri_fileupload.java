import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Naukri_fileupload {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		driver.findElement(By.id("block")).click();
		driver.findElement(By.id("input_resumeParser")).sendKeys("C:\\Users\\CHETHAN\\Desktop\\resume\\Monisha_2yr_Manual+Selenium.docx");
		driver.findElement(By.id("bd_name")).sendKeys("Mary Monisha Dominic");
		driver.findElement(By.id("bd_email")).sendKeys("monishadominic@gmail.com");
		driver.findElement(By.id("bd_mobile")).sendKeys("9448890570");
		driver.findElement(By.id("bd_adv_workExp_year")).click();
		driver.findElement(By.xpath("(//li[@id=' 2'])[1]")).click();
		driver.findElement(By.id("bd_password")).sendKeys("Manujohn24");
		driver.findElement(By.xpath("//button[.='Register']")).click();
		
		
		

	}

}
