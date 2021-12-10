import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebookmonthdayyearlistbox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("//a[.='Create New Account']")).click();
		WebElement monthlistbox = driver.findElement(By.id("day"));
		WebElement monthlistbox1 = driver.findElement(By.id("month"));
		WebElement monthlistbox2 = driver.findElement(By.id("year"));
		Thread.sleep(3000);
		Select sc = new Select(monthlistbox);
		Select sc1 = new Select(monthlistbox1);
		Select sc2 = new Select(monthlistbox2);
		Thread.sleep(3000);
		sc.selectByIndex(9);
		Thread.sleep(3000);
		sc1.selectByValue("2");
		Thread.sleep(3000);
		sc2.selectByVisibleText("1999");
		driver.close();
	}

}
