package cvs.all.revision;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationForm extends Baseclass{
	
	public RegistrationForm() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@class='reg_input']")
	private WebElement UserName1;
	
	@FindBy(id="password")
	private WebElement password1;
	
	@FindBy(id="re_password")
	private WebElement Conformpassword;
	
	@FindBy(id="full_name")
	private WebElement Name;
	
	@FindBy(id="email_add")
	private WebElement Email;
	
	@FindBy(id="captcha-form")
	private WebElement Captcha;
	
	@FindBy(id="tnc_box")
	private WebElement Ckbox;
	
	@FindBy(id="Submit")
	private WebElement Register;

	public WebElement getUserName1() {
		return UserName1;
	}

	public WebElement getPassword1() {
		return password1;
	}

	public WebElement getConformpassword() {
		return Conformpassword;
	}

	public WebElement getName() {
		return Name;
	}

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getCaptcha() {
		return Captcha;
	}

	public WebElement getCkbox() {
		return Ckbox;
	}

	public WebElement getRegister() {
		return Register;
	}
	
	
	

	
	

}
