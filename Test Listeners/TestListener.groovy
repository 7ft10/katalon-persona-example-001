import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.context.TestSuiteContext
import com.kms.katalon.core.context.TestCaseContext

import internal.GlobalVariable as GlobalVariable

class TestListener {
	
	@BeforeTestSuite
	def beforeTestSuite(TestSuiteContext testSuiteContext) {
		GlobalVariable.TEST_SUITE_CONTEXT = testSuiteContext
	}
	
	@BeforeTestCase
	def beforeTestCase(TestCaseContext testCaseContext) {
		GlobalVariable.TEST_CASE_CONTEXT = testCaseContext
	}
}