package Gudiprojects;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class MOzilaFIreFox 
 {
		
	    public static void main(String[] args)
		{
			     System.setProperty("webdriver.gecko.driver","C:\\Users\\home\\Desktop\\geckodriver.exe");
			     WebDriver dr =new FirefoxDriver();
			     dr.manage().window().maximize();
			     
		}

	}

