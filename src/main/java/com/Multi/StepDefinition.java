package com.Multi;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;
public class StepDefinition {



    @Given("^I click on Your Profile option$")
    public void iClickOnYourProfileOption() throws IOException, InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        String site="https://shop.kayoauto.com";
        System.setProperty("webdriver.chrome.driver",
                "src\\main\\resources\\executables\\chromedriver.exe");
        driver.navigate().to(site);        driver.manage().window().maximize();

        Thread.sleep(4000);

        WebElement element = driver.findElement(By.xpath("//button[@id = 'websitetest']"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", element);
        Thread.sleep(4000);

        WebElement webElement = driver.findElement(By.xpath("//button[@id = 'CartDrawer-Checkout']"));
        System.out.println("DDD"+webElement.getText());
        Actions actions = new Actions(driver);
        actions.moveToElement(webElement).click().build().perform();
        Thread.sleep(4000);
        WebElement email=driver.findElement(By.id("checkout_email"));
        WebElement firstName=driver.findElement(By.id("checkout_shipping_address_first_name"));
        WebElement lastName=driver.findElement(By.id("checkout_shipping_address_last_name"));
        WebElement address=driver.findElement(By.id("checkout_shipping_address_address1"));
        WebElement city=driver.findElement(By.id("checkout_shipping_address_city"));
        WebElement zipCode=driver.findElement(By.id("checkout_shipping_address_zip"));
        WebElement phone=driver.findElement(By.id("checkout_shipping_address_phone"));
        WebElement firstContinue =driver.findElement(By.id("continue_button"));

        email.sendKeys("dev@fly-20.com");
        firstName.sendKeys("TestFirst Name");
        lastName.sendKeys("LastName");
        address.sendKeys("123 William Street");
        city.sendKeys("New York");
        zipCode.sendKeys("10038");
        phone.sendKeys("0");
        firstContinue.click();
        Thread.sleep(3000);
        WebElement secondContinue =driver.findElement(By.id("continue_button"));
        Thread.sleep(3000);
        secondContinue.click();
        System.out.println("HEL");




    }

    @When("^I key details$")
    public void iKeyDetails() {
//        https://shop.kayoauto.com/61055566007/checkouts/069c6756c8d4eb3c33fd6546d4bd7aa1
    }

//    @Given("^I perform this activity$")
//    public void iPerformThisActivity() throws InterruptedException {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter your code: ");
//        String code = scanner.nextLine();
//        String site="https://8bfbb5.myshopify.com/admin";
//        System.setProperty("webdriver.chrome.driver",
//                "src\\main\\resources\\executables\\chromedriver.exe");
//        ChromeDriver driver = new ChromeDriver();
//        driver.navigate().to(site);
//        driver.manage().window().maximize();
//
//
//        WebElement username=driver.findElement(By.id("account_email"));
//
//        WebElement login=driver.findElement(By.name("commit"));
//        username.sendKeys("project@fly-20.com");
//        Thread.sleep(10000);
//        login.click();
//        Thread.sleep(10000);
//        WebElement password=driver.findElement(By.id("account_password"));
//        password.sendKeys("Golumolu.70");
//        WebElement login2=driver.findElement(By.name("commit"));
//
//        Thread.sleep(5000);
//        login2.click();
////        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter your code: ");
////        String code = scanner.nextLine();
//        WebElement TFA=driver.findElement(By.id("account_tfa_code"));
//        Thread.sleep(3000);
//
//        TFA.sendKeys(code);
//        WebElement login3=driver.findElement(By.name("commit"));
//        login3.click();
////
////        WebElement email = driver.findElement(By.cssSelector("#account_email"));
////        email.sendKeys("project@fly-20.com");
////        Thread.sleep(4000);
////       WebElement webElement= driver.findElement(By.cssSelector("button.ui-button"));
////        JavascriptExecutor executor = (JavascriptExecutor) driver;
////        executor.executeScript("arguments[0].click();", webElement);
////        webElement.click();
////        System.out.println();
////        driver.findElement(By.cssSelector(".Polaris-ButtonGroup>div:nth-child(2)")).click();
//////        driver.findElement()
//    }



    @Given("^I open the kayo url and select the \"([^\"]*)\" option$")
    public void iOpenTheKayoUrlAndSelectTheOption(String pack) throws Throwable {
        System.setProperty("webdriver.chrome.driver",
                "src\\main\\resources\\executables\\chromedriver.exe");
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
            WebElement secondContinue = driver.findElement(By.id("continue_button"));
            Thread.sleep(3000);
            secondContinue.click();
        }
        finally {
            driver.close();

        }
    }


}
