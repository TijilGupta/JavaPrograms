package SeleniumYoutube;

	import java.util.List;
	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class  DropDown{
		public static void main(String[]args) throws InterruptedException{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\home\\Desktop\\LibFolder\\chromedriver.exe");
	        WebDriver driver =new ChromeDriver();
			
			driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			String baseUrl="https://chandanachaitanya.github.io/selenium-practice-site/";
					driver.get(baseUrl);
					
					Select sel = new Select(driver.findElement(By.name("languages")));
					sel.selectByVisibleText("Java");
					sel.selectByVisibleText("C++");

		 }

	}

