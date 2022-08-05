package week4day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class redBustable {
public static void main(String[] args) {
	
	
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.redbus.in/");
	driver.findElement(By.id("src")).sendKeys("Madiwala Bangalore",Keys.ENTER);
	driver.findElement(By.id("dest")).sendKeys("Koyambedu Chennai",Keys.ENTER);
	driver.findElement(By.xpath("//input[@id=\"onward_cal\"]")).click();
	driver.findElement(By.xpath("//table//tr[7]/td[6]")).click();
	driver.findElement(By.xpath("//button[@id='search_btn']")).click();
	String title = driver.getTitle();
	System.out.println(title);
}
}
