package com.phptravels.tests;

import com.phptravels.pages.DashboardPage;
import com.phptravels.utilities.ConfigurationReader;
import com.phptravels.utilities.Driver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class ContactUs {
    DashboardPage dashboardPage = new DashboardPage ();

    @Test
    public void ContactUsPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty ("siteurl"));
        dashboardPage.contactusicon.click ();

    }

}
