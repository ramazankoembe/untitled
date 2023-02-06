package test;

import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PlayWebPage {


    @Test

    public void Play() throws InterruptedException {


        WebDriver driver = new EdgeDriver();
        Thread.sleep(1000);

        driver.get("https://infotechacademy.eu/");
        Thread.sleep(1000);

        Dimension d = new Dimension(300,300);
        Thread.sleep(1000);

        driver.manage().window().setSize(d);
        Thread.sleep(1000);

        Point p = new Point(150,150);
        Thread.sleep(1000);

        driver.manage().window().setPosition(p);
        Thread.sleep(1000);

        driver.manage().window().maximize();
        Thread.sleep(1000);

        driver.manage().window().minimize();
        Thread.sleep(1000);

        driver.manage().window().fullscreen();
        Thread.sleep(1000);

        driver.navigate().to("https://www.google.de/");
        Thread.sleep(1000);

        driver.navigate().back();
        Thread.sleep(1000);

        driver.navigate().refresh();
        Thread.sleep(1000);


        driver.close();



    }
}
