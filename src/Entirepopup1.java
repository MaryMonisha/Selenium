import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//HIDDEN DIVISION POPUP-colourful,cannot move, can inspect
public class Entirepopup1 {

	public static void main(String[] args) {
		//HIDDEN DIVISION POPUP-colourful,can inspect, cannot move. colourful
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.yatra.com/");
		driver.findElement(By.id("BE_flight_depart_date")).click();
		driver.findElement(By.id("a_2017_4_28")).click();
		driver.close();
	}

}
