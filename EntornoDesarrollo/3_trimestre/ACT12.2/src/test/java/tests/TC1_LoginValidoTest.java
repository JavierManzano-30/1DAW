package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;

public class TC1_LoginValidoTest {

    private WebDriver driver;

    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @Test
    public void loginValido() {
        try {
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

            // Esperar que aparezca el campo de usuario
            Thread.sleep(2000);

            WebElement username = driver.findElement(By.name("username"));
            WebElement password = driver.findElement(By.name("password"));
            WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));

            username.sendKeys("Admin");
            password.sendKeys("admin123");
            loginButton.click();

            // Verificar que se muestra "Dashboard"
            Thread.sleep(3000);
            WebElement dashboardText = driver.findElement(By.xpath("//h6[text()='Dashboard']"));
            Assert.assertTrue(dashboardText.isDisplayed(), "El login no fue exitoso");

        } catch (Exception e) {
            tomarCapturaPantalla("error_login");
            Assert.fail("Error en el test de login válido: " + e.getMessage());
        }
    }

    public void tomarCapturaPantalla(String nombre) {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(src, new File("./screenshots/" + nombre + ".png"));
        } catch (IOException e) {
            System.out.println("Error al guardar la captura: " + e.getMessage());
        }
    }

    @AfterClass
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
