package _Tests_Geico;

import BaseAPI.BaseAPI_URL_BY_TEST;
import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Geico_StartQuote extends BaseAPI_URL_BY_TEST {



    @Parameters("url")
    @Test(enabled = true)
    public void User_Can_Find_CarInsurance_Quote_By_Zipcode_From_HomePage(String url) throws InterruptedException {

        //open the geico.com
        driver.get(url);

        //verify url

        //verify homepage

        //enter zipcode
        typeByID("zip","22042");
        //wait(6);
        sleepFor(10);
        //click 'start quote'
        click(By.id("submitButton"));
        sleepFor(5);



    }

    @Parameters("url")
    @Test(enabled = false)
    public void User_Can_Find_HomeInsurance_quote_from_SiteSearch_Page(String url) {

        driver.get(url);


        //verify url

        //verify site search page

        //select "Home" from 'Start your free quote feature'

        //enter zipcode


        //click 'Start home quote'



    }
}
