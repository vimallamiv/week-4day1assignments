package week4day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import io.github.bonigarcia.wdm.WebDriverManager;


public class chittorgarh {
           
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.chittorgarh.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
			driver.findElement(By.id("navbtn_stockmarket")).click();

			
			driver.findElement(By.linkText("NSE Bulk Deals")).click();
			
			
			List<WebElement> row = driver.findElements(By.xpath("(//table)[2]//tr"));
			int rowsize = row.size();
			System.out.println("the number of rows are: "+rowsize);
			System.out.println("security names are:");
			
			List<String>list=new ArrayList<String>();
			List<WebElement> column = driver.findElements(By.xpath("(//table)[2]//tr//td[3]"));
			
			for (WebElement security : column) {
				String text = security.getText();
				System.out.println(text);
				
				Set<String>newlist=new TreeSet<String>(list);
				System.out.println(newlist);
}
	}
}
