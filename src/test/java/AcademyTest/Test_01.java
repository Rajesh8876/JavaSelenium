package AcademyTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import LoginTestClass.HomePage;
import LoginTestClass.LoginPage;
import TestBaseClass.BaseClass;

public class Test_01 extends BaseClass{
	 LoginPage loginpage;
	
	
	public Test_01(){
		
		super();
	}
	@Test
public void setup() {
	
		initiate();
	 loginpage=new LoginPage();
	 loginpage.login(pro.getProperty("user"));
	} 
	@Test
	 public void pagetitle() {
		String title=loginpage.validatetitle();
		System.out.println(title);
		 
	 }

	
}
