package TestScript;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TC01 
{
	@Test
	void add()
	{
		ExtentReports report= new ExtentReports("./extentreport/report1.html");
		ExtentTest start=report.startTest("TC1");
		start.log(LogStatus.FAIL, "TC IS FAIL");
		report.endTest(start);
		report.flush();
	}

}
