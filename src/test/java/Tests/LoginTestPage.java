package Tests;

import Pages.OrangeHrmLoginPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import static org.testng.AssertJUnit.assertEquals;

public class LoginTestPage extends BaseTest{

	@Test(dataProvider = "loginTestData")
	public void loginTests(String uName, String password) {

		String actualTitle = new OrangeHrmLoginPage().enterUserName(uName).enterPassWord(password)
				.clickLoginButton().clickLogOut()
				.getTitleOfLoginPage();
		assertEquals("OrangeHRM", actualTitle);
	}

	@DataProvider(name = "loginTestData")
	public Object[][] getDate() throws IOException {

		FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/test/DataProvider/testData.xlsx");


		XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
		XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(0);
		int rowNum = xssfSheet.getLastRowNum();
		int colNum = xssfSheet.getRow(1).getLastCellNum();

		Object[][] data = new Object[rowNum][colNum];
		for(int i = 1; i <= rowNum; i++) {

			for(int j = 0; j< colNum; j++) {

				data[i-1][j] = xssfSheet.getRow(i).getCell(j).getStringCellValue();

			}
		}

		return data;
	}
}
