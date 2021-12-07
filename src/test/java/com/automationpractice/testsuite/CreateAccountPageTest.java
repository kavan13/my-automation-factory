package com.automationpractice.testsuite;

import com.automationpractice.customlisteneres.CustomListeners;
import com.automationpractice.pages.CreateAccountPage;
import com.automationpractice.pages.HomePage;
import com.automationpractice.pages.SignInPage;
import com.automationpractice.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import resources.testdata.TestData;

import java.util.Random;

@Listeners(CustomListeners.class)
public class CreateAccountPageTest extends TestBase {
    HomePage homePage;
    SignInPage signInPage;
    CreateAccountPage createAccountPage;

    @BeforeMethod(groups = {"sanity"})
    public void inIt() {
        homePage = new HomePage();
        signInPage = new SignInPage();
        createAccountPage =new CreateAccountPage();
    }

    @Test(groups = {"sanity","smoke","regression"})
    public void  verifyThatUserShouldCreateAccountSuccessfully(){
        homePage.clickOnSignInLinkOnHomePage();
        Random randomNum = new Random();
        int randomGenerator = randomNum.nextInt(1000);
        signInPage.enterEmailfornewacountcreation("xyz"+randomGenerator+"@gnail.com");
        signInPage.clickOnCreateAnAccountButton();
        createAccountPage.enterYourFirstName("Kavan");
        createAccountPage.enterYourLastName("Patel");
        createAccountPage.enterYourPassword("abcd123#");
        createAccountPage.enterYourAddress("13");
        createAccountPage.enterYourCity("London");
        createAccountPage.selectYourState("3");
        createAccountPage.enterYourPostalCode("Ha8 7Lq");
        createAccountPage.selectYourCountry("21");
        createAccountPage.enterYourPhoneNumber("07453482366");
        createAccountPage.clickOnRegisterButton();

    }



}
