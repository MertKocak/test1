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

        //Test sayfasını açmak için
        driver.get("https://demoqa.com/text-box");

        //Full Name kısmına adımızı girmek için
        WebElement FullName = driver.findElement(By.id("userName"));
        FullName.click();
        FullName.sendKeys("Mert Koçak");

        //E-mail kısmına e-mail girmek için
        WebElement email = driver.findElement(By.id("userEmail"));
        email.click();
        email.sendKeys("mertkocak.2811@gmail.com");

        //Anlık Adres kısmına adresimizi girmek için
        WebElement address1 = driver.findElement(By.id("currentAddress"));
        address1.click();
        address1.sendKeys("İstanbul");

        //Daimi Adres kısmına adresimizi girmek için
        WebElement address2 = driver.findElement(By.id("permanentAddress"));
        address2.click();
        address2.sendKeys("Sivas");

        //"Submit" butonuna tıklamak için
        WebElement loginButton = driver.findElement(By.id("submit"));
        loginButton.click();


    }
}
