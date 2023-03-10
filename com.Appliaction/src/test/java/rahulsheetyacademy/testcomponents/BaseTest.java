package rahulsheetyacademy.testcomponents;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

import com.Flipkart.LoginPage;
import com.PageObjects.LandingPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public WebDriver driver;
	public LandingPage landingpage;
	public WebDriver initializerDriver() throws Exception {
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\data.Properties");
		p.load(fis);
		String browserName = p.getProperty("browser");

		if (browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();

		} else if (browserName.equals("firefox")) {

			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\admin\\Downloads\\geckodriver-v0.31.0-win32\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browserName.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\admin\\Downloads\\edge-v0.31.0-win32\\edge.exe");

		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		return driver;

	}

	@BeforeMethod(alwaysRun=true)
	public LandingPage launchApplication() throws Exception {

		driver = initializerDriver();
		 landingpage = new LandingPage(driver);
		landingpage.goTo();
		return landingpage;
	}
}
