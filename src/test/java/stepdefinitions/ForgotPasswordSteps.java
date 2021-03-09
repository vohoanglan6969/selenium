package stepdefinitions;

import org.junit.Assert;

import com.factory.DriverFactory;
import com.pages.ForgotPwdPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class ForgotPasswordSteps {
	public ForgotPwdPage forgotPage = new ForgotPwdPage(DriverFactory.getDriver());
	
	@When("I am on page:{string}")
	public void i_am_on_page(String url)
	{
		DriverFactory.getDriver().get(url);
	}
	

	@When("I input email to reset:{string}")
	public void i_input_email(String emai) {
		forgotPage.enterEmail(emai);
	   	}

	@When("I press forgot password button")
	public void i_press_forgot_password_button() throws InterruptedException {
		forgotPage.clickForgotBtn();
		Thread.sleep(10);
	}
	
	@Then("I should see error message display:{string}")
	public void i_should_see_error_message_display(String expected)
	{
		String actual = forgotPage.getErrorMessage();
		Assert.assertEquals(expected, actual);
	}

}
