package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	
	@Given("{string} navigates to homepage")
	public void navigates_to_homepage(String string) {
		System.out.println(string + " navigates to homapage");

	}

	@When("User enters username as {string}")
	public void user_enters_username_as(String string) {

		System.out.println(string + " enters username");

	}

	@When("User enters password as {string}")
	public void user_enters_password_as(String string) {
		System.out.println(string + " enters password");
	}

	@When("clicks login button")
	public void clicks_login_button() {

	}

	@Then("User is able to login to the MyProfile page")
	public void user_is_able_to_login_to_the_my_profile_page() {

	}

	@Then("User clicks on logout")
	public void user_clicks_on_logout() {

	}

	@When("UserABCD types username as {string}")
	public void user_abcd_types_username_as(String string) {
		System.out.println("Userabcd enters username as " + string);
	}

	@When("UserABCD types password as {string}")
	public void user_abcd_types_password_as(String string) {
		System.out.println("userAB enters password as " + string);

	}

	@When("clicks login buttons")
	public void clicks_login_buttons() {

	}

	@Then("User is not able to login to the MyProfile page")
	public void user_is_not_able_to_login_to_the_my_profile_page() {

		System.out.println("fail");

	}
	
	

}
