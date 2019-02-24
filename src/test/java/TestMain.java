import framework.BrowserFactory;
import framework.PropertiesManager;
import org.junit.Assert;
import pages.RegisterFormStepOne;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import pages.*;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestMain {
    @Before
    public void setUp() throws IOException {
        BrowserFactory.Initialize();
        BrowserFactory.getInstance().manage().window().maximize();
        BrowserFactory.getInstance().navigate().to(PropertiesManager.getUrl());
        BrowserFactory.getInstance().manage().timeouts().implicitlyWait(PropertiesManager.getTimeDelayImp(), TimeUnit.SECONDS);
    }
    @Test
    public void testNumberOne() {
        RegisterFormStepOne.fillTheDataFirstStep();
        RegisterFormStepOne.goToTheStepTwo();
        RegistrationFormStepTwo.selectBuiisinessArea();
        RegistrationFormStepTwo.fillTheCommnets();
        RegistrationFormStepTwo.goToTheStepThree();
        RegistrationFormStepThree.selectCoumtry();
        RegistrationFormStepThree.fillAddressPostalCity();
        RegistrationFormStepThree.selectState();
        RegistrationFormStepThree.goToTheStepFour();
        RegisterFormStepFour.fillPasswordAndConfrimPassword();
        RegisterFormStepFour.checkConfirmTermsOfUse();
        RegisterFormStepFour.waitCapthaAndSubmit();
    }
        @AfterClass
        public static void tearDown(){
        BrowserFactory.exit();

    }
}
