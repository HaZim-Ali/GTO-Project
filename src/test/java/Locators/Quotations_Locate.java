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
        return HZM.findElement(By.xpath("//*[@id=\"selectInput0.19323468692899626\"]/div/span"));
    }
    ////div[@class="ant-select-selector"]//span[@class="ant-select-selection-search"]//input[@aria-controls="rc_select_1_list"]
    public WebElement Country1 (String Country){
        return HZM.findElement(By.xpath("//*[@id=\"rc_select_2\"]"));
    }
    public WebElement CustomerNote1 (String CustomerNotes){
        return HZM.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/main/section/div/form/div[1]/div[5]/div/div/textarea"));
    }
    public WebElement CreationDate1 (String CreationDate){
        return HZM.findElement(By.xpath("//div[@class=\"ant-picker-input\"]//input[@placeholder=\"DD/MM/YYYY\"]"));
    }

    public WebElement CreationTime1 (String creationTime){
        return HZM.findElement(By.xpath("//input[@placeholder=\"H:MM\"]"));
    }
    public WebElement SelectTime1 (){
        return HZM.findElement(By.xpath("//*[@id=\"selectInput0.5582061910821206\"]/div[2]/div/div/div/div[1]/div/ul[1]/li[8]/div"));
    }


}
