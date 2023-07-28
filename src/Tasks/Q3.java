package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Q3 {

	    public static void main(String[] args) {
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Driver\\chromedriver.exe");

	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--start-maximized");

	        WebDriver driver = new ChromeDriver(options);

	        driver.get("https://www.wikipedia.org/");

	        WebElement searchBox = driver.findElement(By.name("search"));
	        searchBox.sendKeys("Artificial Intelligence");
	        searchBox.submit();

	        WebElement historySection = driver.findElement(By.linkText("History"));
	        historySection.click();

	        System.out.println("Title of the 'History' section: " + driver.getTitle());

	        driver.quit();
	    }
	

}
