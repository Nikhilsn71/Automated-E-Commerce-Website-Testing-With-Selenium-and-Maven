package org.examples.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class FinalProject {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://tutorialsninja.com/demo/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[@title='My Account']")).click();
        driver.findElement(By.xpath("//a[text()='Login']")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
        driver.findElement(By.id("input-email")).sendKeys("test6260@gmail.com");
        driver.findElement(By.id("input-password")).sendKeys("P@ssw0rd!");
        driver.findElement(By.xpath("//input[@value='Login']")).click();

        WebElement LatopNoteMenu = driver.findElement(By.xpath("//a[text()='Laptops & Notebooks']"));
        WebElement AllLaptopNoteLink = driver.findElement(By.xpath("//a[text()='Show All Laptops & Notebooks']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(LatopNoteMenu).click(AllLaptopNoteLink).build().perform();

        driver.findElement(By.xpath("(//span[text()='Add to Cart'])[3]")).click();
        driver.findElement(By.xpath("(//span[text()='Add to Cart'])[4]")).click();
        driver.navigate().refresh();

        driver.findElement(By.xpath("//a[text()='Shopping Cart']")).click();
        String product1 = driver.findElement(By.xpath("(//a[contains(@href,'product_id=44')])[4]")).getText();
        String product2 = driver.findElement(By.xpath("(//a[contains(@href,'product_id=45')])[4]")).getText();

        if(product1.equals("Macbook Air")){
            System.out.println("Product 1 Text is Displayed Correctly");
        }
        else{
            System.out.println("Product 1 Text is not Displayed Correctly");
        }

        if(product2.equals("Macbook Pro")){
            System.out.println("Product 2 Text is Displayed Correctly");
        }
        else{
            System.out.println("Product 2 Text is not Displayed Correctly");
        }

        String TotalAmount = driver.findElement(By.xpath("(//table[@class='table table-bordered'])[3]//tr[2]/td[2]")).getText();
        if(TotalAmount.equals("$3,000.00")){
            System.out.println("Total amount is correct");
        }
        else{
            System.out.println("Total amount is not correct");
        }

        driver.findElement(By.xpath("//a[text()='Checkout']")).click();
        //driver.quit();
    }
}
