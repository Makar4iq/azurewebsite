package pages;
import framework.BrowserFactory;
import framework.PropertiesManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterFormStepFour {
    private static final WebElement PASSWORDLOCATOR = BrowserFactory.getInstance().findElement(By.id("DataViewModel.Password_I"));
    private static final WebElement CONFIRMPASSWORDLOCATOR = BrowserFactory.getInstance().findElement(By.id("DataViewModel.ConfirmPassword_I"));
    private static final WebElement CHECKBOXTERMOFUSELOCATOR = BrowserFactory.getInstance().findElement(By.id("DataViewModel.IsReadAccept_S_D"));
    private static final WebElement CAPTHCALOCATOR = BrowserFactory.getInstance().findElement(By.id("DataViewModel.SumCaptcha_I"));
    public static WebElement SUBMITLOCATOR = BrowserFactory.getInstance().findElement(By.id("btnRegister"));
    public static void fillPasswordAndConfrimPassword() {
        PASSWORDLOCATOR.sendKeys(PropertiesManager.getPassword());
        CONFIRMPASSWORDLOCATOR.sendKeys(PropertiesManager.getPassword());
    }
    public static void checkConfirmTermsOfUse() {
        CHECKBOXTERMOFUSELOCATOR.click();
    }
    public static void waitCapthaAndSubmit()   {
        CAPTHCALOCATOR.sendKeys("capthca");
        SUBMITLOCATOR.click();
    }
}


