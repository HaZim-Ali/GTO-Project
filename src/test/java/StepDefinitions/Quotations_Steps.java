package StepDefinitions;

import Locators.Customers_Locate;
import io.cucumber.java.en.And;

public class Customers_Steps {

    Customers_Locate Custom = new Customers_Locate();
    Customers_Locate customerId = new Customers_Locate();
    Customers_Locate country = new Customers_Locate();
    Customers_Locate customNote = new Customers_Locate();
    Customers_Locate createDate = new Customers_Locate();
    Customers_Locate SelectPicker = new Customers_Locate();
    Customers_Locate createTime = new Customers_Locate();
    Customers_Locate SelectTime = new Customers_Locate();


    @And("click on add new customer button")
    public void click_on_add_new_customer_button(){
        Custom.AddCustomer().click();
    }
    @And("admin fill {string} and {string} and {string} and {string} and {string} and {string}")
    public void admin_fill(String CustomerID ,String Country, String CustomerNotes , String CreationDate , String CreationTime){
        customerId.CustomerId1(CustomerID).click();
        country.Country1(Country).sendKeys("Albania");
        customNote.CustomerNote1(CustomerNotes).sendKeys("None");
        createDate.CreationDate1(CreationDate).click();
//        SelectPicker.SelectDate().click();
        createTime.CreationTime1(CreationTime).click();


    }
    @And("select time from time picker")
    public void select_time_from_time_picker(){
        SelectTime.SelectTime1().click();
    }
}
