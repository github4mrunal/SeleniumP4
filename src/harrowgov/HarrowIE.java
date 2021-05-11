package harrowgov;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class HarrowIE {
    public static void main(String[] args) {
        String url = "https://www.harrow.gov.uk/";
        System.setProperty("webdriver.ie.driver","drivers/IEDriverServer.exe");
        //Driver declaration
        WebDriver driver = new InternetExplorerDriver();
        //method to open url
        driver.get(url);
        String title = driver.getTitle();
        boolean verifyTitle = title.equals("Home");
        boolean verifyTitlecontains = title.contains("Home - Harrow Council");
        System.out.println(title);
        System.out.println(verifyTitle);
        System.out.println(verifyTitlecontains);

        driver.manage().window().maximize();//driver to maximise window
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);//driver for time to window to stay open

        String pagesource = driver.getPageSource();
        System.out.println(pagesource);

        driver.close();


    }
}

