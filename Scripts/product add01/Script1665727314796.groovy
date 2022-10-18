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

WebUI.click(findTestObject('Object Repository/PRODUCTS ADD 01/Page_Home - Yaathi- Marketplace/a_Login'))

WebUI.setText(findTestObject('Object Repository/PRODUCTS ADD 01/Page_Home - Yaathi- Marketplace/input_Login_email'), 'admin@admin.com')

WebUI.setEncryptedText(findTestObject('Object Repository/PRODUCTS ADD 01/Page_Home - Yaathi- Marketplace/input_Login_password'), 
    'RAIVpflpDOg=')

WebUI.click(findTestObject('Object Repository/PRODUCTS ADD 01/Page_Home - Yaathi- Marketplace/a_Admin Panel'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/PRODUCTS ADD 01/Page_Admin Panel - Yaathi/a_Products'))

WebUI.click(findTestObject('Object Repository/PRODUCTS ADD 01/Page_Admin Panel - Yaathi/a_Deleted Products'))

WebUI.click(findTestObject('Object Repository/PRODUCTS ADD 01/Page_Deleted Products - Yaathi/td'))

WebUI.click(findTestObject('Object Repository/PRODUCTS ADD 01/Page_Deleted Products - Yaathi/input_Options_checkbox-table'))

WebUI.click(findTestObject('Object Repository/PRODUCTS ADD 01/Page_Deleted Products - Yaathi/button_Delete'))

WebUI.click(findTestObject('Object Repository/PRODUCTS ADD 01/Page_Deleted Products - Yaathi/button_OK'))

WebUI.click(findTestObject('Object Repository/PRODUCTS ADD 01/Page_Deleted Products - Yaathi/a_Add Product'))

WebUI.switchToWindowTitle('Add Product - Dashboard - Yaathi')

WebUI.selectOptionByValue(findTestObject('Object Repository/PRODUCTS ADD 01/Page_Add Product - Dashboard - Yaathi/select_Select Category                     _27f86f'), 
    '337', true)

WebUI.click(findTestObject('Object Repository/PRODUCTS ADD 01/Page_Add Product - Dashboard - Yaathi/a_Details'))

WebUI.click(findTestObject('Object Repository/PRODUCTS ADD 01/Page_Add Product - Dashboard - Yaathi/a_Details'))

WebUI.click(findTestObject('Object Repository/PRODUCTS ADD 01/Page_Add Product - Dashboard - Yaathi/a_Details'))

WebUI.click(findTestObject('Object Repository/PRODUCTS ADD 01/Page_Add Product - Dashboard - Yaathi/a_Details'))

WebUI.setText(findTestObject('Object Repository/PRODUCTS ADD 01/Page_Add Product - Dashboard - Yaathi/input_Title_title_1'), 
    'BEAUTY PRODUCTS')

WebUI.click(findTestObject('Object Repository/PRODUCTS ADD 01/Page_Add Product - Dashboard - Yaathi/button_Add Image'))

WebUI.doubleClick(findTestObject('Object Repository/PRODUCTS ADD 01/Page_Add Product - Dashboard - Yaathi/img_Reset_img-responsive'))

WebUI.setText(findTestObject('Object Repository/PRODUCTS ADD 01/Page_Add Product - Dashboard - Yaathi/bodytinymce'), '<p><img src="https://marketplace.iihtsrt.com/uploads/images-file-manager/202207/img_62de31bbd20da6-68832512-54727746.jpg" alt="" data-mce-src="https://marketplace.iihtsrt.com/uploads/images-file-manager/202207/img_62de31bbd20da6-68832512-54727746.jpg"></p><div id="katalon" style="top: 226px;"><div id="katalon-rec_elementInfoDiv" style="display: none;"></div></div>')

WebUI.setText(findTestObject('Object Repository/PRODUCTS ADD 01/Page_Add Product - Dashboard - Yaathi/input_SEO_seo_title_1'), 
    'BEAUTY ')

WebUI.setText(findTestObject('Object Repository/PRODUCTS ADD 01/Page_Add Product - Dashboard - Yaathi/input_SEO_seo_description_1'), 
    'AMAZING')

WebUI.setText(findTestObject('Object Repository/PRODUCTS ADD 01/Page_Add Product - Dashboard - Yaathi/input_SEO_seo_keywords_1'), 
    'MARCELLOUS')

WebUI.click(findTestObject('Object Repository/PRODUCTS ADD 01/Page_Add Product - Dashboard - Yaathi/button_Save and Continue'))

WebUI.click(findTestObject('Object Repository/PRODUCTS ADD 01/Page_Add Product - Dashboard - Yaathi/input_(Product Code)_sku'))

WebUI.click(findTestObject('Object Repository/PRODUCTS ADD 01/Page_Add Product - Dashboard - Yaathi/button_Generate'))

WebUI.setText(findTestObject('Object Repository/PRODUCTS ADD 01/Page_Add Product - Dashboard - Yaathi/input_(Product Code)_sku'), 
    'G1T20222970')

WebUI.setText(findTestObject('Object Repository/PRODUCTS ADD 01/Page_Add Product - Dashboard - Yaathi/input__price'), '1000')

WebUI.selectOptionByValue(findTestObject('Object Repository/PRODUCTS ADD 01/Page_Add Product - Dashboard - Yaathi/select_Select                              _fd3019'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PRODUCTS ADD 01/Page_Add Product - Dashboard - Yaathi/select_Select                              _7816d6'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/PRODUCTS ADD 01/Page_Add Product - Dashboard - Yaathi/label_I have read and agree to the         _bbc44e'))

WebUI.click(findTestObject('Object Repository/PRODUCTS ADD 01/Page_Add Product - Dashboard - Yaathi/button_Submit'))

WebUI.click(findTestObject('Object Repository/PRODUCTS ADD 01/Page_Add Product - Dashboard - Yaathi/a_Bulk Product Upload'))

