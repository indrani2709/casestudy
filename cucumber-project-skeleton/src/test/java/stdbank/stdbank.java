package stdbank;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stdbank {

		// TODO Auto-generated method stub
		@Given("Indu is done with browser configuration")
		public void indu_is_done_with_browser_configuration() {
		    // Write code here that turns the phrase above into concrete actions
		    //throw new cucumber.api.PendingException();
			System.out.println("code for browser config");
		}

		@Then("she launches the application in chrome browser")
		public void she_launches_the_application_in_chrome_browser() {
		    // Write code here that turns the phrase above into concrete actions
		    //throw new cucumber.api.PendingException();
			System.out.println("code for launching application");
		}

		@Given("user clicks on sign in link")
		public void user_clicks_on_sign_in_link() {
		    // Write code here that turns the phrase above into concrete actions
		    //throw new cucumber.api.PendingException();
			System.out.println("code for clicking sign in");
		}

		@Then("user enters valid cred")
		public void user_enters_valid_cred() {
		    // Write code here that turns the phrase above into concrete actions
		    //throw new cucumber.api.PendingException();
			System.out.println("code for entering valid cred");
		}

		@Then("user clicks on submit button")
		public void user_clicks_on_submit_button() {
		    // Write code here that turns the phrase above into concrete actions
		    //throw new cucumber.api.PendingException();
		}

		@Given("Guest user clicks on sign in link")
		public void guest_user_clicks_on_sign_in_link() {
		    // Write code here that turns the phrase above into concrete actions
		    //throw new cucumber.api.PendingException();
			System.out.println("code for sign in");
		}

		@When("user provides all the mandatory data")
		public void user_provides_all_the_mandatory_data() {
		    // Write code here that turns the phrase above into concrete actions
		    //throw new cucumber.api.PendingException();
			System.out.println("code for provinding mandatory data");
		}

		@Then("user clicks on submit button and id is generated")
		public void user_clicks_on_submit_button_and_id_is_generated() {
		    // Write code here that turns the phrase above into concrete actions
		    //throw new cucumber.api.PendingException();
			System.out.println("code for id generation");
		}

		@Given("user clicks on forgot password link")
		public void user_clicks_on_forgot_password_link() {
		    // Write code here that turns the phrase above into concrete actions
		    //throw new cucumber.api.PendingException();
			System.out.println("code for password change");
		}

		@Then("user enters the mobile number")
		public void user_enters_the_mobile_number() {
		    // Write code here that turns the phrase above into concrete actions
		    //throw new cucumber.api.PendingException();
			System.out.println("code for entering mob num");
		}

		@Then("user receives otp and provides the same")
		public void user_receives_otp_and_provides_the_same() {
		    // Write code here that turns the phrase above into concrete actions
		    //throw new cucumber.api.PendingException();
			System.out.println("code for receiving otp");
		}

	}

