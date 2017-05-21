import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Entirepopup2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\CHETHAN\\Desktop\\softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
        //driver.findElement(By.xpath("//input[@value='Upload CV' and @ type='button']")).click();
		driver.findElement(By.xpath("//a[.='CREATE JOB ALERT']")).click();
		driver.findElement(By.id("Sug_kwdsugg")).sendKeys("Selenium");
		driver.findElement(By.id("Sug_locsugg")).sendKeys("Bangalore");
		WebElement w = driver.findElement(By.id("cjaExp"));
		//driver.findElement(By.id("~2")).click();//org.openqa.selenium.WebDriverException
		System.out.println("yeeeeeeeeeeeeeesss");
		Select s= new Select(w);
		s.selectByVisibleText("2");
		System.out.println("yeeeeeeeeeeeeeesss");
		//WebElement w1 = driver.findElement(By.id("cjaMinSal"));
		//Select s1=new Select(w1);
		//s1.selectByVisibleText("5");
		//driver.findElement(By.id("cjaInd"));
	}

}
