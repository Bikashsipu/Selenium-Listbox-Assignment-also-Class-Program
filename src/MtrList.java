import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MtrList {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://127.0.0.1:5500/listbox.html");
		WebElement monthlistbox = driver.findElement(By.id("mtr"));
		Select sc = new Select(monthlistbox);
		Thread.sleep(3000);
		sc.selectByIndex(5);
		boolean r = sc.isMultiple();
		System.out.println(r);
		

	}

}
