package Tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Q1 {


	    public static void main(String[] args) {
	    	
	        System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\geckodriver.exe");

	        WebDriver driver = new FirefoxDriver();

	        driver.manage().window().maximize();

	        driver.get("http://google.com");

	        String currentURL = driver.getCurrentUrl();
	        System.out.println("Current URL: " + currentURL);

	        driver.navigate().refresh();

	        driver.quit();
	    }
	}
