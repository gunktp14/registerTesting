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

WebUI.navigateToUrl('https://www.gj.mahidol.ac.th/main/register/')

WebUI.click(findTestObject('Object Repository/Page_/a_Accept All'))

WebUI.click(findTestObject('Object Repository/Page_/i_02-849-6600_twf twf-ln-cross'))

WebUI.setText(findTestObject('Object Repository/Page_/input__user_login-667'), 'gunktp14')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_/input__user_password-667'), 'ZNgM1BKsgCNVLk/nFaWzig==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_/input_Confirm_confirm_user_password-667'), 'ZNgM1BKsgCNVLk/nFaWzig==')

WebUI.setText(findTestObject('Object Repository/Page_/input__user_email-667'), '644259003@webmail.npru.ac.th')

WebUI.setText(findTestObject('Object Repository/Page_/input__first_name-667'), 'กัตพัตร์')

firstName = WebUI.getAttribute(findTestObject('Page_/input__first_name-667'), 'value')

WebUI.setText(findTestObject('Object Repository/Page_/input__last_name-667'), 'สมหวัง')

lastName = WebUI.getAttribute(findTestObject('Page_/input__last_name-667'), 'value')

WebUI.setText(findTestObject('Object Repository/Page_/input_Name (English)_first_name_en-667'), 'Kuttapat')

eng_firstName = WebUI.getAttribute(findTestObject('Page_/input_Name (English)_first_name_en-667'), 'value')

WebUI.setText(findTestObject('Object Repository/Page_/input_Last name (English)_Last_name_en-667'), 'Somwang')

eng_lastName = WebUI.getAttribute(findTestObject('Page_/input_Last name (English)_Last_name_en-667'), 'value')

WebUI.setText(findTestObject('Object Repository/Page_/input__id-667'), '3476682321261')

attributeNumber = WebUI.getAttribute(findTestObject('Page_/input__id-667'), 'value')

WebUI.click(findTestObject('Object Repository/Page_/div_-'))

WebUI.setText(findTestObject('Object Repository/Page_/input_-_father_name-667'), 'สมชาย สมหวัง')

fatherName = WebUI.getAttribute(findTestObject('Page_/input_-_father_name-667'), 'value')

WebUI.setText(findTestObject('Object Repository/Page_/input_-_mother_name-667'), 'สมหญิง สมหวัง')

motherName = WebUI.getAttribute(findTestObject('Page_/input_-_mother_name-667'), 'value')

WebUI.setText(findTestObject('Object Repository/Page_/input__house_number-667'), '270')

house = WebUI.getAttribute(findTestObject('Object Repository/Page_/input__house_number-667'), 'value')

WebUI.setText(findTestObject('Object Repository/Page_/input__moo-667'), '9')

moo = WebUI.getAttribute(findTestObject('Object Repository/Page_/input__moo-667'), 'value')

WebUI.setText(findTestObject('Object Repository/Page_/input__alley-667'), 'เจริญดี 5')

alley = WebUI.getAttribute(findTestObject('Object Repository/Page_/input__alley-667'), 'value')

WebUI.setText(findTestObject('Object Repository/Page_/input__village-667'), '-')

WebUI.setText(findTestObject('Object Repository/Page_/input__street-667'), '-')

WebUI.setText(findTestObject('Object Repository/Page_/input__sub_district-667'), 'ลำพยา')

sub_district = WebUI.getAttribute(findTestObject('Object Repository/Page_/input__sub_district-667'), 'value')

WebUI.setText(findTestObject('Object Repository/Page_/input__district-667'), 'เมืองนครปฐม')

district = WebUI.getAttribute(findTestObject('Object Repository/Page_/input__district-667'), 'value')

WebUI.setText(findTestObject('Object Repository/Page_/input__postal_code-667'), '73000')

postal_code = WebUI.getAttribute(findTestObject('Object Repository/Page_/input__postal_code-667'), 'value')

WebUI.setText(findTestObject('Object Repository/Page_/input__phone_home-667'), '034254583')

phone_home = WebUI.getAttribute(findTestObject('Object Repository/Page_/input__phone_home-667'), 'value')

WebUI.setText(findTestObject('Object Repository/Page_/input__phone_number-667'), '0979603214')

phone_number = WebUI.getAttribute(findTestObject('Object Repository/Page_/input__phone_number-667'), 'value')

WebUI.setText(findTestObject('Object Repository/Page_/input__related_as-667'), 'ป้า')

WebUI.setText(findTestObject('Object Repository/Page_/input_-_ralated_name-667'), 'สมป้า สมหวัง')

WebUI.click(findTestObject('Object Repository/Page_/i_-_um-icon-android-checkbox-outline-blank'))

WebUI.click(findTestObject('Object Repository/Page_/i__um-icon-android-radio-button-off'))

WebUI.click(findTestObject('Object Repository/Page_/i__um-icon-android-radio-button-off_1'))

WebUI.click(findTestObject('Object Repository/Page_/span__um-field-radio-state'))

WebUI.click(findTestObject('Object Repository/Page_/i__um-icon-android-checkbox-outline-blank'))

WebUI.click(findTestObject('Object Repository/Page_/i_Email_um-icon-android-checkbox-outline-blank'))

WebUI.verifyEqual(attributeNumber, '3476682321261')

WebUI.verifyEqual(firstName, 'กัตพัตร์')

WebUI.verifyEqual(lastName, 'สมหวัง')

WebUI.verifyEqual(eng_firstName, 'Kuttapat')

WebUI.verifyEqual(eng_lastName, 'Somwang')

WebUI.verifyEqual(fatherName, 'สมชาย สมหวัง')

WebUI.verifyEqual(motherName, 'สมหญิง สมหวัง')

WebUI.verifyEqual(house, '270')

WebUI.verifyEqual(moo, '9')

WebUI.verifyEqual(alley, 'เจริญดี 5')

WebUI.verifyEqual(sub_district, 'ลำพยา')

WebUI.verifyEqual(postal_code, '73000')

WebUI.verifyEqual(phone_home, '034254583')

WebUI.verifyEqual(phone_number, '0979603214')

WebUI.closeBrowser()

