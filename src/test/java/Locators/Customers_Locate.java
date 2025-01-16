package Locators;

import StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Customers_Locate {

    WebDriver HZM = Hooks.HZM;


    public WebElement AddCustomer (){
        return HZM.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/main/section/div[1]/div/button/span"));
    }

    public WebElement CustomerId1 (String CustomerID){
        return HZM.findElement(By.xpath("/html/body/div/div/div[1]/div/main/section/div/form/div[1]/div[3]/div[1]/div/div/div[1]/span[1]/input"));
    }
    public WebElement Country1 (String Country){
        return HZM.findElement(By.xpath("//*[@id=\"rc_select_2\"]"));
    }
    public WebElement CustomerNote1 (String CustomerNotes){
        return HZM.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/main/section/div/form/div[1]/div[5]/div/div/textarea"));
    }
    public WebElement CreationDate1 (String CreationDate){
        return HZM.findElement(By.xpath("//*[@id=\"selectInput0.38937435456223035\"]/div[1]/div/input"));
    }


}
