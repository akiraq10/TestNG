import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TryLaunchBrowser {
    public static void main(String[] args) {
        WebDriver driver;

        String path= System.getProperty("user.dir");
       String ffDriverPath=path+"//geckodriver.exe";
        System.getProperty("webdriver.gecko.driver",ffDriverPath);

        driver=new FirefoxDriver();
        driver.manage().window().maximize();

    }
}
