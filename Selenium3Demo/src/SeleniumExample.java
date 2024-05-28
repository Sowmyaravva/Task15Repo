//Import the necessary libraries for Selenium WebDriver at the beginning of your script
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//Create a new Java class for WebDriver script.

public class SeleniumExample {

	public static void main(String[] args) {
		//Set the path to the WebDriver executable (e.g., chromedriver.exe for Chrome) using System.setProperty
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		//Create an instance of the WebDriver interface for the desired browser(ex:chrome,firefox...)
		WebDriver driver= new ChromeDriver();
		//Use the driver object to navigate to a website.
		driver.get("https://www.selenium.dev/");
		//driver. manage() is a method that returns instance of options interface, now the options interface has method window() that returns instance of window interface, this window interface has method maximize() which maximizes the window
		driver.manage().window().maximize();
		//for Closing the Current Window
		driver.close();
	}

}
