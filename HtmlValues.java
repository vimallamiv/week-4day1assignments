package week4day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HtmlValues {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://html.com/tags/table/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		List<WebElement> column = driver.findElements(By.xpath("(//table)[1]//th"));
		int columnsize = column.size();
		
		System.out.println("column size is " + columnsize);
		List<String>lib1=new ArrayList<String>();
		for (int i = 1; i <columnsize +1; i++) {
			String value1 = driver.findElement(By.xpath("(//table)[1]/tbody/tr[1]/td["+i+"]")).getText();
			lib1.add(value1);
		}
		System.out.println("Market Share Values are :");
		System.out.println(lib1);
		
		List<String>lib2=new ArrayList<String>();
		for (int j = 2; j < columnsize+1; j++) {
			String value2 = driver.findElement(By.xpath("(//table)[1]/tbody/tr[2]/td["+j+"]")).getText();
			lib2.add(value2);
		}
		
			System.out.println("Absolute usage values are : ");
			System.out.println(lib2);
	}

}
