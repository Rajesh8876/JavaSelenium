package LoginTestClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBaseClass.BaseClass;

public class HomePage extends BaseClass {
	
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(id = "pwd")
	WebElement PW;
	
	@FindBy(id = "btnLogin")
	WebElement action;
	
	
	
	
	public void displaypage(String pass) {
		PW.sendKeys(pass);
		action.click();
	}
}
