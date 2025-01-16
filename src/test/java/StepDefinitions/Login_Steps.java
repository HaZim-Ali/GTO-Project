package StepDefinitions;

import Locators.Login_Locate;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Steps {
    Login_Locate EmailAddress = new Login_Locate();
    Login_Locate Password1 = new Login_Locate();
    Login_Locate LogButton = new Login_Locate();


    @When("user fill valid email address and password")
    public void user_fill_valid_email_address_and_password(){
        EmailAddress.Email().sendKeys("admin@example.com");
        Password1.Password().sendKeys("3lJ%7br2[~0Q");
    }
    @And("click on login button")
    public void click_on_login_button(){
        LogButton.Button().click();
    }
    @Then("user login successfully")
    public void user_login_successfully(){

    }






}
