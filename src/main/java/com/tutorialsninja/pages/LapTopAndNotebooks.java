package com.tutorialsninja.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.customlisteners.CustomListeners;
import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class LapTopAndNotebooks extends Utility {
    @CacheLookup
    @FindBy(linkText = "Laptops & Notebooks")
    WebElement laptop;

    @CacheLookup
    @FindBy(linkText = "Show AllLaptops & Notebooks")
    WebElement allLaptop;

    @CacheLookup
    @FindBy()
    WebElement originalProductsPrice;

    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement price;

    @CacheLookup
    @FindBy()
    WebElement  afterSortByPrice;

    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement price1;

    @CacheLookup
    @FindBy(linkText = "MacBook")
    WebElement macBook;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'MacBook')]")
    WebElement textMacbook;

    @CacheLookup
    @FindBy(xpath = "//button[@id='button-cart']")
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='product-product']/div[1]")
    WebElement message;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'shopping cart')]")
    WebElement shoppingCart;

    @CacheLookup
    @FindBy(xpath = "//div[@id='content']//h1")
    WebElement textShopping;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a")
    WebElement productName;

    @CacheLookup
    @FindBy(xpath = "//input[contains(@name, 'quantity')]")
    WebElement qty;

    @CacheLookup
    @FindBy(xpath = "//button[contains(@data-original-title, 'Update')]")
    WebElement update;

    @CacheLookup
    @FindBy(xpath = "//div[@id='checkout-cart']/div[1]")
    WebElement getMessage;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[6]")
    WebElement total;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Checkout')]")
    WebElement checkOut;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Checkout')]")
    WebElement textCheckOut;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'New Customer')]")
    WebElement newCostumer;

    @CacheLookup
    @FindBy(xpath = "//input[@name='account'][@value='guest']")
    WebElement guestButton;

    @CacheLookup
    @FindBy(xpath = "//input[@id='button-account']")
    WebElement continuebutton;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-firstname']")
    WebElement  firstName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-lastname']")
    WebElement lastName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-email']")
    WebElement email;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-telephone']")
    WebElement number;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-address-1']")
    WebElement address;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-city']")
    WebElement city;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-postcode']")
    WebElement postcode;

    @CacheLookup
    @FindBy(xpath = "//select[@id='input-payment-country']")
    WebElement Country;

    @CacheLookup
    @FindBy(id = "input-payment-zone")
    WebElement state;

    @CacheLookup
    @FindBy(xpath = "//input[@id='button-guest']")
    WebElement ContinueButton1;

    @CacheLookup
    @FindBy(name = "comment")
    WebElement comments;

    @CacheLookup
    @FindBy(name = "agree")
    WebElement teams;

    @CacheLookup
    @FindBy(id = "button-payment-method")
    WebElement ContinueButton2;

    @CacheLookup
    @FindBy(className = "alert")
    WebElement warning;


    //By laptop = By.linkText("Laptops & Notebooks");
    // By allLaptop = By.linkText("Show AllLaptops & Notebooks");
    // List<Double> originalProductsPrice = new ArrayList<>();
    //By price = By.id("input-sort");
    // ArrayList<Double> afterSortByPrice = new ArrayList<>();
    // By price1 =  By.id("input-sort");
    // By macBook = By.linkText("MacBook");
    //By textMacbook = By.xpath("//h1[contains(text(),'MacBook')]");
    // By addToCart = By.xpath("//button[@id='button-cart']");
    // By message = By.xpath("//body/div[@id='product-product']/div[1]");
    //By shoppingCart = By.xpath("//a[contains(text(),'shopping cart')]");
    //  By textShopping = By.xpath("//div[@id='content']//h1");
    // By productName = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a");
    // By qty = By.xpath("//input[contains(@name, 'quantity')]");
    // By update = By.xpath("//button[contains(@data-original-title, 'Update')]");
    // By getMessage = By.xpath("//div[@id='checkout-cart']/div[1]");
    // By total = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[6]");
    //By checkOut = By.xpath("//a[contains(text(),'Checkout')]");
    //  By textCheckOut=By.xpath("//h1[contains(text(),'Checkout')]");
    // By newCostumer = By.xpath("//h2[contains(text(),'New Customer')]");
    //By guestButton  = By.xpath("//input[@name='account'][@value='guest']");
    //By continuebutton = By.xpath("//input[@id='button-account']");
    //By firstName = By.xpath("//input[@id='input-payment-firstname']");
    // By lastName = By.xpath("//input[@id='input-payment-lastname']");
    // By email = By.xpath("//input[@id='input-payment-email']");
    // By number = By.xpath("//input[@id='input-payment-telephone']");
    // By address = By.xpath("//input[@id='input-payment-address-1']");
    // By city = By.xpath("//input[@id='input-payment-city']");
    //  By postcode = By.xpath("//input[@id='input-payment-postcode']");
    // By Country = By.xpath("//select[@id='input-payment-country']");
    // By state = By .id("input-payment-zone");
    // By ContinueButton1 = By.xpath("//input[@id='button-guest']");
    // By comments = By.name("comment");
    // By teams = By.name("agree");
    //By ContinueButton2 = By.id("button-payment-method");
    // By warning = By.className("alert");

    public void setLaptop()
    {
        //1.1 Mouse hover on Laptops & Notebooks Tab.and click
        mouseHoverToElement(laptop);
        CustomListeners.test.log(Status.PASS,"mouseHower"+laptop);
    }
    public void setAllLaptop()
    {
        //1.2 Click on “Show All Laptops & Notebooks”
        clickOnElement(allLaptop);
        CustomListeners.test.log(Status.PASS,"click on button");
    }
    public void originalProductsPrice()
    {
        //1.3 Select Sort By "Price (High > Low)"

        List<Double> originalProductsPrice = new ArrayList<>();
        List<WebElement> products = driver.findElements(By.xpath("//p[@class ='price']"));

        for (WebElement e : products) {
            System.out.println(e.getText());
            String[] arr = e.getText().split("Ex Tax:");
            originalProductsPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",","")));
        }
        System.out.println(originalProductsPrice);
    }
    public void setPrice()
    {
        //1.4 Verify the Product price will arrange in High to Low order.

        selectByVisibleTextFromDropDown(price,"Price (High > Low)");
    }
    public void afterSortByPrice()
    {

        ArrayList<Double> afterSortByPrice = new ArrayList<>();
        List<WebElement> products = driver.findElements(By.xpath("//p[@class ='price']"));

        for (WebElement e : products) {
            String[] arr = e.getText().split("Ex Tax:");
            afterSortByPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",","")));
        }
        System.out.println(afterSortByPrice);
    }
    public void setPrice1()
    {
        //2.3 Select Sort By "Price (High > Low)"
        selectByVisibleTextFromDropDown(price1,"Price (High > Low)");

    }
    public void setMacBook()
    {
        //2.4 Select Product “MacBook”
        clickOnElement(macBook);
        CustomListeners.test.log(Status.PASS,"click on button");
    }
    public void setTextMacbook()
    {
        //2.5 Verify the text “MacBook
        getTextFromElement(textMacbook);
    }
    public void setAddToCart()
    {
        //2.6 Click on ‘Add To Cart’ button
        clickOnElement(addToCart);
        CustomListeners.test.log(Status.PASS,"click on button");
    }
    public void setMessage()
    {
        //2.7 Verify the message “Success: You have added MacBook to your shopping cart
        getTextFromElement(message);
    }
    public void setShoppingCart()
    {
        //2.8 Click on link “shopping cart” display into success message
        clickOnElement(shoppingCart);
        CustomListeners.test.log(Status.PASS,"click on button");
    }
    public void setTextShopping()
    {
        //2.9 Verify the text "Shopping Cart"
        getTextFromElement(textShopping);
    }
    public void productName()
    {
        //2.10 Verify the Product name "MacBook"
        getTextFromElement(productName);
    }
    public void setQty(String qty1)
    {
        //2.11 Change Quantity "2"
        //remove(qty);
        sendTextToElement(qty,qty1);

    }
    public void setUpdate()
    {
        //2.12 Click on “Update” Tab
        clickOnElement(update);
        CustomListeners.test.log(Status.PASS,"click on button");
    }
    public void setGetMessage()
    {
        //Verify the message “Success: You have modified your shopping cart!”
        getTextFromElement(getMessage);
    }
    public void setTotal()
    {
        //2.14 Verify the Total £737.45
        getTextFromElement(total);
    }
    public void setCheckOut()
    {
        //2.15 Click on “Checkout” button
        clickOnElement(checkOut);
        CustomListeners.test.log(Status.PASS,"click on button");
    }
    public void setTextCheckOut()
    {
        //2.16 Verify the text “Checkout”
        getTextFromElement(textCheckOut);
    }
    public void  setNewCostumer()
    {
        //2.17 Verify the Text “New Customer”
        getTextFromElement(newCostumer);
    }
    public void setGuestButton()
    {
        //2.18 Click on “Guest Checkout” radio button
        clickOnElement(guestButton);
        CustomListeners.test.log(Status.PASS,"click on button");

    }
    public void setContinuebutton()
    {
        //2.19 Click on “Continue” tab
        clickOnElement(continuebutton);
        CustomListeners.test.log(Status.PASS,"click on button");
    }
    public void mandatoryField(String first) {
        //2.20 Fill the mandatory fields
        sendTextToElement(firstName, first);
    }
    public void setLastName(String lastName1) {
        sendTextToElement(lastName, lastName1);
    }
    public void setEmail(String email1) {
        sendTextToElement(email, email1);
    }
    public void setNumber(String number1) {
        sendTextToElement(number, number1);
    }
    public void setAddress(String address1) {
        sendTextToElement(address, address1);
    }
    public void setCity(String city1) {
        sendTextToElement(city, city1);
    }
    public void setPostcode(String postcode1) {

        sendTextToElement(postcode, postcode1);
    }
    public void setCountry(String country) {
        selectByVisibleTextFromDropDown(Country, country);
    }
    public void setState(String state1)
    {
        selectByVisibleTextFromDropDown(state,state1);
        CustomListeners.test.log(Status.PASS,"send ");

    }
    public void setContinueButton1()
    {
        //2.21 Click on “Continue” Button
        clickOnElement(ContinueButton1);
        CustomListeners.test.log(Status.PASS,"click on button");
    }
    public void setComments(String comments1)
    {
        //2.22 Add Comments About your order into text area
        sendTextToElement(comments,comments1);
    }
    public void setTeams()
    {
        //2.23 Check the Terms & Conditions check box
        clickOnElement(teams);
        CustomListeners.test.log(Status.PASS,"click on button");
    }
    public void setContinueButton2()
    {
        //2.24 Click on “Continue” button
        clickOnElement(ContinueButton2);
        CustomListeners.test.log(Status.PASS,"click on button");
    }
    public void setWarning()
    {
        //2.25 Verify the message “Warning message
        getTextFromElement(warning);
    }


}
