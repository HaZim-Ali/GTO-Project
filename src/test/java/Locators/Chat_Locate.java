package Locators;

import StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Chat_Locate {
    WebDriver HZM = Hooks.HZM;

    public WebElement Message (){
        return HZM.findElement(By.xpath("//span[contains(text(),'Chat')]"));
    }
    public WebElement Conversation (){
        return HZM.findElement(By.xpath("/html/body/div/div/div[1]/div/main/section/div/div/div[1]/div[2]/div/div[3]/div[2]/span[1]"));
    }
    public WebElement MessagePrivate (){
        return HZM.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/main/section/div/div/div[2]/div[4]/div/textarea"));
    }
    public WebElement EmojiButton (){
        return HZM.findElement(By.xpath("/html/body/div/div/div[1]/div/main/section/div/div/div[2]/div[2]/div/div/div[1]/div[2]/div[1]/span[1]/div/button/svg"));
    }
    public WebElement Emoji (){
        return HZM.findElement(By.xpath("//*[@id=\"menu1.2093666206717404\"]/div/ul/li[4]/span/div/button[2]/span"));
    }
    public WebElement SendButton (){
        return HZM.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/main/section/div/div/div[2]/div[4]/div/button"));
    }
}
