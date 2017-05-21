import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Seleniumhq_filedownload {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		FirefoxProfile profile=new FirefoxProfile();
		profile.setPreference("browser. helperApps. neverAsk. saveToDisk", "application/zip");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.seleniumhq.org");
		driver.findElement(By.linkText("Download")).click();
		driver.findElement(By.xpath(" (//a[.='Download'])[2]")).click();
				
	}

}
