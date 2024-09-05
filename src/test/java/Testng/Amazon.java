package Testng;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amazon {
	
	@Test

	public void vishnu() {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=11908952027623641059&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9300156&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
		
		List<WebElement> alltags=driver.findElements(By.tagName("a"));
System.out.println(alltags.size());

WebElement footer=driver.findElement(By.id("navFooter"));
System.out.println(footer.findElements(By.tagName("a")).size());

WebElement insidefooter=footer.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul"));
System.out.println(insidefooter.findElements(By.tagName("a")).size());

for(int i=0;i<insidefooter.findElements(By.tagName("a")).size();i++) {
	
	String submit=Keys.chord(Keys.CONTROL,Keys.ENTER);
	insidefooter.findElements(By.tagName("a")).get(i).sendKeys(submit);
}

Set<String> alltabs=driver.getWindowHandles();
Iterator<String> alldata=alltabs.iterator();

while(alldata.hasNext()) {
	driver.switchTo().window(alldata.next());
	System.out.println(driver.getTitle());
}

	}

}
