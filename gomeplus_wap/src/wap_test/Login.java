package wap_test;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.safari.SafariDriver;

public class Login {
	public WebDriver driver;
	String url1="http://www.gome.com.cn";
	@Before
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", "/Users/moguoyi/bin/chromedriver");
//		System.setProperty("webdriver.safari.driver", "/Users/moguoyi/Library/Safari/Extensions");
//		System.setProperty("webdriver.safari.noinstall", "true");
//		driver=new SafariDriver();
//		driver=new ChromeDriver();
//		driver.manage().window().maximize();
		ChromeOptions opiions=new ChromeOptions();
		opiions.addArguments("--start-maximized");
		driver=new ChromeDriver(opiions);
	}
	@After
	public void tearDown() {
		driver.quit();
		
	}
	@Test
	public void gogouo() throws Exception {
		driver.get(url1+"/");
//		driver.manage().window().maximize(); //将浏览器最大化显示

		Thread.sleep(2000);
		try {
			driver.findElement(By.xpath("//*[@id=\'gome-layer-ad\']/a")).click();
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='keyLabel']")).click();
		////*[@id="keyLabel"]        //*[@id="keyLabel"]
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='keyLabel']")).sendKeys("电磁炉");
		
		
	}

}
