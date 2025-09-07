package POMClasess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsCheckoutOverViewPage
{
    @FindBy(xpath = "//button[text()='Finish']") private WebElement finish;


    public SwagLabsCheckoutOverViewPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }


    public void clickSwagLabsCheckoutOverviewPageFinish()
    {
        finish.click();
    }

}
