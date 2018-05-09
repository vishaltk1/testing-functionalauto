package com.practice.pages;

import io.magentys.cinnamon.webdriver.elements.PageElement;
import io.magentys.cinnamon.webdriver.support.FindByKey;

import org.junit.Assert;
import org.openqa.selenium.support.FindBy;

public class LandingPage {

    // You can lookup locators using a key that is specified within an external locator.yml file
    //@FindByKey("landing-page.main-menu")
    //public PageElement mainMenuByKey;

    // You can also use the standard webdriver annotations for finding an element
    @FindBy(css = "span[class*='nav-logo-base']") //TODO Replace with a valid id
    public PageElement amazonlogo;
    
    @FindBy(id = "twotabsearchtextbox")
    public PageElement searchbox;
    
    @FindBy(css = "input[value = 'Go']")
    public PageElement searchbutton;
    
    @FindBy(css = "span[class='a-color-state.a-text-bold']")
    public PageElement sam;
    
    public void CheckIfIamOnLandingPage()
    {
    	
    	Assert.assertTrue(amazonlogo.isDisplayed());
    	
    }
    
    public void Search(String str1)
    {
    	
    	searchbox.sendKeys(str1);
    	searchbutton.click();
    	
    	
    }
    
    public void verifySamsung()
    {
    	if (sam.getText().contains("samsung"))
    			{
    		System.out.println("Success");
    		
    			}
    	
    }
    
}