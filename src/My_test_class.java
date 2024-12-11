import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

public class My_test_class extends Parameters {

//	@Test(invocationCount = 6, priority = 1)
//	public void check_website_language() {
//		String my_website_languages[] = { "https://global.almosafer.com/en", "https://global.almosafer.com/ar" };
//
//		Random random = new Random();
//
//		int random_index = random.nextInt(0, 100) % 2;
//
//		driver.get(my_website_languages[random_index]);
//
//		String actual_text = driver.findElement(By.xpath("//*[@id=\"__next\"]/section[2]/div[2]/div/div/div/h1"))
//				.getText();
//
//		if (random_index == 1) {
//			my_assertion.assertEquals(actual_text, "معك لحجز إقامتك الفندقية");
//
//		} else {
//			my_assertion.assertEquals(actual_text, "Let’s book your next trip!");
//		}
//		my_assertion.assertAll();
//	}

//	@Test()
//	public void check_default_currency() {
//		
//		String expected_default_currency = "SAR";
//		WebElement currency_in_website = driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[1]/div[2]/div/div[1]/div/button"));
//		
//		String actual_currency = currency_in_website.getText();
//		my_assertion.assertEquals(expected_default_currency, actual_currency);
//
//	}

	// https://almosafer-corporate-website-assets-prod.almosafer.com/WTA_ALM_CT_EN_2024_4870ebe0cb.svg

//	@Test()
//	public void check_visa_logo() {
//		WebElement div_contain_visa_logo = driver.findElement(By.xpath("//*[@id=\"__next\"]/footer/div[3]/div[3]/div[1]/div[2]/div/div"));
//		List<WebElement> my_div =  div_contain_visa_logo.findElements(By.tagName("svg"));
//		
//			}

//	@Test()
//	public void bring_all_img_src() {
//		List<WebElement> all_src = driver.findElements(By.tagName("img"));
//		for(int i = 0; i< all_src.size();i++) {
//			System.out.println(all_src.get(i).getDomProperty("src"));
//		}
//		
//	}

//	@Test()
//	public void send_data_to_labels() {
//		List<WebElement> labels = driver.findElements(By.tagName("input"));
//		
//		for(int i=0; i<labels.size();i++) {
//			labels.get(i).getDomProperty("value").
//		}
//	}

//	@Test()
//	public void check_stay_tab_not_selected() {
//		WebElement Stay_tab = driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tab-hotels\"]"));
//		String expexted_result = "false";
//		String actual_result = Stay_tab.getDomAttribute("aria-selected");
//		my_assertion.assertEquals(actual_result, expexted_result);
//		my_assertion.assertAll();
//	
//		
//	}

	@Test(invocationCount = 3)
	public void location_field() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		String my_website_languages[] = { "https://global.almosafer.com/en", "https://global.almosafer.com/ar" };
		String EN_location[] = { "Dubai", "Jeddah", "Riyadh" };
		String AR_location[] = { "دبي", "جدة" };

		Random random = new Random();

		int random_index_website = random.nextInt(2);
		driver.get(my_website_languages[random_index_website]);

		if (!is_popup_there) {
			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/button[1]")).click();

			is_popup_there = true;
		}
		if (random_index_website == 1) {
			int random_index_location = random.nextInt(2);
			driver.findElement(By.xpath(
					"//*[@id=\"uncontrolled-tab-example-tabpane-flights\"]/div/div[2]/div[1]/div/div[2]/div[1]/div/div/div/input"))
					.sendKeys(AR_location[random_index_location]);
			driver.findElement(By.cssSelector("input[placeholder='محطة الوصول']")).sendKeys("عمان, الأردن");

			driver.findElement(By.xpath("//div[@class='sc-hARARD jGOsnk d-none d-md-block']//button[@type='button']"))
					.click();
		} else {

			int random_index_location = random.nextInt(3);

			driver.findElement(By.xpath(
					"//*[@id=\"uncontrolled-tab-example-tabpane-flights\"]/div/div[2]/div[1]/div/div[2]/div[1]/div/div/div/input"))
					.sendKeys(EN_location[random_index_location]);

			driver.findElement(By.cssSelector("input[placeholder='Destination']")).sendKeys("Amman, Jordan");

			driver.findElement(By.xpath("//div[@class='sc-hARARD jGOsnk d-none d-md-block']//button[@type='button']"))
					.click();

		}

	}
}
