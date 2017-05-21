package encaps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Loginbutton1 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("");
		Loginbutton l=new Loginbutton(driver.findElement(By.id("")));
		
	}

}
