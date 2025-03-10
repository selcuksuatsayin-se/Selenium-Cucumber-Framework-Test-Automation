package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

import static org.junit.Assert.assertEquals;

public class CheckoutPage extends BrowserDriver {


    public static String thank_you_for_your_order = "//*[@id=\"checkout_complete_container\"]/h2";


    public static void visibility_thank_you_for_your_order_page() throws InterruptedException {
        Thread.sleep(2000);
        String actual_thank_you_for_your_order = driver.findElement(By.xpath(thank_you_for_your_order)).getText();
        assertEquals("Thank you for your order!" ,actual_thank_you_for_your_order);
    }

}
