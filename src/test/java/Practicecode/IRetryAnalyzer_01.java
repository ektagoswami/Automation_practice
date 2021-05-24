package Practicecode;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class IRetryAnalyzer_01 implements IRetryAnalyzer {

	private int retrycount=0;
	private static final int retrylimit = 4;
	
	public boolean retry(ITestResult result) {
		
		if(!result.isSuccess()) {
			if(retrycount<retrylimit) {
				retrycount++;
				return true;
			}else {
				result.setStatus(ITestResult.FAILURE);
			}
		}else {
			result.setStatus(ITestResult.SUCCESS);
		}
		return false;
	}

}