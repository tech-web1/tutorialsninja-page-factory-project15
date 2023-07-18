package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.DeskTops;
import com.tutorialsninja.pages.LapTopAndNotebooks;
import com.tutorialsninja.pages.MyAccount;
import com.tutorialsninja.pages.TopMenuTest;
import com.tutorialsninja.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
    TopMenuTest top;
    DeskTops destops ;
    LapTopAndNotebooks laptop ;
    MyAccount myAccount ;

    @BeforeMethod(groups = {"sanity","smoke","regression","regression1"})
    public void iNit()
    {
        top = new TopMenuTest();
        destops = new DeskTops();
        laptop = new LapTopAndNotebooks();
        myAccount = new MyAccount();

    }

    @Test(groups = {"sanity"})
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully()
    {
        top.desktop();
        top.setSelectMenu();
        top.textDesktop();
        String expected = "Desktops";
        String actual = getTextFromElement(By.xpath("//h2[contains(text(),'Desktops')]"));
        Assert.assertEquals(actual,expected);


    }
    @Test(groups = {"smoke"})
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully()
    {
        top.setLaptop();
        top.setAllNotBooks();
        top.textBooks();
        String expected = "Laptops & Notebooks";
        String actual =getTextFromElement(By.xpath("//h2[contains(text(),'Laptops & Notebooks')]")) ;
        Assert.assertEquals(actual,expected);
    }
    @Test(groups = {"regression","regression1"})
    public void verifyUserShouldNavigateToComponentsPageSuccessfully()
    {
        top.setComponents();
        top.allComponents();
        top.setTextComponents();
        String expected = "Components";
        String  actual =getTextFromElement(By.xpath("//h2[contains(text(),'Components')]"));
        Assert.assertEquals(actual,expected);
    }
    @Test(groups = {"regression","regression1"})
    public void verifyProductArrangeInAlphaBaticalOrder()
    {
        destops.desktop();
        destops.setSelectMenu();
        destops.origibalproduct();
        destops.selectZtoA();
        destops.afterSortByZToAProductsName();
        String expected = "Sony VAIO";

        String actual = getTextFromElement(By.xpath("//h4/a"));
        Assert.assertEquals(actual,expected);


    }
    @Test(groups = {"regression","regression1"})
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        destops.desktop();
        destops.setSelectMenu();
        destops.AtoZ();
        destops.setHP();
        Thread.sleep(2000);
        destops.verifyTextHP();
        destops. setDate();
        destops.setQty("1");
        Thread.sleep(2000);
        destops.setAddToCart();
        destops.message();
        destops.setShoppingCart();
        Thread.sleep(2000);
        destops.setTextCart();
        destops.setProductName();
        Thread.sleep(2000);
        // destops.deliveryDate();
        // destops.setModel();
        destops.setTotal();
    }
    @Test(groups = {"regression","regression1"})
    public void verifyProductsPriceDisplayHighToLowSuccessfully() throws InterruptedException {
        laptop.setLaptop();
        laptop.setAllLaptop();
        laptop.originalProductsPrice();
        laptop.setPrice();
        laptop.afterSortByPrice();
        laptop.setPrice1();
        laptop.setMacBook();
        Thread.sleep(2000);
        laptop.setTextMacbook();
        laptop. setAddToCart();
        laptop.setMessage();
        laptop.setShoppingCart();
        laptop.setTextShopping();
        laptop.productName();
        laptop.setQty("2");
        laptop.setUpdate();
        Thread.sleep(2000);
        laptop.setGetMessage();
        laptop.setTotal();
        laptop.setCheckOut();
        laptop.setTextCheckOut();
        Thread.sleep(2000);
        laptop.setNewCostumer();
        laptop.setGuestButton();
        Thread.sleep(2000);
        laptop.setContinuebutton();
        laptop.mandatoryField("Siya");
        laptop.setLastName("Ram");
        laptop.setEmail("siyaram@gmail.com");
        Thread.sleep(2000);
        laptop.setNumber("9856097843");
        laptop.setAddress("45,opera");
        Thread.sleep(2000);
        laptop.setCity("Surat");
        laptop.setPostcode("3456PR");
        laptop.setCountry("India");
        laptop.setState("Gujarat");
        Thread.sleep(2000);
        laptop.setContinueButton1();
        laptop.setComments("Nice Product");
        laptop.setTeams();
        Thread.sleep(2000);
        laptop.setContinueButton2();
        laptop.setWarning();

    }
    @Test(groups = {"regression","regression1"})
    public void verifyUserShouldNavigateToRegisterPageSuccessfully()
    {
        myAccount.setMyAccount();
        myAccount.setRegister();
        myAccount.setTextRegister();
    }
    @Test(groups = {"regression","regression1"})
    public void verifyUserShouldNavigateToLoginPageSuccessfully()
    {
        myAccount.setMyAccount();
        myAccount.setLogin();
        myAccount.setText();
    }
    @Test(groups = {"regression","regression1"})
    public void verifyThatUserRegisterAccountSuccessfully() throws InterruptedException {
        myAccount.setMyAccount();
        myAccount.setRegister();
        Thread.sleep(2000);
        myAccount.setFirstName("radha");
        myAccount.setLastName("Krishna");
        myAccount.setEmail("omshivay96@gmail.com");
        myAccount.setTelephone("7866569045");
        myAccount.setPassword("radha8899");
        myAccount.setConfirmPassword("radha8899");
        myAccount.setRedioButton();
        myAccount.setPrivacy();
        Thread.sleep(2000);
        myAccount.setContinueButton();
        myAccount.setMessage();
        myAccount.setGetContinueButton();
        myAccount.setLink();
        Thread.sleep(2000);
        myAccount.setLogin1();
        myAccount.setText1();
        myAccount. continueButton();
    }
    @Test(groups = {"regression","regression1"})
    public void verifyThatUserShouldLoginAndLogoutSuccessfully() throws InterruptedException {
        myAccount.setMyAccount();
        myAccount.setLogin();
        Thread.sleep(2000);
        myAccount.setEmail("omshivay96@gmail.com");
        myAccount.setPassword("radha8899");
        myAccount.setLink();
        myAccount.setLog();
        Thread.sleep(2000);

        // myAccount.setText1();
        Thread.sleep(2000);
        myAccount.setLink();

        Thread.sleep(2000);
        myAccount.setLogOut();
        Thread.sleep(2000);
        // myAccount.setText1();
        myAccount. continueButton();
    }

}
