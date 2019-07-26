package casestudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class log {
	WebDriver driver;
	@Given("launch the application")
	public void launch_the_application() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp");
	}

	@When("user clicks on signin")
	public void user_clicks_on_signin() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//a[contains(text(),'SignIn')]")).click();
	}

	@Then("user enters the username {string}")
	public void user_enters_the_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.name("userName")).sendKeys(string);
	}

	@Then("user enters the password {string}")
	public void user_enters_the_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.name("password")).sendKeys(string);
	}

	@Then("user clicks on login button")
	public void user_clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.name("Login")).click();
	}
}
