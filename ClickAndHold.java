package week4day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickAndHold {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://leafground.com/pages/selectable.html");
	WebElement item1 = driver.findElement(By.xpath("//li[text()=\"Item 1\"]"));
	WebElement item7 = driver.findElement(By.xpath("//li[text()=\"Item 7\"]"));
	
	//perform action
	Actions builder =new Actions(driver);
	builder.clickAndHold(item1).clickAndHold(item7).release().perform();
	
	
	
	
	
	
	
	
}
}
