import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Findingpath {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in");
		//driver.findElement(By.id("gs_htif0")).sendKeys("Cassini aircraft");
		//driver.findElement(By.id("_fZl")).click();
		WebElement w=driver.findElement(By.xpath("//input[@jsaction='sf.lck']"));//click on sign in
		boolean b=w.isEnabled();
				if(b)
				{
				System.out.println("enabled");	
				}
				else
				{
				System.out.println("disabled");	
				}
		driver.close();
		//is enabled always returns true????-yes its always true because it just checks whether the element is highlighted or not here signin is highlighted
		

	}

}
