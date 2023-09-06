package SeleniumYoutube;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigate {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\home\\Desktop\\LibFolder\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.google.com/");
        
       // driver.navigate().to("https://www.facebook.com/");
   
        driver.findElement(By.linkText("Images")).click(); //this will throw exception becoz its google page attribute//
        Thread.sleep(2000);
        
        driver.navigate().back();
        Thread.sleep(1000);
        System.out.println("backward done");
        
        driver.navigate().forward();
        Thread.sleep(1000);
        System.out.println("forward done");
        
        driver.navigate().refresh();
        System.out.println("refresh done");
        
     
        
	
  }
 }
