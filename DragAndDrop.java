package week4day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://leafground.com/pages/drag.html");
        WebElement drag = driver.findElement(By.id("draggable"));
        Point location = drag.getLocation();
        int x = location.getX();
        int y = location.getY();
        System.out.println("value of x" +x+ "value of y" +y);
        Actions builder = new Actions(driver);
        builder.dragAndDropBy(drag, x, y).perform();
        
        
        
        
        
        
        
	}

}
