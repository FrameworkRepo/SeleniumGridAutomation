package gridConcepts;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class FacebookTest {

	@Test
	public void check() throws MalformedURLException, URISyntaxException {

		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setBrowserName("chrome");

		WebDriver driver = new RemoteWebDriver(new URI("http://192.168.1.4:5555").toURL(), cap);

		driver.get("https://www.facebook.com/");

		System.out.println(driver.getTitle());

		driver.close();
	}
}
