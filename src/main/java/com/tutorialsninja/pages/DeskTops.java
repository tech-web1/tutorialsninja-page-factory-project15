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

public class DeskTops extends Utility {
    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement desktop;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Show AllDesktops')]")
    WebElement selectMenu;

    @CacheLookup
    @FindBy()
    WebElement originalProductsName;

    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement ZtoA;

    @CacheLookup
    @FindBy()
    WebElement afterSortByZToAProductsName;

    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement AtoZ;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'HP LP3065')]")
    WebElement HP;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'HP LP3065')]")
    WebElement textHP;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'input-group date']//button")
    WebElement date;

    @CacheLookup
    @FindBy(name = "quantity")
    WebElement qty;

    @CacheLookup
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/button[1]")
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='product-product']/div[1]")
    WebElement mesage;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'shopping cart')]")
    WebElement shoppingCart;

    @CacheLookup
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/h1[1]")
    WebElement textCart;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]")
    WebElement productName;

    @CacheLookup
    @FindBy(xpath = "//small[contains(text(),'Delivery Date:2022-11-30')]")
    WebElement DD;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[2]/td[3]")
    WebElement model;

    @CacheLookup
    @FindBy(xpath = "//tbody/tr[1]/td[6]")
    WebElement total;

    // By desktop = By.linkText("Desktops");
    // By selectMenu = By.xpath("//a[contains(text(),'Show AllDesktops')]");
    // ArrayList<String> originalProductsName = new ArrayList<>();
    // By ZtoA = By.id("input-sort");
    //  ArrayList<String> afterSortByZToAProductsName = new ArrayList<>();
    // By AtoZ = By.id("input-sort");
    // By HP = By.xpath("//a[contains(text(),'HP LP3065')]");
    // By textHP = By.xpath("//h1[contains(text(),'HP LP3065')]");
    // By date = By.xpath("//div[@class = 'input-group date']//button");
    // By qty = By.name("quantity");
    //By addToCart = By.id("button-cart");
    // By mesage = By.xpath("//body/div[@id='product-product']/div[1]");
    //By shoppingCart = By.xpath("//a[contains(text(),'shopping cart')]");
    // By textCart = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/h1[1]");
    // By productName = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a");
    // By DD = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/small[1]\")).contains(\"2023-11-30\")");
    // By model = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[3]");
    //By total = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[6]");


    public void desktop()
    {
        //2.1 Mouse hover on Desktops Tab. and click
        mouseHoverToElement(desktop);
        CustomListeners.test.log(Status.PASS,"mouseHower");
    }
    public void setSelectMenu()
    {
        clickOnElement(selectMenu);
        CustomListeners.test.log(Status.PASS,"click on button");

    }
    public void origibalproduct()
    {
        ArrayList<String> originalProductsName = new ArrayList<>();
        List<WebElement> products = driver.findElements(By.xpath("//h4/a"));
        System.out.println("total product "+products.size());
        for (WebElement e : products)
        {
            originalProductsName.add(e.getText());
        }
        System.out.println("Product Name = "+originalProductsName);
    }
    public void selectZtoA()
    {
        //Select Sort By position "Name: Z to A"
        selectByVisibleTextFromDropDown(ZtoA,"Name (Z - A)");

    }
    public void afterSortByZToAProductsName()
    {
        //after
        ArrayList<String> afterSortByZToAProductsName = new ArrayList<>();
        List<WebElement>  products = driver.findElements(By.xpath("//h4/a"));
        System.out.println("Total produtcs = "+products.size() );

        for (WebElement e : products) {
            afterSortByZToAProductsName.add(e.getText());
        }
        System.out.println(afterSortByZToAProductsName);

    }
    public void AtoZ()
    {
        //Select Sort By position "Name: A to Z"
        selectByVisibleTextFromDropDown(AtoZ,"Name (A - Z)");
    }
    public void setHP()
    {
        //Select product “HP LP3065”
        clickOnElement(HP);
        CustomListeners.test.log(Status.PASS,"click on button");
    }
    public void verifyTextHP()
    {
        //2.5 Verify the Text "HP LP3065"
        getTextFromElement(textHP);
    }
    public void setDate() {
        String year = "2023";
        String month = "November";
        String date1 = "30";
        clickOnElement(date);
        while (true) {
            String monthAndYear = driver.findElement(By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='picker-switch']")).getText();
            String[] arr = monthAndYear.split(" ");
            String mon = arr[0];
            String yer = arr[1];
            if (mon.equalsIgnoreCase(month) && yer.equalsIgnoreCase(year)) {
                break;
            } else {
                clickOnElement(By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='next']"));
            }
        }
        List<WebElement> allDates = driver.findElements(By.xpath("//div[@class = 'datepicker']/div[1]//tbody/tr/td[@class = 'day']"));
        for (WebElement e : allDates) {
            if (e.getText().equalsIgnoreCase(date1)) {
                e.click();
                break;
            }

        }
    }
    public void setQty(String qty1)
    {
        //Enter Qty "1” using Select class.
        //remove(qty);
        sendTextToElement(qty,qty1);
        CustomListeners.test.log(Status.PASS,"send "+qty);


    }
    public void setAddToCart() {
        //2.8 Click on “Add to Cart” button
        clickOnElement(addToCart);
        CustomListeners.test.log(Status.PASS,"click on button");

    }
    public void message()
    {
        //2.9 Verify the Message “Success: You have added HP LP3065 to your shopping cart!”
        getTextFromElement(mesage);
    }
    public void setShoppingCart()
    {
        //2.10 Click on link “shopping cart” display into success message
        clickOnElement(shoppingCart);
        CustomListeners.test.log(Status.PASS,"click on button");
    }
    public void setTextCart()
    {
        //2.11 Verify the text "Shopping Cart"
        getTextFromElement(textCart);
    }
    public void setProductName()
    {
        //2.12 Verify the Product name "HP LP3065"
        getTextFromElement(productName);
    }
    public void deliveryDate()
    {
        //2.13 Verify the Delivery Date "2022-11-30"
        getTextFromElement(DD);
    }
    public void setModel()
    {
        //2.14 Verify the Model "Product21"
        getTextFromElement(model);
    }
    public void setTotal()
    {
        //2.15 Verify the Todat "£74.73"
        getTextFromElement(total);
    }
}
