package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

import static org.junit.Assert.assertEquals;

public class HomePage extends BrowserDriver {

    public static String hamburger_menu_xpath ="//*[@id=\"react-burger-menu-btn\"]";

    public static String hamburger_menu_logOut_id = "logout_sidebar_link";

    public static String add_to_cart_btn_sauce_labs_backpack ="//*[@id=\"add-to-cart-sauce-labs-backpack\"]";

    public static String add_to_cart_btn_sauce_labs_bolt_t_shirt ="//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]";

    public static String cart_btn = "//*[@id=\"shopping_cart_container\"]/a";

    public static String checkout_btn = "//*[@id=\"checkout\"]";

    public static String continue_btn = "//*[@id=\"continue\"]";

    public static String finish_btn = "//*[@id=\"finish\"]";

    public static String first_name_text_id = "first-name";

    public static String last_name_text_id = "last-name";

    public static String zip_postal_code_text_id = "postal-code";

    public static String sauce_labs_backpack = "//*[@id=\"item_4_title_link\"]/div";

    public static String sauce_labs_bike_light = "//*[@id=\"item_0_title_link\"]/div";

    public static String sauce_labs_bolt_t_shirt = "//*[@id=\"item_1_title_link\"]/div";

    public static String sauce_labs_fleece_jacket = "//*[@id=\"item_5_title_link\"]/div";

    public static String sauce_labs_onesie = "//*[@id=\"item_2_title_link\"]/div";

    public static String sauce_labs_all_the_things_t_shirt_red = "//*[@id=\"item_3_title_link\"]/div";



    public static void visibility_sauce_labs_backpack() throws InterruptedException {
        Thread.sleep(2000);
        String actual_sauce_labs_backpack = driver.findElement(By.xpath(sauce_labs_backpack)).getText();
        assertEquals("Sauce Labs Backpack" ,actual_sauce_labs_backpack);
    }


    public static void visibility_sauce_labs_bike_light() throws InterruptedException {
        String actual_sauce_labs_bike_light = driver.findElement(By.xpath(sauce_labs_bike_light)).getText();
        assertEquals("Sauce Labs Bike Light" ,actual_sauce_labs_bike_light);
    }


    public static void visibility_sauce_labs_bolt_t_shirt() throws InterruptedException {
        String actual_sauce_labs_bolt_t_shirt = driver.findElement(By.xpath(sauce_labs_bolt_t_shirt)).getText();
        assertEquals("Sauce Labs Bolt T-Shirt" ,actual_sauce_labs_bolt_t_shirt);
    }


    public static void visibility_sauce_labs_fleece_jacket() throws InterruptedException {
        String actual_sauce_labs_fleece_jacket = driver.findElement(By.xpath(sauce_labs_fleece_jacket)).getText();
        assertEquals("Sauce Labs Fleece Jacket" ,actual_sauce_labs_fleece_jacket);
    }


    public static void visibility_sauce_labs_onesie() throws InterruptedException {
        String actual_sauce_labs_onesie = driver.findElement(By.xpath(sauce_labs_onesie)).getText();
        assertEquals("Sauce Labs Onesie" ,actual_sauce_labs_onesie);
    }


    public static void visibility_sauce_labs_all_the_things_t_shirt_red() throws InterruptedException {
        Thread.sleep(2000);
        String actual_sauce_labs_all_the_things_t_shirt_red = driver.findElement(By.xpath(sauce_labs_all_the_things_t_shirt_red)).getText();
        assertEquals("Test.allTheThings() T-Shirt (Red)" ,actual_sauce_labs_all_the_things_t_shirt_red);
    }


    public static void click_hamburger_menu_button() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(hamburger_menu_xpath)).click();
    }


    public static void click_hamburger_menu_logOut_button() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id(hamburger_menu_logOut_id)).click();
    }


    public static void click_add_to_cart_btn_sauce_labs_backpack() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(add_to_cart_btn_sauce_labs_backpack)).click();
    }

    public static void click_add_to_cart_btn_sauce_labs_bolt_t_shirt() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(add_to_cart_btn_sauce_labs_bolt_t_shirt)).click();
    }

    public static void click_cart_btn() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(cart_btn)).click();
    }

    public static void click_checkout_btn() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(checkout_btn)).click();
    }

    public static void click_continue_btn() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(continue_btn)).click();
    }

    public static void click_finish_btn() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(finish_btn)).click();
    }

    public static void sendkeys_first_name() throws InterruptedException {
        driver.findElement(By.id(first_name_text_id)).sendKeys("your_first_name");
        Thread.sleep(2000);
    }

    public static void sendkeys_last_name() throws InterruptedException {
        driver.findElement(By.id(last_name_text_id)).sendKeys("your_last_name");
        Thread.sleep(2000);
    }

    public static void sendkeys_zip_postal_code() throws InterruptedException {
        driver.findElement(By.id(zip_postal_code_text_id)).sendKeys("your_zip_postal_code");
        Thread.sleep(2000);
    }
}
