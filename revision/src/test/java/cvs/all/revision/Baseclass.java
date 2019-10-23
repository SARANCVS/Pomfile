package cvs.all.revision;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
		public static WebDriver driver;

		public static WebDriver getdriver() {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Hemanathan\\Desktop\\saran\\SeleniumTest\\driver\\chromedriver.exe");
			driver = new ChromeDriver();

			return driver;

		}

		public static void loadUrl(String url) {

			driver.get(url);
		}
		
		public static void EnterText(WebElement e,String value) {
			
			e.sendKeys(value);
			

		}
		public static void clickbtn(WebElement e) {
			e.click();
		}
		
		public void Screenshot() throws IOException {
			TakesScreenshot scn=((TakesScreenshot) driver);
			
			File soc = scn.getScreenshotAs(OutputType.FILE);
			
			File dse=new File("C:\\Users\\Hemanathan\\Desktop\\maven\\sv.png");
			
			FileUtils.copyFile(soc, dse);
		}
	
	

}
