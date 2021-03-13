package LoginTestClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBaseClass.BaseClass;


public class LoginPage extends BaseClass{
	
	public LoginPage() {

		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//*[@id='main_div']/header/div[3]/div/div[1]/div[5]/div[1]/div/div/ul/li[4]/div/a")
	WebElement signin;

	@FindBy(id = "emailPopup")
	WebElement mail;

	

	@FindBy(id = "btnLogin")
	WebElement action;
	
	@FindBy(id = "pwd")
	WebElement PW;
//initializing the Page Objects
	
	//initializing Actions//
	public String validatetitle()
	{
		return driver.getTitle();
	
	}

	

	public HomePage login(String us) {
		signin.click();
		mail.sendKeys(us);
		action.click();
		return new HomePage();
		
	}
	

}
