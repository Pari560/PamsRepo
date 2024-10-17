package Pari;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ToReadDataFromDataProvider_Test {
	@Test(dataProvider="data")
	public void readData(String firstName,String lastName,int ID) {
		System.out.println(firstName+"\t"+lastName+"\t"+ID);
	}
	
	@DataProvider
	public Object[][] data(){
		//step1:create a 2-D object array
		Object[][] objArr=new Object[3][3];
		//step2:Store the details
		objArr[0][0]="Aishwarya";
		objArr[0][1]="Rai";
		objArr[0][2]=123;
		objArr[1][0]="Sonu";
		objArr[1][1]="Nigam";
		objArr[1][2]=456;
		objArr[2][0]="Shreya";
		objArr[2][1]="Goshal";
		objArr[2][2]=789;
		//step3:return the data
		return objArr;
	}

}
