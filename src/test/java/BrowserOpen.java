import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserOpen {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E:\\USERDATA\\Downloads\\chromedriver-test\\chromedriver-win32\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        driver.close();

    }
}
