import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleselectListbox {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("//a[.='Create New Account']")).click();
	   WebElement month = driver.findElement(By.id("month"));
	   Select s=new Select(month);
	   Thread.sleep(2000);
	   s.selectByIndex(5);
	   Thread.sleep(2000);
	   s.selectByValue("8");
	   Thread.sleep(2000);
	   s.selectByVisibleText("Jan");
	   driver.close();
	   
		
	}

}
