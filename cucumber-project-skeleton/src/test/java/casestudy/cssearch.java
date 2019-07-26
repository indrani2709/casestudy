package casestudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class cssearch {
	WebDriver driver;
	@Given("user launches the application")
	public void user_launches_the_application() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	    System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp");
	}

	@Then("user clicks on SignIn link")
	public void user_clicks_on_SignIn_link() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//a[contains(text(),'SignIn')]")).click();
	}

	@Then("user enters username {string}")
	public void user_enters_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.name("userName")).sendKeys(string);
	}

	@Then("user enetrs password {string}")
	public void user_enetrs_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.name("password")).sendKeys(string);
	}

	@Then("Click on login button")
	public void click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.name("Login")).click();
	}

	@Then("user searches for the item from search bar {string}")
	public void user_searches_for_the_item_from_search_bar(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@name='products']")).sendKeys(string);
		driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();  
	    driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
	    driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/a[2]")).click();
		  driver.findElement(By.xpath("//*[@id=\"cart\"]/tfoot/tr[2]/td[5]/a")).click();
		  driver.findElement(By.xpath("/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input")).click();
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//*[@id='swit']/div[1]/div/label")).click();
		  driver.findElement(By.xpath("//*[@id='btn']")).click();
		  driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input[1]")).sendKeys("123456");
		  driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input[2]")).sendKeys("Pass@456");
		  driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		  driver.findElement(By.xpath("//input[@name='transpwd']")).sendKeys("Trans@456");
		  driver.findElement(By.xpath("//input[@value='PayNow']")).click(); 
		  driver.findElement(By.xpath("/html/body/header/div/div/ul/b/a[2]")).click();
		  driver.close();
	}
}
