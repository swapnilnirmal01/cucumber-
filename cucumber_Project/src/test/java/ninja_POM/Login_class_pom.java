package ninja_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_class_pom {

	WebDriver d;

	By link_My_account_ninja = By.linkText("My Account");
	By login_btn_ninja = By.linkText("Login");
	By txt_username_ninja = By.xpath("//input[@id='input-email']");
	By txt_password_ninja = By.xpath("//input[@id='input-password']");
	By txt_login_ninja = By.xpath("//input[@class='btn btn-primary']");
	By btn_logout_ninja = By.linkText("Logout");
	
	public Login_class_pom(WebDriver d) {
		
		this.d=d;
	}


	public void my_Account() {
		d.findElement(link_My_account_ninja).click();

	}

	public void login_btn() {
		d.findElement(login_btn_ninja).click();

	}

	public void enterUserName(String username) {
		d.findElement(txt_username_ninja).sendKeys(username);
	}

	public void enterpassword(String password) {

		d.findElement(txt_password_ninja).sendKeys(password);

	}

	public void clcik_login() {
		d.findElement(txt_login_ninja).click();
	}
	
	public void logout_btn_ninja() {
		d.findElement(btn_logout_ninja).click();
	}
	
	public void valid_loginDetails(String username ,String password) {
		
		d.findElement(link_My_account_ninja).click();
		d.findElement(login_btn_ninja).click();
		d.findElement(txt_username_ninja).sendKeys(username);
		d.findElement(txt_password_ninja).sendKeys(password);
		d.findElement(txt_login_ninja).click();
		d.findElement(btn_logout_ninja).click();
		
	}

}
