package week4day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearFindElements {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/control/login");
        driver.findElement(By.id("username")).sendKeys("demosalesmanager");
        //multiple element use class name
        List<WebElement> inputTag = driver.findElements(By.className("inputLogin"));
        int size = inputTag.size();
        System.out.println(size);
        for (WebElement output : inputTag) {
        	String attributevalue = output.getAttribute("class");
        	System.out.println(attributevalue);
        	
		}
	}

}
