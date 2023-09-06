package SeleniumYoutube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\home\\Desktop\\LibFolder\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.instagram.com/accounts/login/");
        Thread.sleep(2000);
        WebElement unm=driver.findElement(By.name("username"));
        unm.sendKeys("vineetarathore21");
        driver.findElement(By.name("password")).sendKeys("awesometej@");
        driver.findElement(By.id("login")).click();
	}

}
