package testme;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class testme {
	WebDriver driver;
	@Given("I am launching testme application in chrome")
	public void i_am_launching_testme_application_in_chrome() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("code for launching");
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp");
	}

	@Given("I click on sign in link")
	public void i_click_on_sign_in_link() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("code for sign in");
		driver.findElement(By.xpath("//a[contains(text(),'SignIn')]")).click();		
	}

	@When("I provide username {string}")
	public void i_provide_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("code for username "+string);
		driver.findElement(By.name("userName")).sendKeys(string);
	}

	@When("I provide password {string}")
	public void i_provide_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("code for password "+string);
		driver.findElement(By.name("password")).sendKeys(string);
	}

	@Then("I click on login and verify login status")
	public void i_click_on_login_and_verify_login_status() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("code for login");
		driver.findElement(By.name("Login")).click();
		String e_title = "Home";
		String a_title = driver.getTitle();
		Assert.assertEquals(e_title,a_title);
		driver.close();
	}

}
