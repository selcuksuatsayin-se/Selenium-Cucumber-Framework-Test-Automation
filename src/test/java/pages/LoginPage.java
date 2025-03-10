package pages;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.BrowserDriver;

import static org.junit.Assert.assertEquals;

public class LoginPage extends BrowserDriver {


    public static String username_text_id = "user-name";

    public static String password_text_id = "password";

    public static String login_btn_xpath = "//*[@id=\"login-button\"]";

    public static String accepted_usernames_are = "//*[@id=\"login_credentials\"]/h4";

    public static String locked_out_user_warning = "//*[@id=\"login_button_container\"]/div/form/div[3]/h3";

    public static String miss_user_warning = "//*[@id=\"login_button_container\"]/div/form/div[3]/h3";


    public static void open_site() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(2000);
    }


    public static void visibility_accepted_usernames_are() throws InterruptedException {
        Thread.sleep(2000);
        String actual_accepted_usernames_are = driver.findElement(By.xpath(accepted_usernames_are)).getText();
        assertEquals("Accepted usernames are:" , actual_accepted_usernames_are);
    }


    public static void visibility_locked_out_user_warning() throws InterruptedException {
        Thread.sleep(2000);
        String actual_locked_out_user_warning = driver.findElement(By.xpath(locked_out_user_warning)).getText();
        assertEquals("Epic sadface: Sorry, this user has been locked out." , actual_locked_out_user_warning);
    }


    public static void visibility_miss_user_warning() throws InterruptedException {
        Thread.sleep(2000);
        String actual_miss_user_warning = driver.findElement(By.xpath(miss_user_warning)).getText();
        assertEquals("Epic sadface: Username and password do not match any user in this service" , actual_miss_user_warning);
    }

    public static void sendkeys_username() throws InterruptedException {
        driver.findElement(By.id(username_text_id)).sendKeys("standard_user");
        Thread.sleep(2000);
    }

    public static void sendkeys_locked_out_username() throws InterruptedException {
        driver.findElement(By.id(username_text_id)).sendKeys("locked_out_user");
        Thread.sleep(2000);
    }


    public static void sendkeys_miss_user_username() throws InterruptedException {
        driver.findElement(By.id(username_text_id)).sendKeys("miss_user_username");
        Thread.sleep(2000);
    }


    public static void sendkeys_password() throws InterruptedException {
        driver.findElement(By.id(password_text_id)).sendKeys("secret_sauce");
        Thread.sleep(2000);
    }


    public static void click_login_btn() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(login_btn_xpath)).click();
    }

}
