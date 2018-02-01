package AutomatedTests.AutoTests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class InsuranceWebAppPlacanjePolisePrekoPayPalaSuccessScenario {
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
  public void testInsuranceWebAppPlacanjePolisePrekoPayPallaSuccessScenario() throws Exception {
    // open | /osiguravajuceKuce | 
    driver.get(baseUrl + "/osiguravajuceKuce");
    // click | link=Sajt | 
    driver.findElement(By.linkText("Sajt")).click();
    // click | link=Kupi osiguranje | 
    driver.findElement(By.linkText("Kupi osiguranje")).click();
    // click | xpath=(//button[@type='button'])[3] | 
    driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
    // type | css=input.form-control | onezerobeatz@gmail.com
    driver.findElement(By.cssSelector("input.form-control")).clear();
    driver.findElement(By.cssSelector("input.form-control")).sendKeys("onezerobeatz@gmail.com");
    // type | //input[@type='TEXT'] | Sasa
    driver.findElement(By.xpath("//input[@type='TEXT']")).clear();
    driver.findElement(By.xpath("//input[@type='TEXT']")).sendKeys("Sasa");
    // type | xpath=(//input[@type='TEXT'])[2] | Momcilovic
    driver.findElement(By.xpath("(//input[@type='TEXT'])[2]")).clear();
    driver.findElement(By.xpath("(//input[@type='TEXT'])[2]")).sendKeys("Momcilovic");
    // type | //input[@type='NUMBER'] | 9999999999999
    driver.findElement(By.xpath("//input[@type='NUMBER']")).clear();
    driver.findElement(By.xpath("//input[@type='NUMBER']")).sendKeys("9999999999999");
    // type | xpath=(//input[@type='NUMBER'])[2] | 399393
    driver.findElement(By.xpath("(//input[@type='NUMBER'])[2]")).clear();
    driver.findElement(By.xpath("(//input[@type='NUMBER'])[2]")).sendKeys("399393");
    // type | xpath=(//input[@type='TEXT'])[3] | Ad 32
    driver.findElement(By.xpath("(//input[@type='TEXT'])[3]")).clear();
    driver.findElement(By.xpath("(//input[@type='TEXT'])[3]")).sendKeys("Ad 32");
    // type | xpath=(//input[@type='NUMBER'])[3] | 93939393
    driver.findElement(By.xpath("(//input[@type='NUMBER'])[3]")).clear();
    driver.findElement(By.xpath("(//input[@type='NUMBER'])[3]")).sendKeys("93939393");
    // click | //button[2] | 
    driver.findElement(By.xpath("//button[2]")).click();
    // type | css=input.form-control | 2014-12-12
    driver.findElement(By.cssSelector("input.form-control")).clear();
    driver.findElement(By.cssSelector("input.form-control")).sendKeys("2014-12-12");
    // type | xpath=(//input[@type='DATE'])[2] | 2016-12-12
    driver.findElement(By.xpath("(//input[@type='DATE'])[2]")).clear();
    driver.findElement(By.xpath("(//input[@type='DATE'])[2]")).sendKeys("2016-12-12");
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
    // type | //input[@type='NUMBER'] | 2003
    driver.findElement(By.xpath("//input[@type='NUMBER']")).clear();
    driver.findElement(By.xpath("//input[@type='NUMBER']")).sendKeys("2003");
    // type | xpath=(//input[@type='TEXT'])[3] | 3992-3s3232
    driver.findElement(By.xpath("(//input[@type='TEXT'])[3]")).clear();
    driver.findElement(By.xpath("(//input[@type='TEXT'])[3]")).sendKeys("3992-3s3232");
    // type | xpath=(//input[@type='TEXT'])[4] | 3232
    driver.findElement(By.xpath("(//input[@type='TEXT'])[4]")).clear();
    driver.findElement(By.xpath("(//input[@type='TEXT'])[4]")).sendKeys("3232");
    // type | xpath=(//input[@type='TEXT'])[5] | Jovan
    driver.findElement(By.xpath("(//input[@type='TEXT'])[5]")).clear();
    driver.findElement(By.xpath("(//input[@type='TEXT'])[5]")).sendKeys("Jovan");
    // type | xpath=(//input[@type='TEXT'])[6] | Jovanovic
    driver.findElement(By.xpath("(//input[@type='TEXT'])[6]")).clear();
    driver.findElement(By.xpath("(//input[@type='TEXT'])[6]")).sendKeys("Jovanovic");
    // type | xpath=(//input[@type='NUMBER'])[2] | 8888888888888
    driver.findElement(By.xpath("(//input[@type='NUMBER'])[2]")).clear();
    driver.findElement(By.xpath("(//input[@type='NUMBER'])[2]")).sendKeys("8888888888888");
    // click | css=button.btn.btn-success | 
    driver.findElement(By.cssSelector("button.btn.btn-success")).click();
    // click | //p[2]/button | 
    driver.findElement(By.xpath("//p[2]/button")).click();
    // open | /cgi-bin/webscr?cmd=_express-checkout&token=EC-71L57104JG122713J#/checkout/login | 
    //driver.get("https://www.sandbox.paypal.com/cgi-bin/webscr?cmd=_express-checkout&token=EC-9VR44003WW154604V#/checkout/login");
    //driver.get(baseUrl + "/cgi-bin/webscr?cmd=_express-checkout&token=EC-71L57104JG122713J#/checkout/login");
    // assertTitle | PayPal Checkout - Log in | 
    Thread.sleep(12000);
    //if("PayPal Checkout - Log in".equals(driver.getTitle())){
        // type | id=password | varajasupak
        //driver.findElement(By.id("username")).clear();
        //driver.findElement(By.id("username")).sendKeys("darko-tacic.buyer1@gmail.com");
        //driver.findElement(By.id("password")).clear();
        //driver.findElement(By.id("password")).sendKeys("varajasupak");
        // click | id=btnLogin | 
        //driver.findElement(By.id("btnLogin")).click();
    //}
    // click | id=confirmButtonTop | 
    //driver.findElement(By.id("confirmButtonTop")).click();
    //Thread.sleep(1000);
    // assertTitle | InsuranceWebAppClient | 
    //assertEquals("InsuranceWebAppClient", driver.getTitle());
    assertTrue(driver.getTitle().contains("PayPal"));
    
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
