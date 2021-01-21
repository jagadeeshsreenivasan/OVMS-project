import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.github.javafaker.Faker as Faker
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

Faker fake = new Faker()

String visitorFullName = fake.name().fullName()

String mobNumber = fake.phoneNumber().phoneNumber()

String placeName = fake.country().capital()

//String VisitorFirstName= fake.name().firstName()
String streetAddress = fake.address().streetAddress()

//println streetAddress+', '+placeName
WebUI.click(findTestObject('STG Env/Security guard_login/Add_ Visitor/Add Visitor'))

WebUI.setText(findTestObject('STG Env/Security guard_login/Add_ Visitor/Visitors Information/Enter_Visitor_Name'), visitorFullName)

WebUI.setText(findTestObject('STG Env/Security guard_login/Add_ Visitor/Visitors Information/Mobile Number'), mobNumber)

WebUI.setText(findTestObject('STG Env/Security guard_login/Add_ Visitor/Visitors Information/Place From'), (streetAddress + 
    ', ') + placeName)

WebUI.click(findTestObject('STG Env/Security guard_login/Add_ Visitor/Visitors Information/TO Meet dropdown'))

WebUI.click(findTestObject('STG Env/Security guard_login/Add_ Visitor/Visitors Information/Role Admin Team'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('STG Env/Security guard_login/Add_ Visitor/Visitors Information/NEXT Button'), 0)

WebUI.sendKeys(findTestObject('STG Env/Security guard_login/Add_ Visitor/Visitors Information/Purpose of Visit'), 'Weekend Visit')

WebUI.click(findTestObject('STG Env/Security guard_login/Add_ Visitor/Visitors Information/NEXT Button'))

WebUI.click(findTestObject('STG Env/Security guard_login/Add_ Visitor/Assets/Assets Tab_ First checkbox for Laptop'))

WebUI.setText(findTestObject('STG Env/Security guard_login/Add_ Visitor/Assets/Assets Tab _First Laptop Serial Number'), 
    'ASDDTY5654hhhnJHGGHjj')

WebUI.click(findTestObject('STG Env/Security guard_login/Add_ Visitor/Assets/Assets Tab_First Laptop toggle'))

WebUI.click(findTestObject('STG Env/Security guard_login/Add_ Visitor/Assets/Assets Tab_First ADD LAPTOP'))

WebUI.setText(findTestObject('STG Env/Security guard_login/Add_ Visitor/Assets/Assets Tab_Second_ADD LAPTOP Serial Number'), 
    'ZXccFFGGggTree55fGGGcFfgg')

WebUI.click(findTestObject('STG Env/Security guard_login/Add_ Visitor/Assets/Assets Tab_Second laptop serial number Laptop Toggle'))

WebUI.click(findTestObject('STG Env/Security guard_login/Add_ Visitor/Assets/Assets Tab_Second Serial Number REMOVE LAPTOP'))

WebUI.scrollToElement(findTestObject('STG Env/Security guard_login/Add_ Visitor/Assets/Assets SAVE Button'), 0)

WebUI.click(findTestObject('STG Env/Security guard_login/Add_ Visitor/Assets/Mobile Checkbox'))

WebUI.doubleClick(findTestObject('STG Env/Security guard_login/Add_ Visitor/Assets/Mobile increment'))

WebUI.click(findTestObject('STG Env/Security guard_login/Add_ Visitor/Assets/Mobile Toggle'))

WebUI.click(findTestObject('STG Env/Security guard_login/Add_ Visitor/Assets/Bag checkbox'))

WebUI.click(findTestObject('STG Env/Security guard_login/Add_ Visitor/Assets/Bag increment'))

WebUI.click(findTestObject('STG Env/Security guard_login/Add_ Visitor/Assets/Bag Toggle'))

WebUI.setText(findTestObject('STG Env/Security guard_login/Add_ Visitor/Assets/Other Assets Comment box'), 'Pendrive, Headset, Charger')

WebUI.click(findTestObject('STG Env/Security guard_login/Add_ Visitor/Assets/Assets SAVE Button'))

WebUI.click(findTestObject('STG Env/Security guard_login/Add_ Visitor/Assets/Confirmation OK Button'))

