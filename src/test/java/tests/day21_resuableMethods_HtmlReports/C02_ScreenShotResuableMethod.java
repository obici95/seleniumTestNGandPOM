package tests.day21_resuableMethods_HtmlReports;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class C02_ScreenShotResuableMethod {
    @Test
    public void test01() throws IOException {
        // amazon sayfasina gidip fotografini cekelim
       Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        ReusableMethods.getScreenshot("amazonTUmSayfa");
    }
}
