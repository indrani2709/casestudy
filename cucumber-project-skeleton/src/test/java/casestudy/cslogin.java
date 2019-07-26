package casestudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class cslogin {
	WebDriver driver;
	@Given("Launch the app")
	public void launch_the_app() {
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp");	
	}

	@When("User clicks on SignUp link")
	public void user_clicks_on_SignUp_link() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//a[contains(text(),'SignUp')]")).click();
	}

	@Then("User enters username {string}")
	public void user_enters_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(string);
		
		
	//WebElement sec=driver.findElement(By.xpath("//select[@name='securityQuestion']"));
	}

	@Then("user enters Firstname {string}")
	public void user_enters_Firstname(String string) {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(string);
	}

	@Then("user enters lastname {string}")
	public void user_enters_lastname(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(string);
	}

	@Then("enters password {string}")
	public void enters_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(string);
	}

	@Then("enters Confirmpassword {string}")
	public void enters_Confirmpassword(String string) {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys(string);
	}

	@Then("enters gender")
	public void enters_gender() {
	    // Write code here that turns the phrase above into concrete actions
	 //   throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//span[text()='Male']")).click();
	}

	@Then("enters E-Mail {string}")
	public void enters_E_Mail(String string) {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys(string);
	}

	@Then("enters Mobile Number {string}")
	public void enters_Mobile_Number(String string) {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys(string);
	}

	@Then("enters DOB {string}")
	public void enters_DOB(String string) {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@name='dob']")).sendKeys(string);
	}

	@Then("enters Address {string}")
	public void enters_Address(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys(string);
	}

	@Then("enters Answer {string}")
	public void enters_Answer(String string) {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@id='answer']")).sendKeys(string);
		
	}

	@Then("click on register")
	public void click_on_register() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
	}


}
