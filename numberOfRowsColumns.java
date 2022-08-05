package week4day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class numberOfRowsColumns {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get(" https://html.com/tags/table/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
      
        //to find size of row  of table 1
        List<WebElement> row1 = driver.findElements(By.xpath("//table[1]//tr"));
        int t1rowsize = row1.size();
        System.out.println("the row size of table 1 is: "+ t1rowsize );
        
        //to find size of row of table 2
        List<WebElement> row2 = driver.findElements(By.xpath("//table[@class=\"attributes-list\"]//tr"));
        int t2rowsize = row2.size();
        System.out.println("the rowsize of table2 is : "+ t2rowsize );
        
        //to find column size of table 1
        List<WebElement> column1 = driver.findElements(By.xpath("//table[1]//th"));
        int t1columnsize = column1.size();
        System.out.println("the columnsize of table 1 is :"+ t1columnsize);
        
        //to find column size of table 2
        List<WebElement> column2 = driver.findElements(By.xpath("//table[@class=\"attributes-list\"]//th"));
        int t2columnsize = column2.size();
        System.out.println("thw columnsize of table 2 is :" +t2columnsize);
        
	}

}
