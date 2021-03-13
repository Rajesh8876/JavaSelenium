package TestBaseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;




public class BaseClass {

	public static WebDriver driver;
	public static Properties pro;

	public BaseClass() {

		try {
			pro = new Properties();
			FileInputStream file = new FileInputStream(
					"C:\\Users\\4983r\\eclipse-workspace\\AcademyPractice\\src\\main\\java\\Utilities\\data.properties");
			pro.load(file);

		} catch (Exception e) {
			System.out.println(e);

		}
	}

	public static void initiate() {
		String browserName = pro.getProperty("browser");
		if (browserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			String baseUrl = pro.getProperty("url");
			driver.get(baseUrl);

		}
		if (browserName.equals("Firefox")) {
			System.setProperty("webdriver.chrome.driver", "src/test/resources/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		}
	}
	public void getscreenshot(String testname) throws IOException {
		TakesScreenshot shot=(TakesScreenshot) driver;
		File file=shot.getScreenshotAs(OutputType.FILE);
		String name=System.getProperty("user.dir")+"//reports//"+testname+".png";
		FileUtils.copyFile(file, new File(name)); 
	}

}