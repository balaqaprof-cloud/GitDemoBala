package newpackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MySecondClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
		driver.get("http://demo.guru99.com/test/newtours/");
		String expectedTitle= "Welcome: Mercury Tours1";
		String actualTitle= driver.getTitle();
		
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
		System.out.println("Execution completed");	
        driver.quit();
	}

}
