package Locators;

import StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Locate {

    WebDriver HZM = Hooks.HZM;

    public WebElement Email(){
        return HZM.findElement(By.xpath("//*[@id=\"root\"]/div/section/div[3]/div/form/div[1]/div[1]/div[1]/div/input"));

    }
    public WebElement Password(){
        return HZM.findElement(By.xpath("//*[@id=\"root\"]/div/section/div[3]/div/form/div[1]/div[2]/div/div/input"));

    }
    public WebElement Button (){
        return HZM.findElement(By.xpath("//span[contains(text(),'Login')]"));
    }
}
