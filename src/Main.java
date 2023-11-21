import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args){
                System.out.println("First script!");
                ChromeDriver driver = new ChromeDriver();
                driver.get("https://www.google.com");
                WebElement email = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
                email.sendKeys("google");
                email.sendKeys(Keys.RETURN);
            }
        }
