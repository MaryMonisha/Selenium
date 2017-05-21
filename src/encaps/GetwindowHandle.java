package encaps;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetwindowHandle {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		Set<String> wh = driver.getWindowHandles();
		System.out.println(wh.size());
		for(String awhs:wh)
		{
			System.out.println(awhs);
		}
	}

}
