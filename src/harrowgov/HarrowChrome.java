package harrowgov;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HarrowChrome {
    public static void main(String[] args) {


    String baseURl = "https://www.harrow.gov.uk/";
    //selenium .jar file            //driver file path
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
    //webdriver declaration
    WebDriver driver = new ChromeDriver();
    //method to open browser
        driver.get(baseURl);
        driver.manage().window().maximize();//code to manage browser window
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);//code to browser time window
    String title = driver.getTitle();//code to get title for webpage
    boolean verifyTitle = title.equals("Harrow");
    boolean verifyTitleContain = title.contains("Home -Harrow Council");//verify title statment
        System.out.println(verifyTitle);
        System.out.println(verifyTitleContain);
        System.out.println(title);//title print statement

    String pageSource = driver.getPageSource();//page source code to get page source
    // System.out.println(pageSource);
        driver.close();

}


    }



