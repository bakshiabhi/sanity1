package SeleniumFramework.SeleniumJavaFramework;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String projectpath = System.getProperty("user.dir");
		System.out.println("projectPath : "+projectpath);

		System.setProperty("webdriver.chrome.driver", projectpath+"//drivers//Chrome//chromedriver.exe");
	//	System.setProperty("webdriver.chrome.driver","C://drivers//chrome//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tcs.com/");
		
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}


}