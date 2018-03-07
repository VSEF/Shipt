package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Registration_steps {

    WebDriver driver;

    @Given("^User enters \"([^\"]*)\"$")
    public void user_enters(String arg1) throws Throwable {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(arg1);
    }

    @When("^User click on Sign Up button$")
    public void user_click_on_Sign_Up_button() throws Throwable {
        driver.findElement(By.className("button-primary")).click();
        Thread.sleep(3000);
    }

    @Then("^User should be on registration page$")
    public void user_should_be_on_registration_page() throws Throwable {
        Assert.assertTrue(driver.getTitle().equals("Shipt Signup"));
        driver.quit();
    }

}
