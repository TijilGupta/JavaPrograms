package SeleniumYoutube;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SBLProject {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\home\\Desktop\\LibFolder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.sblelectronics.com/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//String baseUrl="https://www.sblelectronics.com/";
		//driver.get(baseUrl);
		driver.findElement(By.xpath("//span[@class='link-name']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//li[@class='menu-large hovernav']")).click();
		driver.findElement(By.xpath("/html/body/div[5]/header/div[1]/div/div[2]/div/ul/li[1]/a")).click();
		
		}

}