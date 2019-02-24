package pages;
import framework.BrowserFactory;
import framework.PropertiesManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterFormStepOne {
    private static final WebElement SALUTATIONTABLEOPENLOCATOR = BrowserFactory.getInstance().findElement(By.id("DataViewModel.Prefix_B-1"));
    private static final WebElement SALUTATIONLOCATORMR = BrowserFactory.getInstance().findElement(By.id("DataViewModel.Prefix_DDD_L_LBI1T0"));
    private static final WebElement SALUTATIONLOCATORMRS = BrowserFactory.getInstance().findElement(By.id("DataViewModel.Prefix_DDD_L_LBI2T0"));
    private static final WebElement SALUTATIONLOCATORMS = BrowserFactory.getInstance().findElement(By.id("DataViewModel.Prefix_DDD_L_LBI3T0"));
    private static final WebElement SALUTATIONLOCATORDR = BrowserFactory.getInstance().findElement(By.id("DataViewModel.Prefix_DDD_L_LBI4T0"));
    private static final WebElement FIRSTNAMELOCATOR = BrowserFactory.getInstance().findElement(By.id("DataViewModel.FirstName_I"));
    private static final WebElement MIDDLENAMELOCATOR = BrowserFactory.getInstance().findElement(By.id("DataViewModel.MiddleName_I"));
    private static final WebElement LASTNAMELOCATOR = BrowserFactory.getInstance().findElement(By.id("DataViewModel.LastName_I"));
    private static final WebElement COMPANYNAMELOCATOR = BrowserFactory.getInstance().findElement(By.id("DataViewModel.Company_I"));
    private static final WebElement TITLELOCATOR = BrowserFactory.getInstance().findElement(By.id("DataViewModel.Title_I"));
    private static final WebElement EMAILLOCATOR = BrowserFactory.getInstance().findElement(By.id("DataViewModel.EmailVerify_I"));
    private static final WebElement CONFIRMEMAILLOCATOR = BrowserFactory.getInstance().findElement(By.id("DataViewModel.Email_I"));
    private static final WebElement PHONELOCATOR = BrowserFactory.getInstance().findElement(By.id("DataViewModel.Phone_I"));
    private static final WebElement FAXLOCATOR = BrowserFactory.getInstance().findElement(By.id("DataViewModel.Fax_I"));
    private static final WebElement MOBILEPHONELOCATOR = BrowserFactory.getInstance().findElement(By.id("DataViewModel.Mobile_I"));
    private static final WebElement TONEXTSTEPTWOBUTTONLOCATOR = BrowserFactory.getInstance().findElement(By.id("btnNext"));

    public static void fillTheDataFirstStep(){
        SALUTATIONTABLEOPENLOCATOR.click();
        if (PropertiesManager.getSalutation().equals("Mr")){ SALUTATIONLOCATORMR.click(); }
        if (PropertiesManager.getSalutation().equals("Mrs")){ SALUTATIONLOCATORMRS.click();}
        if (PropertiesManager.getSalutation().equals("Ms")){ SALUTATIONLOCATORMS.click();}
        if (PropertiesManager.getSalutation().equals("Dr")){ SALUTATIONLOCATORDR.click();}
        FIRSTNAMELOCATOR.click();
        FIRSTNAMELOCATOR.sendKeys(PropertiesManager.getFirstname());
        MIDDLENAMELOCATOR.sendKeys(PropertiesManager.getMiddlename());
        LASTNAMELOCATOR.sendKeys(PropertiesManager.getLastname());
        COMPANYNAMELOCATOR.sendKeys(PropertiesManager.getCompanyname());
        TITLELOCATOR.sendKeys(PropertiesManager.getTitle());
        EMAILLOCATOR.sendKeys(PropertiesManager.getEmail());
        CONFIRMEMAILLOCATOR.sendKeys(PropertiesManager.getEmail());
        PHONELOCATOR.clear();
        PHONELOCATOR.sendKeys(PropertiesManager.getPhone());
        FAXLOCATOR.clear();
        FAXLOCATOR.sendKeys(PropertiesManager.getFax());
        MOBILEPHONELOCATOR.clear();
        MOBILEPHONELOCATOR.sendKeys(PropertiesManager.getMobilePhone());
    }
    public static void goToTheStepTwo(){
        TONEXTSTEPTWOBUTTONLOCATOR.click();
    }

}
