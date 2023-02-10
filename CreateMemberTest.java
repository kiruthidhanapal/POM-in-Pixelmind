package testcase;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.UI.base.ProjectSpecificMethods;
import com.leaftaps.UI.pages.LoginPage;



	public class CreateMemberTest extends ProjectSpecificMethods
	{
		@BeforeTest
		public void setup() {
			 excelFileName="Member";
		}
	 @Test(dataProvider = "getData")
	public void runCreateMemberTest(String uname,String pwd,String email,String firstName,String phonenumber,String personalid) throws InterruptedException
	{


		 LoginPage lp=new LoginPage();

			lp.typeUsername(uname).typePassword(pwd)
			.clickLoginButton()
			.clickMembers()
			.clickAddnewMember()
			.typeEmail(email).typeFirstName(firstName).typePhoneNumbare(phonenumber)
			.typePersonalId(personalid).typeGender().typeBranch().typeWorkspace()
			.clicksubmitButton();





	}




}
