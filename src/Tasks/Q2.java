package Tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2 {

	    public static void main(String[] args) {
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Driver\\chromedriver.exe");

	        WebDriver driver = new ChromeDriver();

	        driver.manage().window().maximize();

	        driver.get("https://www.demoblaze.com/");

	        String expectedTitle = "STORE";
	        String actualTitle = driver.getTitle();

	        if (actualTitle.equalsIgnoreCase(expectedTitle)) {
	            System.out.println("Page landed on correct website");
	        } else {
	            System.out.println("Page not landed on correct website");
	        }

	        driver.quit();
	    }
	

}
