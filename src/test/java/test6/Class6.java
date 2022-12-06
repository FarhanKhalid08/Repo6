package test6;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Class6 {

	
	@Test(dataProvider = "provider")
	public void GetData(String username, String paswword,int ID, String browser) {
		
	}
	
	@DataProvider
	public Object[][] provider(){
		Object[][] data = new Object[3][4];
		
		data[0][0]="Farhan";
		data[0][1]="khalid";
		data[0][2]=123;
		data[0][3]="chrome";
		
		data[1][0]="Farhan1";
		data[1][1]="khalid1";
		data[1][2]=1234;
		data[1][3]="chrome1";
		
		data[2][0]="Farhan2";
		data[2][1]="khalid2";
		data[2][2]=12345;
		data[2][3]="chrome2";
		
		return data;
		
	}
}
