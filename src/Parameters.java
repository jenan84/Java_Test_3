import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

public class Parameters {

	WebDriver driver = new ChromeDriver();
	SoftAssert my_assertion = new SoftAssert();
	String URL = "https://global.almosafer.com";
	boolean is_popup_there = false;

	@BeforeTest
	public void my_setup() {
		//driver.get(URL);
		driver.manage().window().maximize();
		
	}

	@AfterTest
	public void end_test() {
		//driver.close();
	}

}
