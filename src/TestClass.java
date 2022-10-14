import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C://Users//MERTK//Documents//selenium dependencies//drivers//chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        //Pencereyi tam ekran yapmak için
        driver.manage().window().maximize();

        //Linkedin sayfasını açmak için
        driver.get("https://linkedin.com");

        //Mail kısmına mailimizi girmek için
        WebElement userName = driver.findElement(By.id("session_key"));
        userName.click();
        userName.sendKeys("mertkocak.2811@gmail.com");

        //Password kısmına Password girmek için
        WebElement password = driver.findElement(By.id("session_password"));
        password.click();
        password.sendKeys("***Linkedin Password***");

        //"Oturum aç" butonuna tıklamak için
        WebElement loginButton = driver.findElement(By.className("sign-in-form__submit-button"));
        loginButton.click();
    }
}
