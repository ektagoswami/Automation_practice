package Practicecode;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class practicedataprovider {
	
	@Test(dataProvider="datasupplier")
	public void valuechange(String sensorname, String sensorevent, String sensorcriticality , String unit, int anomalyThreshold) {
		
	System.out.println("sensor name is" + sensorname);	
	System.out.println("sensorevent name is" + sensorevent);	
	System.out.println("sensorcriticality name is" + sensorcriticality);	
	System.out.println("unit  is" + unit);		
	System.out.println("anomaly threshold  is" + anomalyThreshold);		
		
	}
	
     @DataProvider(name="datasupplier")
     public Object[][] dataprovmethod(){
    	 
    	 return new Object[][] {{"mysensor","Tempaerature","High","C",80}};
     }
	
	
	

}
