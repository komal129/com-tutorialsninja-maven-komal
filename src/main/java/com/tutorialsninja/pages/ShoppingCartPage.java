package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {
    By shoppingCartText = By.xpath("//div[@id='content']/h1[contains(text(), 'Shopping Cart')]");
    By productNameText = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a");
    By deliveryDateText = By.xpath("//div[@class='input-group date']/input");
    By modelText = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[3]");
    By priceText = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[6]");
    By macBookNameText = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a");

    By macBookQuantity = By.xpath("//input[contains(@name, 'quantity')]");
    By macBookUpdateButton = By.xpath("//button[contains(@data-original-title, 'Update')]");
    By macBookTotal = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[6]");
    By checkoutButton = By.xpath("//a[contains(text(),'Checkout')]");

    public String shoppingCartTextErrorMessage(){
        return getTextFromElement(shoppingCartText);
    }

    public String productNameErrorMessage(){
        return getTextFromElement(productNameText);
    }

    public String deliveryDateErrorMessage(){
        return driver.findElement(deliveryDateText).getAttribute("value");
    }

    public String modelErrorMessage(){
        return getTextFromElement(modelText);
    }

    public String priceTotalErrorMessage(){
        return getTextFromElement(priceText);
    }
    public String macBookNameErrorMessage(){
        return getTextFromElement(macBookNameText);
    }

    public void updateMacBookQuantity(){
        driver.findElement(macBookQuantity).clear();
        sendTextToElement(macBookQuantity, "2");
        clickOnElement(macBookUpdateButton);
    }

    public String macBookTotalErrorMessage(){
        return getTextFromElement(macBookTotal);
    }

    public void clickOnCheckButton(){
        clickOnElement(checkoutButton);
    }
}
