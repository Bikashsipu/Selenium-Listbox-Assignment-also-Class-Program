import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Duplicatetext {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//ArrayList<String> al=new ArrayList<>();
		HashSet<String> hs=new HashSet<String>();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/bikas/OneDrive/Desktop/Html%20VisualStudio/listbox.html");
		WebElement mtrlistbox = driver.findElement(By.id("mtr"));
		Select sc = new Select(mtrlistbox);
		List<WebElement> all = sc.getOptions();
		int count = all.size();
		for(WebElement all1:all)
			
			 {
			String r = all1.getText();
			/*
			 * if(!hs.contains(r)) { hs.add(r); } else { al.add(r); }
			 * 
			 * for(String r1:al) { if(al.add(r1)==true) { System.out.println(r1); } }
			 */
				// hs.add(r);
				if(hs.add(r)==false)
					//if(hs.add(r)==true)
				{
					System.out.println(r);
				}
			 } 
		
	
		 
		
driver.close();
	}

			 
}
