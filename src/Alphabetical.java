import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Alphabetical {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		 ArrayList <String> al=new ArrayList<>();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/bikas/OneDrive/Desktop/Html%20VisualStudio/listbox.html");
		WebElement mtrlistbox = driver.findElement(By.id("mtr"));
		Select sc = new Select(mtrlistbox);
		List<WebElement> all = sc.getOptions();
		int count = all.size();
		for(WebElement alpha:all)
			
			 { 
			 String alphatext = alpha.getText();
			 
			 al.add(alphatext);
			 }
			 
		
		Collections.sort(al);
		
		for( String option:al)
		{
			System.out.println(option);
		}
		 
		
driver.close();
	}

}
