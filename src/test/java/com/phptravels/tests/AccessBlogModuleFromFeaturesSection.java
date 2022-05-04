package com.phptravels.tests;

import com.phptravels.pages.DashboardPage;
import com.phptravels.utilities.ConfigurationReader;
import com.phptravels.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AccessBlogModuleFromFeaturesSection {

    DashboardPage dashboardPage = new DashboardPage();

    @Test
    public void AccessBlogModule(){
        Driver.getDriver().get(ConfigurationReader.getProperty("siteurl"));
        dashboardPage.featuresSection.click();
        dashboardPage.blogModule.click();

        Assert

    }

}
