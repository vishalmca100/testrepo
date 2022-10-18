import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://marketplace.iihtsrt.com/')

WebUI.openBrowser('')

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://marketplace.iihtsrt.com/')

WebUI.click(findTestObject('Object Repository/Page_Home - Yaathi- Marketplace/a_Login'))

WebUI.setText(findTestObject('Object Repository/Page_Home - Yaathi- Marketplace/input_Login_email'), 'admin@admin.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Home - Yaathi- Marketplace/input_Login_password'), 'RAIVpflpDOg=')

WebUI.click(findTestObject('Object Repository/Page_Home - Yaathi- Marketplace/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home - Yaathi- Marketplace/img'))

WebUI.click(findTestObject('Object Repository/Page_Home - Yaathi- Marketplace/a_Admin Panel'))

WebUI.click(findTestObject('Object Repository/Page_Admin Panel - Yaathi/span_Navigation'))

WebUI.click(findTestObject('Object Repository/Page_Navigation - Yaathi/a_Orders'))

WebUI.click(findTestObject('Object Repository/Page_Navigation - Yaathi/a_Slider'))

WebUI.setText(findTestObject('Object Repository/Page_Slider Items - Yaathi/input_Title_title'), 'WONDERFUL PRODUCTS')

WebUI.setText(findTestObject('Object Repository/Page_Slider Items - Yaathi/textarea_Description_description'), 'THIS IS A QUALITY PRODUCTS.')

WebUI.setText(findTestObject('Object Repository/Page_Slider Items - Yaathi/input_Link_link'), 'www.wonderfulquality.com')

WebUI.setText(findTestObject('Object Repository/Page_Slider Items - Yaathi/input_Order_item_order'), '100')

WebUI.setText(findTestObject('Object Repository/Page_Slider Items - Yaathi/input_Button Text_button_text'), '15')

WebUI.click(findTestObject('Object Repository/Page_Slider Items - Yaathi/button_Add Slider Item'))

WebUI.click(findTestObject('Object Repository/Page_Slider Items - Yaathi/button_Save Changes'))

WebUI.click(findTestObject('Object Repository/Page_Slider Items - Yaathi/button_Select an option'))

