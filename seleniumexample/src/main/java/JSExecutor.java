import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

    public class JSExecutor {

        public static void main(String[] args) throws IOException {

            System.setProperty("webdriver.chrome.driver", "/Users/amruthapenigalapati/Downloads/chromedriver");

            WebDriver driver = new ChromeDriver(); //launch chrome

            driver.manage().window().maximize(); //maximize window
            driver.manage().deleteAllCookies(); //delete all the cookies

            //dynamic wait
            driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

            driver.get("https://www.freecrm.com");
            System.out.println("Befor login Title is : " + driver.getTitle());
            driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a/span[2]")).click();
            driver.findElement(By.name("email")).sendKeys("chitramale345@gmail.com");
            driver.findElement(By.name("password")).sendKeys("Intelli321");
            //driver.findElement(By.xpath("//*[@id=\'ui\']/div/div/form/div/div[3]")).click();
            //Thread.sleep(3000);
            WebElement Login = driver.findElement(By.xpath("//*[@id=\'ui\']/div/div/form/div/div[3]"));
            flash(Login, driver);
            //WebElement loginBtn = driver.findElement(By.xpath("//input[contains(@type,'submit')]")); //login button


           // flash(loginBtn, driver); //highlight the element

            drawBorder(Login, driver); //draw a border
            //take screenshot:
            // Take screenshot and store as a file format
            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            // now copy the screenshot to desired location using copyFile //method
            FileUtils.copyFile(src, new File("/Users/amruthapenigalapati/Downloads/seleniumexample/element.png"));

            //generate Alert
            //generateAlert(driver, "There is an issue with Login button on Login Page");

            //click on any element by using JS executor
            clickElementByJS(Login, driver);

            //refresh the page:
            //1. by using selenium:
            driver.navigate().refresh();

            //2. by using JS executor:
            refreshBrowserByJS(driver);

            //get the tile of the page by JS:
            System.out.println(getTitleByJS(driver));

            //get the page text:
            System.out.println(getPageInnerText(driver));

            //scroll page down:
            //scrollPageDown(driver);

            WebElement forgotPwdLink = driver.findElement(By.xpath("//a[contains(text(),'Forgot your password?')]"));
            scrollIntoView(forgotPwdLink, driver);

        }


        public static void flash(WebElement element, WebDriver driver) {
            JavascriptExecutor js = ((JavascriptExecutor) driver);
            String bgcolor  = element.getCssValue("backgroundColor");
            for (int i = 0; i <  10; i++) {
                changeColor("rgb(0,200,0)", element,driver);//1
                changeColor(bgcolor, element,driver);//2
            }
        }
        public static void changeColor(String color, WebElement element, WebDriver driver) {
            JavascriptExecutor js = ((JavascriptExecutor) driver);
            js.executeScript("arguments[0].style.backgroundColor = '"+color+"'",  element);

            try {
                Thread.sleep(50);
            }  catch (InterruptedException e) {
            }
        }


        public static void drawBorder(WebElement element, WebDriver driver){
            JavascriptExecutor js = ((JavascriptExecutor) driver);
            js.executeScript("arguments[0].style.border='3px solid red'", element);
        }

        public static void generateAlert(WebDriver driver, String message){
            JavascriptExecutor js = ((JavascriptExecutor) driver);
            js.executeScript("alert('"+message+"')");

        }

        public static void clickElementByJS(WebElement element, WebDriver driver){
            JavascriptExecutor js = ((JavascriptExecutor) driver);
            js.executeScript("arguments[0].click();", element);

        }

        public static void refreshBrowserByJS(WebDriver driver){
            JavascriptExecutor js = ((JavascriptExecutor) driver);
            js.executeScript("history.go(0)");
        }

        public static String getTitleByJS(WebDriver driver){
            JavascriptExecutor js = ((JavascriptExecutor) driver);
            String title = js.executeScript("return document.title;").toString();
            return title;
        }

        public static String getPageInnerText(WebDriver driver){
            JavascriptExecutor js = ((JavascriptExecutor) driver);
            String pageText = js.executeScript("return document.documentElement.innerText;").toString();
            return pageText;
        }

        public static void scrollPageDown(WebDriver driver){
            JavascriptExecutor js = ((JavascriptExecutor) driver);
            js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        }

        public static void scrollIntoView(WebElement element, WebDriver driver){
            JavascriptExecutor js = ((JavascriptExecutor) driver);
            js.executeScript("arguments[0].scrollIntoView(true);", element);
        }



    }
