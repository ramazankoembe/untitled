package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class MvnSearchtest {

@Test
    public void ilkSayfaAcilsi(){

        WebDriver driver = new EdgeDriver();

driver.get("https://mvnrepository.com/");

    WebElement searchBox = driver.findElement(By.xpath("//input[@class='textfield']"));
    searchBox.sendKeys("Selenium");

    WebElement searchButton = driver.findElement(By.xpath("//input[@class='button']"));
    searchButton.click();
}
}
