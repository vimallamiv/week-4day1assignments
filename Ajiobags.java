package week4day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajiobags {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@name=\"searchVal\"]")).sendKeys("bags",Keys.ENTER);
		driver.findElement(By.xpath("//label[text()=\"Men (1,573)\"]")).click();
		driver.findElement(By.xpath("//label[text()=\"Fashion Bags (390)\"]")).click();
		
		//total number of bags
	    String totalitems = driver.findElement(By.className("length")).getText();
	    System.out.println("total no of bags :" + totalitems );
	    //brans available
		List<WebElement> bagbrands = driver.findElements(By.className("brand"));
		System.out.println("list of brands" +bagbrands );
		System.out.println("size" + bagbrands.size());
		
		for (WebElement WebElement  : bagbrands) {
			String text = WebElement.getText();
			System.out.println(text);
			
			List<WebElement> bagnames = driver.findElements(By.className("nameCls"));
			System.out.println("size" + bagnames.size() );
			System.out.println("the bag names are:");
			
			for (WebElement webElement : bagnames) {
				String text2 = webElement.getText();
				System.out.println(text2);
				
				
			}
		}
		
	}

}
