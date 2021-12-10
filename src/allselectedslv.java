import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class allselectedslv {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/bikas/OneDrive/Desktop/Html%20VisualStudio/listbox.html");
		WebElement listbox = driver.findElement(By.id("slv"));
		Select sc = new Select(listbox);
		sc.selectByIndex(1);
		sc.selectByIndex(4);
		List<WebElement> all = sc.getAllSelectedOptions();
		int count = all.size();
		System.out.println(count);
		for(WebElement allselected:all)
		{
			System.out.println(allselected.getText());
		}
		
driver.close();
	}

}
