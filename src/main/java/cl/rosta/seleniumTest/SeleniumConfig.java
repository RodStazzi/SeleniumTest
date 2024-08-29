package cl.rosta.seleniumTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SeleniumConfig {

//    @Bean
//    public WebDriver webDriver() {
//        System.setProperty("webdriver.chrome.driver", 
//        		"C:/Users/Rodolfo Stazzi/workspace-student/SeleniumTest1/chromedriver-win64/chromedriver.exe");
//        return new ChromeDriver();
//    }
    
    @Bean
    public WebDriver webDriver() {
        System.setProperty("webdriver.edge.driver", 
        		"C:/Users/Rodolfo Stazzi/workspace-student/SeleniumTest1/edgedriver_win64/msedgedriver.exe");
        return new EdgeDriver();
    }
}


//public class BrowserTest {
//
//    public static WebDriver getDriver(String browser) {
//        switch (browser.toLowerCase()) {
//            case "chrome":
//                System.setProperty("webdriver.chrome.driver", "ruta/al/chromedriver.exe");
//                return new ChromeDriver();
//            case "firefox":
//                System.setProperty("webdriver.gecko.driver", "ruta/al/geckodriver.exe");
//                return new FirefoxDriver();
//            case "edge":
//                System.setProperty("webdriver.edge.driver", "ruta/al/msedgedriver.exe");
//                return new EdgeDriver();
//            case "safari":
//                return new SafariDriver();
//            case "opera":
//                System.setProperty("webdriver.opera.driver", "ruta/al/operadriver.exe");
//                return new OperaDriver();
//            default:
//                throw new IllegalArgumentException("Navegador no soportado: " + browser);
//        }
//    }
//
//    public static void main(String[] args) {
//        WebDriver driver = getDriver("chrome");
//        driver.get("https://www.google.com");
//        // Realiza tus pruebas aquí
//        driver.quit();
//    }
//}