package week4day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Learndraganddrop {
       public static void main(String[] args) {
    	   WebDriverManager.chromedriver().setup();
   		ChromeDriver driver =new ChromeDriver();
   		driver.manage().window().maximize();
   		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
   		driver.get("https://leafground.com/pages/drop.html");
   		WebElement drag = driver.findElement(By.id("draggable"));
   		WebElement drop = driver.findElement(By.id("droppable"));
   		
   		Actions builder =new Actions(driver);
   		builder.dragAndDrop(drag, drop).perform();
   		System.out.println("drag point"+drag + "drop point"+ drop );
   		
   		
   		
   		
   		
   		
   		
   		
   		
   		
   		
	}      
	       

}
