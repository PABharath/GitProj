package Testng;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day1 {
	
	
	  @Test(dataProvider = "getdata")
	    public void alldata(String name) {
	        System.out.println(name);
	    }

	    @DataProvider
	    @Test
	    public Object[][] getdata() {
	        Object[][] data = {{"Hello"}, {"Hi"}, {"I love u"}};
	        return data;
	    }

}
