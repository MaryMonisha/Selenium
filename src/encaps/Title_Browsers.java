package encaps;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Title_Browsers {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com");
		Set<String> wh = driver.getWindowHandles();
		for(String alwhs:wh)
		{
			 driver.switchTo().window(alwhs);
			 String title = driver.getTitle();
		}

	}

}
