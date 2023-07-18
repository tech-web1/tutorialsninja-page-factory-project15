package com.tutorialsninja.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.customlisteners.CustomListeners;
import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class MyAccount extends Utility {
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'My Account')]")
    WebElement myAccount;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement register;

    @CacheLookup
    @FindBy(xpath = "//div[@id='content']//h1")
    WebElement textRegister;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Login')]")
    WebElement login;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Returning Customer')]")
    WebElement text;

    @CacheLookup
    @FindBy(id = "input-firstname")
    WebElement firstName;

    @CacheLookup
    @FindBy(id = "input-lastname")
    WebElement lastName;

    @CacheLookup
    @FindBy(id = "input-email")
    WebElement email;

    @CacheLookup
    @FindBy(id = "input-telephone")
    WebElement telephone;

    @CacheLookup
    @FindBy(id = "input-password")
    WebElement password;

    @CacheLookup
    @FindBy(id = "input-confirm")
    WebElement confirmPassword;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='account-register']/div[1]/div[1]/form[1]/fieldset[3]/div[1]/div[1]/label[1]/input[1]")
    WebElement redioButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'buttons']//input[@name='agree']")
    WebElement privacy;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'buttons']//input[@value='Continue']")
    WebElement continueButton;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Your Account Has Been Created!')]")
    WebElement message;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement getContinueButton;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'My Account')]")
    WebElement link;

    @CacheLookup
    @FindBy(xpath = "//body/nav[@id='top']/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[5]/a[1]")
    WebElement login1;

    @CacheLookup
    @FindBy(xpath = "//body/nav[@id='top']/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[5]/a[1]")
    WebElement logOut;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Account Logout')]")
    WebElement text1;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement getContinueButton1;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='account-login']/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]")
    WebElement log;

    // By myAccount = By.xpath("//span[contains(text(),'My Account')]");
    //  By register = By.xpath("//a[contains(text(),'Register')]");
    // By textRegister = By.xpath("//div[@id='content']//h1");
    // By login = By.xpath("//a[contains(text(),'Login')]");
    // By text = By.xpath("//h2[contains(text(),'Returning Customer')]");
    // By firstName = By.id("input-firstname");
    // By lastName = By.id("input-lastname");
    //  By email = By.id("input-email");
    //By telephone = By.id("input-telephone");
    // By password = By.id("input-password");
    // By confirmPassword = By.id("input-confirm");
    //By redioButton = By.xpath("//fieldset[3]//input");
    // By privacy = By.xpath("//div[@class = 'buttons']//input[@name='agree']");
    // By continueButton = By.xpath("//div[@class = 'buttons']//input[@value='Continue']");
    // By message = By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]");
    // By getContinueButton = By.xpath("//a[contains(text(),'Continue')]");
    // By link  = By.xpath("//span[contains(text(),'My Account')]");

    //  By logOut = By.linkText("Logout");
    //By text1 = By.xpath("//h1[contains(text(),'Account Logout')]");
    //By getContinueButton1 = By.xpath("//a[contains(text(),'Continue')]");


    public void setMyAccount()
    {
        //3.1 Clickr on My Account Link.
        clickOnElement(myAccount);
        CustomListeners.test.log(Status.PASS,"click on button");
    }
    public void setRegister()
    {
        //Call the method “selectMyAccountOptions” method and pass the parameter
        //“Register
        clickOnElement(register);
        CustomListeners.test.log(Status.PASS,"click on button");
    }
    public void setTextRegister()
    {
        //1.3 Verify the text “Register Account”.
        getTextFromElement(textRegister);
    }
    public void setLogin()
    {
        //2.2 Call the method “selectMyAccountOptions” method and pass the parameter
        //“Login”
        clickOnElement(login);
        CustomListeners.test.log(Status.PASS,"click on button");
    }
    public void setText()
    {
        //2.3 Verify the text “Returning Customer”.
        getTextFromElement(text);

    }
    public void setFirstName(String name)
    {
        //3.3 Enter First Name
        sendTextToElement(firstName,name);
        CustomListeners.test.log(Status.PASS,"send "+firstName);

    }
    public void setLastName(String lastName1)
    {
        //3.4 Enter Last Name
        sendTextToElement(lastName, lastName1);
        CustomListeners.test.log(Status.PASS,"send "+lastName);
    }
    public void setEmail(String email1)
    {
        //3.5 Enter Email
        sendTextToElement(email,email1);
        CustomListeners.test.log(Status.PASS,"send "+email);
    }
    public void setTelephone(String telephone1)
    {
        //3.6 Enter Telephone
        sendTextToElement(telephone,telephone1);
        CustomListeners.test.log(Status.PASS,"send "+telephone);
    }
    public void setPassword(String password1)
    {
        //3.7 Enter Password
        sendTextToElement(password,password1);
        CustomListeners.test.log(Status.PASS,"send "+password);
    }
    public void setConfirmPassword(String  confirmPassword1)
    {
        //3.8 Enter Password Confirm
        sendTextToElement(confirmPassword,confirmPassword1);
        CustomListeners.test.log(Status.PASS,"send "+confirmPassword);
    }
    public void setRedioButton()
    {
        //3.9 Select Subscribe Yes radio button
        clickOnElement(redioButton);
    }
    public void setPrivacy()
    {
        //3.10 Click on Privacy Policy check box
        clickOnElement(privacy);
        CustomListeners.test.log(Status.PASS,"click on button");
    }
    public void setContinueButton()
    {
        //3.11 Click on Continue button
        clickOnElement(continueButton);
        CustomListeners.test.log(Status.PASS,"click on button");
    }
    public void setMessage()
    {
        //3.12 Verify the message “Your Account Has Been Created!”
        getTextFromElement(message);
    }
    public void setGetContinueButton()
    {
        //3.13 Click on Continue button
        clickOnElement(getContinueButton);
        CustomListeners.test.log(Status.PASS,"click on button");
    }
    public void setLink()
    {
        //3.14 Clickr on My Account Link.
        clickOnElement(link);
        CustomListeners.test.log(Status.PASS,"click on button");
    }
    public void setLogin1()
    {
        //3.15 Call the method “selectMyAccountOptions” method and pass the parameter
        //“Logout”
        clickOnElement(login1);
        CustomListeners.test.log(Status.PASS,"click on button");
    }
    public void setLogOut()
    {
        clickOnElement(logOut);
    }
    public void setText1()
    {
        //3.16 Verify the text “Account Logout”
        getTextFromElement(text1);
    }
    public void setLog()
    {
        clickOnElement(log);
    }
    public void continueButton()
    {
        //3.17 Click on Continue button
        clickOnElement(getContinueButton1);
        CustomListeners.test.log(Status.PASS,"click on button");
    }

}
