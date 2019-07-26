package casestudy;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class cswithoutprod {
	WebDriver driver;
	@Given("user launches the app")
	public void user_launches_the_app() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp");
	}

	@When("user clicks on sign in")
	public void user_clicks_on_sign_in() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//a[contains(text(),'SignIn')]")).click();
	}

	@Then("user enter username {string}")
	public void user_enter_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.name("userName")).sendKeys(string);
	}

	@Then("user enters password {string}")
	public void user_enters_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.name("password")).sendKeys(string);
	}

	@Then("user clicks on login")
	public void user_clicks_on_login() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.name("Login")).click();
	}

	@Then("user clicks on cart and proceeds to check out")
	public void user_clicks_on_cart_and_proceeds_to_check_out() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@name='products']")).sendKeys("Head");
		  driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();  
     try {  
    	 WebDriverWait wait=new WebDriverWait(driver,20); 
		String e_val="Cart";
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"cart\"]/tfoot/tr[2]/td[5]/a")));
     	}
     catch(Exception e) {System.out.println("Cart icon is not found");}
     //finally{System.out.println("cart not found");}
	
		//String a_val=driver.findElement(By.xpath("//*[@id=\"cart\"]/tfoot/tr[2]/td[5]/a")).getText();
//	    if(e_val.equals(a_val))
//	    {
//	         System.out.println("Proceeds to checkout");
//	    }
//	    else
//	    {
//	    	System.out.println("Doesn't Proceed to checkout");
//	    }
//	}
	}
}
