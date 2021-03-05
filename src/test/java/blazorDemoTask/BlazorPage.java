package blazorDemoTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BlazorPage extends PageObjectForBlazor {
    //generalDropDown
    @FindBy(css = ".rz-panel-menu > .rz-navigation-item:nth-of-type(5) > .rz-navigation-item-wrapper:nth-of-type(1) .rz-navigation-item-text")
    private WebElement general_dropdown;

    //imageButton
    @FindBy(css = "li:nth-of-type(5) > .rz-navigation-menu > li:nth-of-type(6) > .rz-navigation-item-wrapper > .rz-navigation-item-link > .rz-navigation-item-text")
    private WebElement image_button;

    @FindBy(css = "li:nth-of-type(2) > a[role='tab'] > .rz-tabview-title")
    private WebElement imageSourceButton;

    @FindBy(css = "li:nth-of-type(1) > a[role='tab'] > .rz-tabview-title")
    private WebElement imageExampleButton;

    //notificationButton
    @FindBy(css = "[href='notification'] .rz-navigation-item-text")
    private WebElement notification_button;

    @FindBy(css = "li:nth-of-type(2) > a[role='tab'] > .rz-tabview-title")
    private WebElement notificationSourceButton;

    @FindBy(css = "li:nth-of-type(1) > a[role='tab'] > .rz-tabview-title")
    private WebElement notificationExampleButton;

    //menuButton
    @FindBy(css = "li:nth-of-type(5) > .rz-navigation-menu > li:nth-of-type(13) > .rz-navigation-item-wrapper > .rz-navigation-item-link > .rz-navigation-item-text")
    private WebElement menu_button;

    @FindBy(css = "li:nth-of-type(2) > a[role='tab'] > .rz-tabview-title")
    private WebElement menuSourceButton;

    @FindBy(css = "li:nth-of-type(1) > a[role='tab'] > .rz-tabview-title")
    private WebElement menuExampleButton;

    //UploadButton
    @FindBy(css = "li:nth-of-type(5) > .rz-navigation-menu > li:nth-of-type(17) > .rz-navigation-item-wrapper > .rz-navigation-item-link > .rz-navigation-item-text")
    private WebElement upload_button;

    @FindBy(css = "li:nth-of-type(2) > a[role='tab'] > .rz-tabview-title")
    private WebElement uploadSourceButton;

    @FindBy(css = "li:nth-of-type(1) > a[role='tab'] > .rz-tabview-title")
    private WebElement uploadExampleButton;


    public BlazorPage(WebDriver driver) {super(driver);}

    public BlazorPage clickGeneralDropDown() {
        wait.until(ExpectedConditions.visibilityOf(general_dropdown));
        general_dropdown.click();
        return this;
    }

    public BlazorPage clickImageButton() {
        wait.until(ExpectedConditions.elementToBeClickable(image_button));
        image_button.click();
        wait.until(ExpectedConditions.elementToBeClickable(imageSourceButton));
        imageSourceButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(imageExampleButton));
        imageExampleButton.click();
        return this;
    }

    public BlazorPage clickNotificationButton() {
        wait.until(ExpectedConditions.elementToBeClickable(notification_button));
        notification_button.click();
        wait.until(ExpectedConditions.elementToBeClickable(notificationSourceButton));
        notificationSourceButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(notificationExampleButton));
        notificationExampleButton.click();
        return this;
    }

    public BlazorPage clickMenuButton() {
        wait.until(ExpectedConditions.elementToBeClickable(menu_button));
        menu_button.click();
        wait.until(ExpectedConditions.elementToBeClickable(menuSourceButton));
        menuSourceButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(menuExampleButton));
        menuExampleButton.click();
        return this;
    }

    public BlazorPage clickUploadButton () {
        wait.until(ExpectedConditions.elementToBeClickable(upload_button));
        upload_button.click();
        wait.until(ExpectedConditions.elementToBeClickable(uploadSourceButton));
        uploadSourceButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(uploadExampleButton));
        uploadExampleButton.click();
        return this;
    }
}
