package framework;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class PropertiesManager {
    private static String url, browser,salutation, firstname, middlename, buisinessarea, lastname, companyname, title, email, phone, fax, mobilePhone, commentsForStepTwo, state, country, address, postal, city, password;
    private static long timeDelayImp;
    private static String path = "src/test/resources/config.properties";
    public static long getTimeDelayImp() {
        return timeDelayImp;
    }
    public static String getUrl() { return url; }
    public static String getBrowser() { return browser; }
    public static String getSalutation() {return salutation;}
    public static String getFirstname() { return firstname; }
    public static String getMiddlename() { return middlename; }
    public static String getLastname() { return lastname; }
    public static String getCompanyname() { return companyname; }
    public static String getTitle() { return title; }
    public static String getEmail() { return email; }
    public static String getPhone() { return phone; }
    public static String getFax() { return fax; }
    public static String getMobilePhone() { return mobilePhone; }
    public static String getBuisinessarea() { return buisinessarea; }
    public static String getCommentsForStepTwo() { return commentsForStepTwo; }
    public static String getCountry() { return country; }
    public static String getState() { return state; }
    public static String getAddress() {return address;}
    public static String getPostal() {return postal;}
    public static String getCity() {return city;}
    public static String getPassword() {return password;}



    static {
        Properties props = new Properties();
        try {
            props.load(new FileInputStream(new File(path)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        url = props.getProperty("url");
        browser = props.getProperty("browser");
        salutation= props.getProperty("salutation");
        timeDelayImp = Integer.valueOf(props.getProperty("timeDelayImp"));
        firstname = props.getProperty("firstname");
        middlename = props.getProperty("middlename");
        lastname = props.getProperty("lastname");
        companyname = props.getProperty("companyname");
        title = props.getProperty("title");
        email = props.getProperty("email");
        phone = props.getProperty("phone");
        fax = props.getProperty("fax");
        mobilePhone = props.getProperty("mobilePhone");
        buisinessarea = props.getProperty("businessarea");
        commentsForStepTwo = props.getProperty("commentsForStepTwo");
        country = props.getProperty("country");
        state = props.getProperty("state");
        address = props.getProperty("address");
        city = props.getProperty("city");
        postal = props.getProperty("postal");
        password = props.getProperty("password");

    }
}