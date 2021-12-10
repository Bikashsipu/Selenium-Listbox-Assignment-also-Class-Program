import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class alloptions {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		HashSet<String> hs=new HashSet<>();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/bikas/OneDrive/Desktop/Html%20VisualStudio/listbox.html");
		WebElement mtrlistbox = driver.findElement(By.id("mtr"));
		Select sc = new Select(mtrlistbox);
		List<WebElement> all = sc.getOptions();
		int count = all.size();
		for(WebElement all1:all)
		{
			String r = all1.getText();
			hs.add(r);
		}
		
		
		//  for(int i=0;i<count;i++) { String r = all.get(i).getText(); hs.add(r); }
		 
		for(String text:hs)
		{
			System.out.println(text);
		}
		
driver.close();
	}

}
