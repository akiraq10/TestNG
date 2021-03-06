import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelectorLearning {
    public static void main(String[] args) {
        WebDriver driver;

        String path= System.getProperty("user.dir");
        String ffDriverPath=path+"//geckodriver.exe";
        System.getProperty("webdriver.gecko.driver",ffDriverPath);

        driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/login");
        WebElement txtUsername=driver.findElement(By.cssSelector("#username"));
        WebElement txtPassed=driver.findElement(By.cssSelector("#password"));

    }
}
