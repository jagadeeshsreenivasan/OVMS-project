import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.github.javafaker.Faker as Faker
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

Faker fake = new Faker()

//String SAFirstName = fake.name().firstName()
//String SALastName = fake.name().lastName()
String mobNumber = fake.phoneNumber().phoneNumber()

WebUI.click(findTestObject('STG Env/Super_admin_Login/Settings/Profile_Settings/Settings Menu'))

WebUI.setText(findTestObject('STG Env/Super_admin_Login/Settings/Profile_Settings/Profile Settings First Name'), '')

WebUI.setText(findTestObject('STG Env/Super_admin_Login/Settings/Profile_Settings/Profile Setting Last Name'), '')

WebUI.setText(findTestObject('STG Env/Super_admin_Login/Settings/Profile_Settings/Profile Setting Mobile Number'), mobNumber)

WebUI.click(findTestObject('STG Env/Super_admin_Login/Settings/Profile_Settings/Location Dropdown'))

WebUI.click(findTestObject('STG Env/Super_admin_Login/Settings/Profile_Settings/Location Chennai'))

WebUI.scrollToElement(findTestObject('STG Env/Super_admin_Login/Settings/Profile_Settings/Profile Settings SAVE Button'), 
    0)

WebUI.click(findTestObject('STG Env/Super_admin_Login/Settings/Profile_Settings/Profile Settings SAVE Button'))

WebUI.click(findTestObject('STG Env/Super_admin_Login/Settings/Profile_Settings/Confirmation OK Button'))

WebUI.scrollToElement(findTestObject('STG Env/Super_admin_Login/Settings/Profile_Settings/Settings Label'), 0)

