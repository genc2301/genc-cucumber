package cogni.genc.bdd.global;

import java.util.Properties;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {
	
	static WebDriver driver;
    static Properties p;
	
    public static Properties getProperties() throws IOException
	{		 
        FileReader file=new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\Config.properties");   		
        p=new Properties();
		p.load(file);
		return p;
	}
    
    
	public static WebDriver launchBrowser() throws IOException {
		
		String browserName = getProperties().getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}	
		
		return driver;
		
	}
	
	public static WebDriver getDriver() {
		return driver;
	}

}
