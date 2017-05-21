import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/CHETHAN/Desktop/softwares/html/barrels.html");
		//MULTIPLE SELECT
		WebElement w=driver.findElement(By.name("Litres"));
		Select s=new Select(w);
		
		//to select all options
		s.selectByIndex(0);
		s.selectByValue("2");
		s.selectByVisibleText("200 litres");
		Thread.sleep(1000);
		
		//to deselect all options
		s.deselectAll();
		
		//to print count of number of options
		List<WebElement> options = s.getOptions();
		System.out.println(options.size());
		
		//to print all options
		for (int i=0;i<options.size();i++)
		{
		System.out.println(options.get(i).getText());
		}
		
		//to select all options present in listbox
		for (int i=0;i<options.size();i++)
		{
		s.selectByIndex(i);
		}
		
		//to print all selected options
		List<WebElement> seloptions = s.getAllSelectedOptions();
		for(int i=0;i<seloptions.size();i++)
		{
			System.out.println(seloptions.get(i).getText());
		}
		
		//to print first selected options
		WebElement firstseloption = s.getFirstSelectedOption();
		System.out.println(firstseloption);
		
		//SINGLE SELECT
		WebElement w1=driver.findElement(By.name("Quantity"));
		Select s1=new Select(w1);
		if (s1.isMultiple())//to check single or multiple
		{
			System.out.println("multiple drop down");
		}
		else
		{
			System.out.println("single drop down");
		}
		//to print count of number of options
		List<WebElement> options1 = s1.getOptions();
		System.out.println(options1.size());
		
		//to print all options
		for(int i=0;i<options1.size();i++)
		{
		System.out.println(options1.get(i).getText());
		}
		
	
	}

}
