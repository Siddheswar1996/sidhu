package contact;

import org.testng.annotations.Test;

public class ReadDataFromCmdTest {
	@Test
	public void read() {
		System.out.println("reading data from cmd line");
		String URL=System.getProperty("url");
		String BROWSER=System.getProperty("browser");
		String USERNAME=System.getProperty("username");
		
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
	}
	

}
