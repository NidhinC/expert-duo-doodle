package demoprojectpackage;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class AmazonAutomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.firefox.marionette", "C:/geckodriver.exe");
WebDriver driver= new FirefoxDriver ();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.get("https://www.amazon.in/");
driver.findElement(By.partialLinkText("Hello. Sign in")).click();
driver.findElement(By.id("ap_email")).sendKeys("nidhincn@gmail.com");
driver.findElement(By.id("continue")).click();
driver.findElement(By.id("ap_password")).sendKeys("nidhin@04");
driver.findElement(By.id("signInSubmit")).click();
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mi band 3", Keys.ENTER);
String winHandleBefore = driver.getWindowHandle();
driver.findElement(By.xpath("//img[@alt='Mi Band 3 (Black)']")).click();
for(String winHandle : driver.getWindowHandles()){
    driver.switchTo().window(winHandle);
}
//Thread.sleep(1000);
driver.findElement(By.id("buy-now-button")).click();
Thread.sleep(500);
driver.findElement(By.id("pp-lo-130")).click();
Thread.sleep(500);
driver.findElement(By.xpath("//input[@aria-labelledby='pp-0B-138-announce']")).click();
Thread.sleep(500);
/*String actualtext=driver.findElement(By.className("a-size-medium s-inline s-access-title a-text-normal")).getText();
String expectedtext="Mi Band 3 (Black)";
if(actualtext==expectedtext)
{
	driver.findElement(By.className("a-size-medium s-inline s-access-title a-text-normal")).click();
}
else
	System.out.println("Search doesn't match");*/
//Thread.sleep(5000);
driver.quit();
	}


}
