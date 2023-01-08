package baseUtil; 
import utils.Configuration;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pages.HomePagge;
import static utils.Iconstant.*;

public class BaseClass {
	public WebDriver driver;
	public HomePagge homePagge;
	Configuration config;

	@BeforeMethod
	public void setUp() {
		/*System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mahmu\\eclipse-workspace\\com.macys\\driver\\chromedriver.exe");
*/
	//	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/driver/chromedriver.exe");;
		 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		driver = new ChromeDriver();
		config = new Configuration();

		// System.setProperty("webdriver.chrome.driver","./driver/geckodriver.exe");
		// driver = new FirefoxDriver();

		 
		// System.setProperty("webdriver.edge.driver","./driver/msedgedriver.exe");
		// driver = new EdgeDriver();

		 
		 

		//driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().fullscreen();
		driver.get(config.getProperty((URL)));
		
		//driver.get("https://www.macys.com/");
		long pageLoad= Long.parseLong(config.getProperty((PAGELOAD_WAIT)));
		long implicitly= Long.parseLong(config.getProperty((IMPLICITLY_WAIT)));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(pageLoad));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitly));

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		homePagge = new HomePagge(driver);

	}

	@AfterMethod
	public void tearUp() {
		driver.quit();

	}

}


