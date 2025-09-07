package POMClasess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SwagLabHomePage {
    @FindBy(xpath = "//div[@class='app_logo']") private WebElement Logo;

    @FindBy(xpath = "//div[@class='inventory_item_name ']") private List<WebElement> allproducts;

    @FindBy(xpath = "(//div[@class='inventory_item_price'])[1]") private WebElement Backpackproductprice;
    @FindBy(xpath = "//div[@class='inventory_item_price']") private List<WebElement> allProductsPrice;
    @FindBy(xpath ="(//button[text()='Add to cart'])[1]") private WebElement addtocartBackPack;
    @FindBy(xpath ="//a[@class='shopping_cart_link']") private WebElement cart;

    public SwagLabHomePage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }


    public String getSwagLabHomePageLogoText() {
        String actLogoText = Logo.getText();
        return actLogoText;
    }


    public int getSwagLabHomePageProductCount() {
        int actProductCount = allproducts.size();
        return actProductCount;
    }


    public double getSwagLabHomePageBackPackProductPrice() {
        String price = Backpackproductprice.getText();                  //$29.99
        price = price.substring(1);                           //29.99
        double actPrice = Double.parseDouble(price);      //convert string into double
        return actPrice;
    }
    public double getSwagLabHomePageTotalProductPrice()
    {
        double actTotalPrice=0.0;
        for(WebElement s1:allProductsPrice)
        {
            String text = s1.getText();
            text=text.substring(1);
            double price = Double.parseDouble(text);


            actTotalPrice=actTotalPrice+price;
        }
        return actTotalPrice;
    }

    public void clickSwagLabHomePageAddToCartBackpack()
    {
    addtocartBackPack.click();
    }

public void clickSwagLabHomePagecart()
{
        cart.click();
    }

    }
