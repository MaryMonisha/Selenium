import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//FILE UPLOAD POPUP
public class Entirepopup3 {

	public static void main(String[] args) {
WebDriver driver=new FirefoxDriver();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.get("http://www.actimind.com/contact.php");
driver.findElement(By.name("firstName")).sendKeys("Mary");;
driver.findElement(By.name("lastName")).sendKeys("Monisha");;
driver.findElement(By.name("company")).sendKeys("cisco");;
driver.findElement(By.name("position")).sendKeys("IT Alalyst");;
driver.findElement(By.name("emailAddress")).sendKeys("monishadominic@gmail.com");;
driver.findElement(By.name("phone")).sendKeys("9343487840");;
driver.findElement(By.name("details")).sendKeys("abc");;
driver.findElement(By.name("file")).sendKeys("C:\\Users\\CHETHAN\\Desktop\\resume\\Monisha_2yr_Manual+Selenium.docx");
//after opening the file we need to click on open how???
driver.findElement(By.xpath("//button[.='Register']")).click();








	}

}
