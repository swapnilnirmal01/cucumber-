package learningSports_regularExpression;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Learning_step {
	
	@Given("^I am intersted in practising ([a-zA-Z]{1,})$")
	public void i_am_intersted_in_practising_cricket(String sports) {
		System.out.println("I am intersted in practising :" +sports);
	}

	@Given("^I went to online to find or searching cricket ([a-zA-Z]){1,}$")
	public void i_went_to_online_to_find_or_searching_cricket_club(String club) {
		System.out.println("I went to online to find or searching cricket :"+ club);
	}

	@Given("^I went to see nearest cricket club on (.*)$")
	public void i_went_to_see_nearest_cricket_club_on_21th_feb(String visitdate) {
		System.out.println("I went to see nearest cricket club on :"+ visitdate);
		
	}

	@Given("^I take membership (.*) to (.*)$")
	public void i_take_membership_mar_to_mar(String joindate, String endDate) {
		System.out.println("I take membership from" + joindate + "to" + endDate);
	}

	@When("^my (.*) got to hear about this$")
	public void my_friend_got_to_hear_about_this(String jagarii) {
		System.out.println("my"+ jagarii +"got to hear about this");
	}

	@Then("^(\\d+) of them join this club$")
	public void of_them_join_this_club(int no_people) {
		System.out.println(no_people+ "of them join this club");
	}

	@Then("^I can not join because of some my (.*)$")
	public void i_can_not_join_because_of_some_my_personal_issue(String problem ) {
		System.out.println("I can not join because of some my"+ problem);
	}


}
