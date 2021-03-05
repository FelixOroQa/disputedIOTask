package blazorDemoTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BlazorPOMTest {
    private static final WebDriver driver = new ChromeDriver();

    @BeforeTest
    public static void main(String[] args) {
        // ChromeDriver location set up in Utils class
        System.setProperty("webdriver.chrome.driver", UtilsForBlazor.CHROME_DRIVER_LOCATION);
    }
    @Test(enabled = true)//(testName = "Navigate Blazor ")
    public static void navigateBlazorSite(){
        // Initialisation
        driver.navigate().to(UtilsForBlazor.BASE_URL);
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, 20);

        BlazorPage blazorPage = new BlazorPage(driver);

        //Click on General
        blazorPage.clickGeneralDropDown();

        //Click on Image
        blazorPage.clickImageButton();

        //Click on NotificationButton
        blazorPage.clickNotificationButton();

        //Click on MenuButton
        blazorPage.clickMenuButton();

        //Click on UploadButton
        blazorPage.clickUploadButton();
    }
    @AfterTest
    public static void cleanUp(){
        driver.manage().deleteAllCookies();
        driver.close();
        driver.quit();
    }
}
