package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.UI.base.ProjectSpecificMethods;
import com.leaftaps.UI.pages.LoginPage;

public class LoginTest extends ProjectSpecificMethods{
	@BeforeTest
	public void setup() {
		 excelFileName="Login";
	}
 @Test(dataProvider = "getData")
	public void runLoginTest(String uname,String pwd) {
		LoginPage lp=new LoginPage();
		lp.typeUsername(uname).typePassword(pwd);
	}
}
