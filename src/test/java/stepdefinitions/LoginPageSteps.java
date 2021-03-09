package stepdefinitions;

import org.junit.Assert;

import com.factory.DriverFactory;
import com.pages.ForgotPwdPage;
import com.pages.HomePage;
import com.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {
	public LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	public HomePage homePage = new HomePage(DriverFactory.getDriver());
	public ForgotPwdPage forgotPage = new ForgotPwdPage(DriverFactory.getDriver());

	@Given("I am on login page")
	public void i_am_on_login_page() {
		DriverFactory.getDriver().get("http://qldt.vnec02:8890/login");
	    
	}

	@When("I input email {string}")
	public void i_input_email(String email) {
	   loginPage.enterUsername(email);
	}

	@When("I input password {string}")
	public void i_input_password(String password) {
		loginPage.enterPassword(password);
	   
	}

	@When("I click on Login button")
	public void i_click_on_login_button() {
	   loginPage.clickLoginBtn();
	}

	@Then("I should see error message {string}")
	public void i_should_see_error_message(String expected) {
		String actual = loginPage.getErrorMessage();
		Assert.assertEquals(expected,actual);
	   
	}

	@When("I click on Forgot password link")
	public void i_click_on_forgot_password_link() {
	    loginPage.clickForgotLink();
	}

	@Then("I should see current title {string}")
	public void i_should_see_current_url(String expected) {
	   String actual = forgotPage.getPageTitle();
	   Assert.assertEquals(expected,actual);
	}

	@Then("I should see dashboard title {string}")
	public void i_should_see_dashboard_title(String expected) {
	   String actual = homePage.getTitle();
	   Assert.assertEquals(expected, actual);
	}
}
