package StepDefinitions;

import Locators.Customers_Locate;
import io.cucumber.java.en.And;
import org.checkerframework.checker.units.qual.C;

public class Customers_Steps {

    Customers_Locate Custom = new Customers_Locate();
    Customers_Locate customerId = new Customers_Locate();
    Customers_Locate country = new Customers_Locate();
    Customers_Locate customNote = new Customers_Locate();
    Customers_Locate createDate = new Customers_Locate();


    @And("click on add new customer button")
    public void click_on_add_new_customer_button(){
        Custom.AddCustomer().click();
    }
    @And("admin fill {string} and {string} and {string} and {string}")
    public void admin_fill(String CustomerID ,String Country, String CustomerNotes , String CreationDate){
        customerId.CustomerId1(CustomerID).sendKeys("Hazem Ali");
        country.Country1(Country).sendKeys("Albania");
        customNote.CustomerNote1(CustomerNotes).sendKeys("None");
        createDate.CreationDate1(CreationDate).sendKeys("31/01/2025");


    }
}
