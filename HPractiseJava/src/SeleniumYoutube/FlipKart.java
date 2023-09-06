package SeleniumYoutube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\home\\Desktop\\LibFolder\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		dr.findElement(By.xpath("//div[@class='IiD88i _351hSN']/input[@type='text']")).sendKeys("guptatijil110@gmail.com");;
		Thread.sleep(5000);
		dr.findElement(By.xpath("//div[@class='IiD88i _351hSN']/input[@type='password']")).sendKeys("Shashigupta@09");
        Thread.sleep(2000);
        dr.findElement(By.xpath("//div[@class='_1D1L_j']/button[@type='submit']")).click();
	}

}
