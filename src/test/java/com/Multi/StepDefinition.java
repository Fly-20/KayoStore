package com.Multi;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class StepDefinition {

    @Given("^I open the kayo url and select the \"([^\"]*)\" option$")
    public void iOpenTheKayoUrlAndSelectTheOption(String pack) throws Throwable {
        System.setProperty("webdriver.chrome.driver",
                "src\\test\\resources\\executables\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        try {
            String site = "https://shop.kayoauto.com";
            driver.navigate().to(site);
            driver.manage().window().maximize();
            Thread.sleep(4000);
            WebElement option = null;
            Thread.sleep(4000);
            System.out.println("NIDHI"+ pack);
            if (pack.equals("1"))
                option = driver.findElement(By.id("template--15828241481911__abf68713-255b-42d1-9221-f1f79d68561a-1-0"));
            if (pack.equals("3"))
                option = driver.findElement(By.id("template--15828241481911__abf68713-255b-42d1-9221-f1f79d68561a-1-1"));
            if (pack.equals("4"))
                option = driver.findElement(By.id("template--15828241481911__abf68713-255b-42d1-9221-f1f79d68561a-1-2"));

            System.out.println("Passed Leve 1");
            JavascriptExecutor js2 = driver;
            Thread.sleep(4000);

            js2.executeScript("arguments[0].click();", option);

            WebElement element = driver.findElement(By.id("websitetest"));
            Thread.sleep(4000);

            JavascriptExecutor js = driver;
            js.executeScript("arguments[0].click();", element);
            Thread.sleep(4000);
            WebElement webElement = driver.findElement(By.xpath("//button[@id = 'CartDrawer-Checkout']"));
            System.out.println("DDD" + webElement.getText());
                        Thread.sleep(4000);

            Actions actions = new Actions(driver);
            actions.moveToElement(webElement).click().build().perform();
            Thread.sleep(4000);
            System.out.println("Passed Leve 2");
            WebElement email = driver.findElement(By.id("checkout_email"));
            WebElement firstName = driver.findElement(By.id("checkout_shipping_address_first_name"));
            WebElement lastName = driver.findElement(By.id("checkout_shipping_address_last_name"));
            WebElement address = driver.findElement(By.id("checkout_shipping_address_address1"));
            WebElement city = driver.findElement(By.id("checkout_shipping_address_city"));
            WebElement zipCode = driver.findElement(By.id("checkout_shipping_address_zip"));
            WebElement phone = driver.findElement(By.id("checkout_shipping_address_phone"));
            WebElement firstContinue = driver.findElement(By.id("continue_button"));

            email.sendKeys("dev@fly-20.com");
            firstName.sendKeys("TestFirst Name");
            lastName.sendKeys("LastName");
            address.sendKeys("123 William Street");
            city.sendKeys("New York");
            zipCode.sendKeys("10038");
            phone.sendKeys("0");
            firstContinue.click();
            Thread.sleep(3000);
//            WebElement secondContinue = driver.findElement(By.id("continue_button"));
//            Thread.sleep(3000);
//            secondContinue.click();
        }
        finally {
            driver.close();

        }
    }


}
