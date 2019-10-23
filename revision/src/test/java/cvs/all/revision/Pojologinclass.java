package cvs.all.revision;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojologinclass extends Baseclass{
	
	public Pojologinclass() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement UserName;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="login")
	private WebElement Click;
	
	@FindBy(xpath="//a[contains(text(),'New User Register Here')]")
	private WebElement Click2;

	public WebElement getUserName() {
		return UserName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getClick() {
		return Click;
	}
	public WebElement getClick2() {
		return Click2;
	}
	
	
	
	
	

}
