package baseUtil;                      

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pages.HomePagge;

public class BaseClass {
	WebDriver driver;
	public HomePagge homePagge;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mahmu\\eclipse-workspace\\com.macys\\driver\\chromedriver.exe");

		driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		
		driver.get("https://www.macys.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().fullscreen();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		homePagge = new HomePagge(driver);

	}

	@AfterMethod
	public void tearUp() {
		driver.quit();

	}

}


