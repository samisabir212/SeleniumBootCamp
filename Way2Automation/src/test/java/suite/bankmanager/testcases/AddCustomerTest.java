package suite.bankmanager.testcases;

import java.net.MalformedURLException;
import java.util.Hashtable;

import BaseAPI.BaseAPIs;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import utilities.Constants;
import utilities.DataProviders;
import utilities.DataUtil;
import utilities.ExcelReader;


public class AddCustomerTest extends BaseAPIs {
	
	
	
	@Test(dataProviderClass= DataProviders.class,dataProvider="bankManagerDP")
	public void addCustomerTest(Hashtable<String,String> data) throws MalformedURLException{


		ExcelReader excel = new ExcelReader(Constants.BankManagerSuite_XLPATH);

		DataUtil.checkExecution("BankManagerSuite", "AddCustomerTest", data.get("Runmode"), excel);


		waitForElement(10, By.xpath(".//button[@ng-click='manager()']"));
		clickByXpath(".//button[@ng-click='manager()']");

		clickByXpath(".//button[@ng-click='addCust()']");

		waitForElement(10, By.xpath(".//input[@ng-model='fName']"));
		typeByXpath(".//input[@ng-model='fName']", data.get("firstname"));


	}

	
	

}