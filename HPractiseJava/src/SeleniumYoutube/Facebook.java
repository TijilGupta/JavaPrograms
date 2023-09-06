package SeleniumYoutube;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\home\\Desktop\\LibFolder\\geckodriver.exe");
        WebDriver driver =new FirefoxDriver();
        driver.get("https://www.facebook.com/");
        
        //WebElement unm=driver.findElement(By.id("email"));
        //unm.sendKeys("mansi.gupta981993@gmail.com");
        //driver.findElement(By.name("pass")).sendKeys("awesometej@");
	  // driver.findElement(By.name("login")).click();
	//driver.findElement(By.partialLinkText("Forgotten ")).click();

	
	   String title=driver.getTitle();
	   System.out.println("title is :"+title);
	   
	   System.out.println(driver.getCurrentUrl());
	   
	  WebElement unm =driver.findElement(By.id("email"));
	 
	  System.out.println(unm.getAttribute("id"));
	  System.out.println(unm.getTagName());
	
	   
	}
	}
             