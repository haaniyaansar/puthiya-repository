package frameHandlingeg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Freamehandlingpgm {
@Test
public void show()
{
	System.out.println("welcome to frame handling session");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://ui.vision/demo/webtest/frames/");
	
	WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
	
	driver.switchTo().frame(frame1);
	
	WebElement text1=driver.findElement(By.xpath("//*[@id=\"id1\"]/div/input"));

	text1.sendKeys("selenium");
	driver.switchTo().defaultContent();

	WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
	driver.switchTo().frame(frame2);
	
	WebElement text2=driver.findElement(By.xpath("/html/body/form/div/input"));
	text2.sendKeys("java");
	driver.switchTo().defaultContent();
	
	
	WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
	driver.switchTo().frame(frame3);
	
	WebElement text3=driver.findElement(By.xpath("/html/body/form/div/input"));
	text3.sendKeys("git");
	
	//innerframe 
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("/html/body/div/div[1]/form/div[2]/div[1]/div[2]/div[1]/div/div/div[2]/div[1]/div/span/div/div[1]")).click();
	
	
	
}
}
