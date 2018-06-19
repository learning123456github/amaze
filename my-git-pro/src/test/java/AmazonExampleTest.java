

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AmazonExampleTest {

	WebDriver driver;
	String url;

	@BeforeClass
	public void setUp() {
		System.setProperty("WebDriver.gecko.driver", "C:\\Users\\srilatha\\Desktop\\geckodriver.exe");
		driver = new FirefoxDriver();
	}

	@Test
	public void test1() {
		url = "http://www.amazon.com";
		driver.get(url);
		System.out.println("welcome");
		System.out.println("hello");
		Actions actions = new Actions(driver);

		System.out.println("HubGit83 says hello");

		System.out.println("hello2");

	}
}
