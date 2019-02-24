package pages;

import framework.BrowserFactory;
import framework.PropertiesManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegistrationFormStepThree {
    private static final WebElement COUNTRYBUTTONLOCATOR = BrowserFactory.getInstance().findElement(By.id("DataViewModel.CountryId_B-1"));
    private static final WebElement STATEBUTTONLOCATOR = BrowserFactory.getInstance().findElement(By.id("DataViewModel.StateCode_I"));
    private static final WebElement ADDRESSLOCATOR = BrowserFactory.getInstance().findElement(By.id("DataViewModel.Address_I"));
    private static final WebElement POSTALLOCATOR = BrowserFactory.getInstance().findElement(By.id("DataViewModel.PostalCode_I"));
    private static final WebElement CITYLOCATOR = BrowserFactory.getInstance().findElement(By.id("DataViewModel.City_I"));
    private static final WebElement TONEXTSTEPFOURBUTTONLOCATOR = BrowserFactory.getInstance().findElement(By.className("mybtn-next"));
    private static final String STATELOCATORSTRING = "//*[@class='dxeListBoxItem_CoralMSP' and contains(text(),'%s')]";
    public static WebElement getCountryXpath(String country) {
        return BrowserFactory.getInstance().findElement(By.xpath(String.format(STATELOCATORSTRING, country)));
    }
    public static WebElement getStateXpath(String state) {
        return BrowserFactory.getInstance().findElement(By.xpath(String.format(STATELOCATORSTRING, state)));
    }
    public static void selectCoumtry()  {
        COUNTRYBUTTONLOCATOR.click();
        getCountryXpath(PropertiesManager.getCountry()).click();
    }
    public static void fillAddressPostalCity(){
        CITYLOCATOR.click();
        CITYLOCATOR.sendKeys(PropertiesManager.getCity());
        ADDRESSLOCATOR.sendKeys(PropertiesManager.getAddress());
        POSTALLOCATOR.sendKeys(PropertiesManager.getPostal());
    }
    public static void selectState() {
        STATEBUTTONLOCATOR.click();
        getStateXpath(PropertiesManager.getState()).click();
    }
    public static void goToTheStepFour(){
        TONEXTSTEPFOURBUTTONLOCATOR.click();
    }
    }
