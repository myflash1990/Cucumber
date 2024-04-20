package StepDefinition;

import java.util.List;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataSet {


	@Given("User logged in to the application")
	public void user_logged_in_to_the_application() {
	
	}
	@When("User enters lots of value to calculator")
	public void user_enters_lots_of_value_to_calculator(DataTable Datatable) {
	 List<List<String>>userList= Datatable.asLists(String.class);
	 for(List<String>e:userList) {
		 System.out.println(e);
	 }
	 
		}
	
	@Then("User see results for each sets of data")
	public void user_see_results_for_each_sets_of_data() {

	}



}
