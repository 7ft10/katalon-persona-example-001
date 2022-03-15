package operations
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.context.TestSuiteContext

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

class Insurance {

	@Given("I have all my details handy")
	def IHaveAllMyDetailsHandy() {
		WebUI.callTestCase(findTestCase("Test Cases/steps/I have all my details handy"), GlobalVariable.TEST_CASE_CONTEXT.getTestCaseVariables() ?: [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Given("I have a new bike that is not currently insured")
	def IHaveANewBikeThatIsNotCurrentlyInsured() {
		WebUI.callTestCase(findTestCase("Test Cases/steps/I have a new bike that is not currently insured"), GlobalVariable.TEST_CASE_CONTEXT.getTestCaseVariables() ?: [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("I apply to purchase my policy")
	def IApplyToPurchaseMyPolicy() {
		WebUI.callTestCase(findTestCase("Test Cases/steps/I apply to purchase my policy"), GlobalVariable.TEST_CASE_CONTEXT.getTestCaseVariables() ?: [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("I should be able to pay for my new policy")
	def IShouldBeAbleToPayForMyNewPolicy() {
		WebUI.callTestCase(findTestCase("Test Cases/steps/I should be able to pay for my new policy"), GlobalVariable.TEST_CASE_CONTEXT.getTestCaseVariables() ?: [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("ensure that my bike is covered for any damage")
	def EnsureThatMyBikeIsCoveredForAnyDamage() {
		WebUI.callTestCase(findTestCase("Test Cases/steps/ensure that my bike is covered any damage"), GlobalVariable.TEST_CASE_CONTEXT.getTestCaseVariables() ?: [:], FailureHandling.STOP_ON_FAILURE)
	}
}