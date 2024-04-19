package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


	public class Steps {
		
		@Given("^a precondition is valid$")
		public void a_precondition_is_valid() {
		    System.out.println("User1 logs in");
		}

		@When("^an action is performed$")
		public void an_action_is_performed(){
			  System.out.println("User1 clicks button");
		}

		@Then("^something should be asserted$")
		public void something_should_be_asserted()  {
			 System.out.println("User1 is re-direced to main page");
		}



	}

