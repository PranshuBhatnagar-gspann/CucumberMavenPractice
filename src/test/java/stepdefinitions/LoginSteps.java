package stepdefinitions;

import factory.DriverFactory;
import factory.PageFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginSteps {
	
	@Given("user is on the shopping site")
	public void navigateToShoppingSite() {
		DriverFactory.getDriver().get("https://sauce-demo.myshopify.com/account/login");
	}
	
	@When("users enters username")
	public void enterUsername() {
		PageFactory.getLoginPage().enterUsername("pranshubhatnagar@gspann.com");
	}
	
	@And("user enters the password")
	public void enterPassword() {
		PageFactory.getLoginPage().enterPassword("12345678");
	}
	
	@And("clicks on the Sign in button")
	public void clickOnSignInBtn() {
		PageFactory.getLoginPage().clickOnSignInBtn();
	}
	
	@Then("user should be redirected to accounts page")
	public void verifyAccountsPage() {
		System.out.println("Accounts Page");
	}

}
