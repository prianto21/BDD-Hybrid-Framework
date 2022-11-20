package stepdefinitions;


import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	private String title;
	private LoginPage loginPage=new LoginPage(DriverFactory.getDriver());
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		
		DriverFactory.getDriver().get("https://www.saucedemo.com/");
	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
		title=loginPage.getLoginPageTitle();
		System.out.println("page title is : "+title);
	}

	@Then("title should be {string}")
	public void title_should_be(String expectedTitleName) {
		
		org.junit.Assert.assertTrue(title.contains(expectedTitleName));
	
	}

	@Then("button login should be displayed")
	public void button_login_should_be_displayed() {
		org.junit.Assert.assertTrue(loginPage.verifyBtnLogin());
	}

	@When("user enters username {string}")
	public void user_enters_username(String username) {
		loginPage.enterUsername(username);
	}

	@When("user enters password {string}")
	public void user_enters_password(String password) {
		loginPage.enterPassword(password);
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
		loginPage.klikLogin();
	}


	@Then("page title should be {string}")
	public void page_title_should_be(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
