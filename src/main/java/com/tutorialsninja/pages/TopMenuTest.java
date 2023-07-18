package com.tutorialsninja.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.customlisteners.CustomListeners;
import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class TopMenuTest extends Utility {
    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement desktop;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Show AllDesktops')]")
    WebElement selectMenu;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Desktops')]")
    WebElement textDesktop;

    @CacheLookup
    @FindBy(linkText = "Laptops & Notebooks")
    WebElement laptop;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Show AllLaptops & Notebooks')]")
    WebElement allNotBooks;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Laptops & Notebooks')]")
    WebElement textBooks;

    @CacheLookup
    @FindBy(linkText = "Components")
    WebElement Components;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Show AllComponents')]")
    WebElement AllComponents;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Components')]")
    WebElement textComponents;


    //By desktop = By.linkText("Desktops");
    // By selectMenu = By.xpath("//a[contains(text(),'Show AllDesktops')]");
    //By textDesktop = By.xpath("//h2[contains(text(),'Desktops')]");
    // By laptop = By.linkText("Laptops & Notebooks");
    //By allNotBooks = By.xpath("//a[contains(text(),'Show AllLaptops & Notebooks')]");
    // By textBooks = By.xpath("//h2[contains(text(),'Laptops & Notebooks')]");
    // By Components = By.linkText("Components");
    //By AllComponents = By.xpath("//a[contains(text(),'Show AllComponents')]");
    // By textComponents = By.xpath("//h2[contains(text(),'Components')]");


    public void desktop()
    {
        mouseHoverToElement(desktop);
        CustomListeners.test.log(Status.PASS,"mouseHower");
    }
    public void setSelectMenu()
    {
        clickOnElement(selectMenu);
        CustomListeners.test.log(Status.PASS,"click on button");
    }
    public void textDesktop()
    {
        getTextFromElement(textDesktop);

    }
    public void setLaptop()
    {
        mouseHoverToElement(laptop);
        CustomListeners.test.log(Status.PASS,"mouseHower");
    }
    public void setAllNotBooks()
    {
        clickOnElement(allNotBooks);
        CustomListeners.test.log(Status.PASS,"click on button");
    }
    public void textBooks()
    {
        getTextFromElement(textBooks);
    }
    public void setComponents()
    {
        mouseHoverToElement(Components);
        CustomListeners.test.log(Status.PASS,"mouseHower");
    }
    public void allComponents()
    {
        clickOnElement(AllComponents);
        CustomListeners.test.log(Status.PASS,"click on button");
    }
    public void setTextComponents()
    {
        getTextFromElement(textComponents);
    }
}
