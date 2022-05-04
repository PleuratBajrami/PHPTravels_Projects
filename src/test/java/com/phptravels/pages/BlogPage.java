package com.phptravels.pages;

import com.phptravels.utilities.ConfigurationReader;
import com.phptravels.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class BlogPage {

    public BlogPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void verifyBlogPage(){
        Driver.getDriver().get(ConfigurationReader.getProperty("siteurl"));
        String expectedResult = "The perfect Blogging";

        @FindBy(xpath = "//h2[.='The perfect Blogging Module']")
        public WebElement actualResult;

        Assert.assertEquals(actualResult,expectedResult);

    }

}
