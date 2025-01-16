package StepDefinitions;

import Locators.Chat_Locate;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Chat_Steps {

    Chat_Locate Message1 = new Chat_Locate();
    Chat_Locate Conv = new Chat_Locate();
    Chat_Locate Mess = new Chat_Locate();
    Chat_Locate emojiButton2 = new Chat_Locate();
    Chat_Locate emoji3 = new Chat_Locate();
    Chat_Locate Send = new Chat_Locate();


    @When("click on chat button")
    public void click_on_chat_button(){
        Message1.Message().click();
    }
    @And("click on conversation")
    public void click_on_conversation(){
        Conv.Conversation().click();
    }
    @And("write message")
    public void write_message(){
        Mess.MessagePrivate().sendKeys("Hey");
    }
    @And("click on emoji button")
    public void click_on_emoji_button()  {
        WebDriverWait wait = new WebDriverWait(Hooks.HZM, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div[1]/div/main/section/div/div/div[2]/div[2]/div/div/div[1]/div[2]/div[1]/span[1]/div/button/svg")));
        emojiButton2.EmojiButton().click();

    }
    @And("select emoji")
    public void select_emoji(){
        emoji3.Emoji().click();
    }
    @And("click on send button")
    public void click_on_send_button() throws InterruptedException {
        Thread.sleep(5000);
        Send.SendButton().click();

    }
}
