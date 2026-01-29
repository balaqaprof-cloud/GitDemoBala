package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//comment the above line and uncomment below line to use Chrome
//import org.openqa.selenium.chrome.ChromeDriver;
public class MyFirstClass {


    public static void main(String[] args) {
        // declaration and instantiation of objects/variables
    	//System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		//WebDriver driver = new ChromeDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");

    	
       //String baseUrl = "http://demo.guru99.com/test/newtours/";
		String baseUrl = "https://www.guru99.com/";
		
        String expectedTitle = "Guru99: Free Online Tutorials and Business Software Reviews";
        String actualTitle = "";
        System.out.println("Expected Title is" +expectedTitle);
        System.out.println("Expected Title should match with Actual Title" );
        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);
    	JavascriptExecutor js = (JavascriptExecutor) driver;	
//        js.executeScript("window.scrollBy(330,0)");
//        // get the actual value of the title
    	
    	 WebElement Element = driver.findElement(By.xpath("//span[@class='kt-blocks-info-box-title'][normalize-space()='SAP']"));

         //This will scroll the page till the element is found		
         js.executeScript("arguments[0].scrollIntoView();", Element);
        try {
			Thread.sleep(5000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
//         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
       
        //close Fire fox
        driver.quit();
    }

}
