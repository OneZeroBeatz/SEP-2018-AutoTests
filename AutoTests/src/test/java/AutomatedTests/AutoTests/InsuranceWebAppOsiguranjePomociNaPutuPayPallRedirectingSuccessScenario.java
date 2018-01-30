package AutomatedTests.AutoTests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class InsuranceWebAppOsiguranjePomociNaPutuPayPallRedirectingSuccessScenario {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://localhost:1000/";
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testInsuranceWebAppOsiguranjePomociNaPutuPayPallRedirectingSuccessScenario() throws Exception {
    // open | /osiguravajuceKuce | 
    driver.get(baseUrl + "/osiguravajuceKuce");
    // click | link=Sajt | 
    driver.findElement(By.linkText("Sajt")).click();
    // click | link=Kupi osiguranje | 
    driver.findElement(By.linkText("Kupi osiguranje")).click();
    // click | xpath=(//button[@type='button'])[3] | 
    driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
    // type | css=input.form-control | b@b.com
    driver.findElement(By.cssSelector("input.form-control")).clear();
    driver.findElement(By.cssSelector("input.form-control")).sendKeys("b@b.com");
    // type | //input[@type='TEXT'] | Sasa
    driver.findElement(By.xpath("//input[@type='TEXT']")).clear();
    driver.findElement(By.xpath("//input[@type='TEXT']")).sendKeys("Sasa");
    // type | xpath=(//input[@type='TEXT'])[2] | Momcilovic
    driver.findElement(By.xpath("(//input[@type='TEXT'])[2]")).clear();
    driver.findElement(By.xpath("(//input[@type='TEXT'])[2]")).sendKeys("Momcilovic");
    // type | //input[@type='NUMBER'] | 8888888888888
    driver.findElement(By.xpath("//input[@type='NUMBER']")).clear();
    driver.findElement(By.xpath("//input[@type='NUMBER']")).sendKeys("8888888888888");
    // type | xpath=(//input[@type='NUMBER'])[2] | 888
    driver.findElement(By.xpath("(//input[@type='NUMBER'])[2]")).clear();
    driver.findElement(By.xpath("(//input[@type='NUMBER'])[2]")).sendKeys("888");
    // type | xpath=(//input[@type='TEXT'])[3] | 8888
    driver.findElement(By.xpath("(//input[@type='TEXT'])[3]")).clear();
    driver.findElement(By.xpath("(//input[@type='TEXT'])[3]")).sendKeys("8888");
    // type | xpath=(//input[@type='NUMBER'])[3] | 8888888
    driver.findElement(By.xpath("(//input[@type='NUMBER'])[3]")).clear();
    driver.findElement(By.xpath("(//input[@type='NUMBER'])[3]")).sendKeys("8888888");
    // click | //button[2] | 
    driver.findElement(By.xpath("//button[2]")).click();
    // type | css=input.form-control | 2013-11-11
    driver.findElement(By.cssSelector("input.form-control")).clear();
    driver.findElement(By.cssSelector("input.form-control")).sendKeys("2013-11-11");
    // type | xpath=(//input[@type='DATE'])[2] | 2014-11-11
    driver.findElement(By.xpath("(//input[@type='DATE'])[2]")).clear();
    driver.findElement(By.xpath("(//input[@type='DATE'])[2]")).sendKeys("2014-11-11");
    // click | //button[3] | 
    driver.findElement(By.xpath("//button[3]")).click();
    // click | //input[@type='radio'] | 
    driver.findElement(By.xpath("//input[@type='radio']")).click();
    // select | css=select.form-control | label=Do 100 km
    new Select(driver.findElement(By.cssSelector("select.form-control"))).selectByVisibleText("Do 100 km");
    // click | //button[3] | 
    driver.findElement(By.xpath("//button[3]")).click();
    // type | css=input.form-control | Peugeot
    driver.findElement(By.cssSelector("input.form-control")).clear();
    driver.findElement(By.cssSelector("input.form-control")).sendKeys("Peugeot");
    // type | xpath=(//input[@type='TEXT'])[2] | 307
    driver.findElement(By.xpath("(//input[@type='TEXT'])[2]")).clear();
    driver.findElement(By.xpath("(//input[@type='TEXT'])[2]")).sendKeys("307");
    // type | //input[@type='NUMBER'] | 2004
    driver.findElement(By.xpath("//input[@type='NUMBER']")).clear();
    driver.findElement(By.xpath("//input[@type='NUMBER']")).sendKeys("2004");
    // type | xpath=(//input[@type='TEXT'])[3] | NS-305-FS
    driver.findElement(By.xpath("(//input[@type='TEXT'])[3]")).clear();
    driver.findElement(By.xpath("(//input[@type='TEXT'])[3]")).sendKeys("NS-305-FS");
    // type | xpath=(//input[@type='TEXT'])[4] | 39393
    driver.findElement(By.xpath("(//input[@type='TEXT'])[4]")).clear();
    driver.findElement(By.xpath("(//input[@type='TEXT'])[4]")).sendKeys("39393");
    // type | xpath=(//input[@type='TEXT'])[5] | Sasa
    driver.findElement(By.xpath("(//input[@type='TEXT'])[5]")).clear();
    driver.findElement(By.xpath("(//input[@type='TEXT'])[5]")).sendKeys("Sasa");
    // type | xpath=(//input[@type='TEXT'])[6] | Momcilovic
    driver.findElement(By.xpath("(//input[@type='TEXT'])[6]")).clear();
    driver.findElement(By.xpath("(//input[@type='TEXT'])[6]")).sendKeys("Momcilovic");
    // type | xpath=(//input[@type='NUMBER'])[2] | 9999999999999
    driver.findElement(By.xpath("(//input[@type='NUMBER'])[2]")).clear();
    driver.findElement(By.xpath("(//input[@type='NUMBER'])[2]")).sendKeys("9999999999999");
    // click | css=button.btn.btn-success | 
    driver.findElement(By.cssSelector("button.btn.btn-success")).click();
    Thread.sleep(3000);
    // assertText | css=p.bq-tittle | Ukupna cena osiguranja: 850
    assertEquals("Ukupna cena osiguranja: 850", driver.findElement(By.cssSelector("p.bq-tittle")).getText());
    // click | //p[2]/button | 
    driver.findElement(By.xpath("//p[2]/button")).click();
    // assertTitle | PayPal Checkout - Log in | 
    Thread.sleep(3000);
    assertEquals("PayPal Checkout - Log in", driver.getTitle());
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
