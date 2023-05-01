package com.Multi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class TestingClass {

    public static void main(String[] args) throws InterruptedException {
        String site="https://8bfbb5.myshopify.com/admin";
        System.setProperty("webdriver.chrome.driver",
                "src\\main\\resources\\executables\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.navigate().to(site);
        driver.manage().window().maximize();


        WebElement username=driver.findElement(By.id("account_email"));

        WebElement login=driver.findElement(By.name("commit"));
        username.sendKeys("project@fly-20.com");
        Thread.sleep(10000);
        login.click();
        Thread.sleep(10000);
        WebElement password=driver.findElement(By.id("account_password"));
        password.sendKeys("Golumolu.70");
        WebElement login2=driver.findElement(By.name("commit"));

        Thread.sleep(5000);
        login2.click();
        Scanner scanner = new Scanner(System.in);
        WebElement TFA=driver.findElement(By.id("account_tfa_code"));
        System.out.print("Enter your code: ");
        String code = scanner.nextLine();
        Thread.sleep(3000);

        TFA.sendKeys(code);
        WebElement login3=driver.findElement(By.name("commit"));
        login3.click();

        System.out.println("");
        WebElement apps=driver.findElement(By.cssSelector("ul.qVH5c li:nth-child(2)"));
        Thread.sleep(3000);
        apps.click();
        Thread.sleep(3000);
        WebElement scApp=driver.findElement(By.cssSelector("ul.akthT li:nth-child(1)"));
        scApp.click();
        Thread.sleep(3000);
        WebElement workflows=driver.findElement(By.cssSelector("ul.Polaris-Navigation__List_yj3nl li:nth-child(1)"));
        workflows.click();
        Thread.sleep(3000);

        WebElement copyButton = driver.findElement(By.cssSelector("ul.Polaris-ResourceList li:first-child div.Polaris-ButtonGroup>:nth-child(2)"));
        Thread.sleep(3000);

        copyButton.click();

    }
}
