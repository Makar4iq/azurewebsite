package pages;
import framework.BrowserFactory;
import framework.PropertiesManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegistrationFormStepTwo {
    private static final WebElement BUSINESSAREASFINANCECHECKBOX = BrowserFactory.getInstance().findElement(By.id("DataViewModel.ContactAreaId_RB0_I_D"));
    private static final WebElement BUSINESSAREASENGINEERALLCHECKBOX = BrowserFactory.getInstance().findElement(By.id("DataViewModel.ContactAreaId_RB1_I_D"));
    private static final WebElement BUSINESSAREASENGINEERLAUNCHCHECKBOX = BrowserFactory.getInstance().findElement(By.id("DataViewModel.ContactAreaId_RB2_I_D"));
    private static final WebElement BUSINESSAREASENGINEERTRIPCHECKBOX = BrowserFactory.getInstance().findElement(By.id("DataViewModel.ContactAreaId_RB3_I_D"));
    private static final WebElement BUSINESSAREASENGINEERREADONLYCHECKBOX = BrowserFactory.getInstance().findElement(By.id("DataViewModel.ContactAreaId_RB4_I_D"));
    private static final WebElement COMMNETSLOCATOR = BrowserFactory.getInstance().findElement(By.id("DataViewModel.Comment_I"));
    private static final WebElement TONEXTSTEPTHREEBUTTONLOCATOR = BrowserFactory.getInstance().findElement(By.className("mybtn-next"));
    public static void selectBuiisinessArea() {
        if (PropertiesManager.getBuisinessarea().contains("finance")) {
            BUSINESSAREASFINANCECHECKBOX.click();
        }
        if (PropertiesManager.getBuisinessarea().contains("engineerAll")) {
            BUSINESSAREASENGINEERALLCHECKBOX.click();
        }
        if (PropertiesManager.getBuisinessarea().contains("engineerLaunch")) {
            BUSINESSAREASENGINEERLAUNCHCHECKBOX.click();
        }
        if (PropertiesManager.getBuisinessarea().contains("engineerTrip")) {
            BUSINESSAREASENGINEERTRIPCHECKBOX.click();
        }
        if (PropertiesManager.getBuisinessarea().contains("engineerReadOnly")) {
            BUSINESSAREASENGINEERREADONLYCHECKBOX.click();
        }
    }
    public static void fillTheCommnets(){
            COMMNETSLOCATOR.sendKeys(PropertiesManager.getCommentsForStepTwo());
    }

    public static void goToTheStepThree(){
        TONEXTSTEPTHREEBUTTONLOCATOR.click();
    }

}