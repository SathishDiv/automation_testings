import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindowBasedAutomation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win33\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		
		//driver.findElement(By.name("/html/body/form/input[1]"));
		driver.findElement(By.xpath("//*[@id='wdgt-file-upload']")).click();
		
		Runtime.getRuntime().exec("E:\\AutoIT\\FileUpload.exe");
		
		 
	

	
		
	}

}
