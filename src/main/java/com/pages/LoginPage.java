package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	private WebDriver driver;

//	1. By Locators
	private By username=By.name("username");
	private By password=By.name("password");
	private By login=By.className("btn btn-success btn-block btn-lg");
//	2.Consctructor of the page class;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
//	3.page actions: features (behavior) of the page the form of methods:
	
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	
	public void enterUsername(String user) {
		driver.findElement(username).sendKeys(user);
	}
	
	public void enterPassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	public void klikLogin() {
		driver.findElement(login).click();
	}
	
}
