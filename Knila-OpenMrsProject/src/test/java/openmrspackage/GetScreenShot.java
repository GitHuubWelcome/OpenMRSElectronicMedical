package openmrspackage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
public class GetScreenShot {

	  public static String capture(WebDriver driver,String screenShotName) throws IOException
	    {
	        TakesScreenshot ts = (TakesScreenshot)driver;
	        File source = ts.getScreenshotAs(OutputType.FILE);
	        String dest = System.getProperty("D:\\MavenProject") +"\\ErrorScreenshots\\"+screenShotName+".png";
	        File destination = new File(dest);
	        FileHandler.copy(source, destination);              
	        return dest;
	    }


	}


