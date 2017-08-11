import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;

import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * Created by dmclark on 11/08/17.
 */
public class Test_Autotrader {


    private WebDriver webDriver;

    private FluentWait<WebDriver> wait;
    ExtentTest test;
    static ExtentReports report;
    private Home home;


    @Test
    public void test() throws InterruptedException {
         
        webDriver.navigate().to("http://www.autotrader.co.uk/");

        home.set_postcode("g775bj");
        home.set_new_(false);
        //TimeUnit.SECONDS.sleep(1);
        webDriver.findElement(By.cssSelector("#searchVehicles > div > h1")).click();

        home.set_radius(25);
        home.set_nearly_new(true);

        home.set_used(true);
        home.set_make("voux");
        home.set_model("ins");
        home.set_priceFrom(6000);
        home.set_priceTo(9000);
        //home.set_search();
        TimeUnit.SECONDS.sleep(1);


        //test(1, 2, "test");
    }

    @Test
    public void test_1() {
         
        test(1, 2, "hi");
    }

    @Test
    public void test_2() {
         
        test(1, 2, "hi");
    }

    @Test
    public void test_3() {
         
        test(1, 2, "hi");
    }

    @Test
    public void test_4() {
         
        test(1, 2, "hi");
    }

    @Test
    public void test_5() {
         
        test(1, 2, "hi");
    }

    @Test
    public void test_6() {
         
        test(1, 2, "hi");
    }

    @Test
    public void test_7() {
         
        test(1, 2, "hi");
    }

    @Test
    public void test_8() {
         
        test(1, 2, "hi");
    }

    @Test
    public void test_9() {
         
        test(1, 2, "hi");
    }

    @Test
    public void test_10() {
         
        test(1, 2, "hi");
    }

    public void test_new(String id, boolean z, boolean x, String r) throws InterruptedException {
        
        webDriver.navigate().to("http://www.autotrader.co.uk/");

        home.set_new_(true);

        home.set_nearly_new(false);

        home.set_used(false);

        home.set_search();


        test(1, 2, "test");
    }


    @BeforeClass
    public static void bClass() {
        System.out.println("BeforeClass");

        String reportFilePath = "user_2.html";
        report = new ExtentReports();
        ExtentHtmlReporter extentHtmlReporter = new ExtentHtmlReporter(reportFilePath);
        extentHtmlReporter.config().setReportName("ReportName");
        extentHtmlReporter.config().setDocumentTitle("DocumentTitle");
        report.attachReporter(extentHtmlReporter);
    }


    @Before
    public void bTest() {
        System.out.println("Before");
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        home = PageFactory.initElements(webDriver, Home.class);
        //lodInPage = PageFactory.initElements(webDriver, LodInPage.class);


        wait = new FluentWait<WebDriver>(webDriver)
                .withTimeout(30, SECONDS)
                .pollingEvery(5, SECONDS)
                .ignoring(NoSuchElementException.class);


    }

    @AfterClass
    public static void aClassTest() {
        System.out.println("AfterClass");

        report.flush();

    }

    @After
    public void aTest() {

        System.out.println("After");
        test=null;
        webDriver.quit();

    }


    private void test(int x, int y, String m) {
        test = report.createTest("new " + m);
        test.log(Status.INFO, m);
        if (x == y) {
            test.pass("Pass " + m);
        } else {
            try {
                test.fail("Fail" + m + " : " + x + " : " + y + test.addScreenCaptureFromPath(ScreenShot.take(webDriver, "screenShotName")));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    private void test(String x, String y, String m) {
        test = report.createTest("new " + m);
        test.log(Status.INFO, m);
        if (x.equals(y)) {
            test.pass("Pass " + m);
        } else {
            try {
                test.fail("Fail" + m + " : " + x + " : " + y + test.addScreenCaptureFromPath(ScreenShot.take(webDriver, "screenShotName")));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
