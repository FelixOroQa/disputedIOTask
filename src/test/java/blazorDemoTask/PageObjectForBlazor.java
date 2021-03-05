package blazorDemoTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObjectForBlazor {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public PageObjectForBlazor(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 20);
        PageFactory.initElements(driver, this);
    }
}
