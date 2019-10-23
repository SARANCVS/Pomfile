package cvs.all.revision;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Run extends Baseclass {
	
	
	@BeforeClass
	public void start() {
		getdriver();
		loadUrl("https://adactin.com/HotelApp/index.php");
	}
	
	@BeforeMethod
	public void TimeStart() {
		Date d=new Date();
		System.out.println(d);

	}
	
	
	@AfterMethod
	public void Timeend() {
		Date d=new Date();
		System.out.println(d);

	}
	
	
	
	@Test(priority = 1)

	public static void Basic() throws IOException {

		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		String title = driver.getTitle();

		System.out.println(title);

		TakesScreenshot scn = ((TakesScreenshot) driver);

		File soc = scn.getScreenshotAs(OutputType.FILE);

		File dse = new File("C:\\Users\\Hemanathan\\Desktop\\maven\\sn.png");

		FileUtils.copyFile(soc, dse);
		System.out.println("success");

	}

	@Test(priority = 2)

	public void login() {
		
		

		Pojologinclass L = new Pojologinclass();

		EnterText(L.getUserName(), "saran");

		EnterText(L.getPassword(), "13412");

		clickbtn(L.getClick());
		
		
		
	}
	

	  //Registration

	
	  @Test(priority = 3)
	  
	  
	  
	  public void Registration() {
		  
		  driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		  
		  Pojologinclass L = new Pojologinclass();
	  
	  RegistrationForm r= new RegistrationForm();
	  
	  clickbtn(L.getClick2());
	  
	 EnterText(r.getUserName1(), "raja");
	 
	 
	 
	 EnterText(r.getPassword1(), "12345");
	 
	 EnterText(r.getConformpassword(), "12345");
	 
	 EnterText(r.getName(),"raj");
	 
	 
	 EnterText(r.getEmail(), "raja@gmail.com");
	 
	 EnterText(r.getCaptcha(), "reside");
	 
	 clickbtn(r.getCkbox());
	 clickbtn(r.getRegister());
	 

}
}
