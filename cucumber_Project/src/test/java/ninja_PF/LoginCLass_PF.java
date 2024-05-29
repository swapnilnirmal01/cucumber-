package ninja_PF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginCLass_PF {
	
	WebDriver d;
	
	@FindBy(linkText="My Account")
	WebElement link_My_account_ninja;
	
	@FindBy(linkText="Login")
	WebElement login_btn_ninja ;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txt_username_ninja;
	
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txt_password_ninja ;
	
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	WebElement txt_login_ninja;
	
	
	@FindBy(linkText="Logout")
	WebElement btn_logout_ninja ;
	
	
	public LoginCLass_PF(WebDriver d) {
		this.d=d;
		PageFactory.initElements(d,LoginCLass_PF.class);
	}
	
	public void myaccount() {
		
		link_My_account_ninja.click();
		System.out.println("click on my account button");
	}
	
	public void loginlink() {
		login_btn_ninja.click();
		System.out.println("-----clcik on login page ");
	}
	
	public void username(String username) {
		txt_username_ninja.sendKeys(username);
		System.out.println("----enter username");
	}
	
	public void password(String password) {
		txt_password_ninja.sendKeys(password);
		System.out.println("-----enter password");
	}
	
	public void clicklogin() {
		txt_login_ninja.click();
		System.out.println("---clcik on login page");
	}
	public void logout() {
		btn_logout_ninja.click();
		System.out.println("----click on logout button");
	}

}
